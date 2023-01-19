import JNDI.Creneaux;
import JNDI.CreneauxImplementation;
import JNDI.GestionCabinier;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class CreneauxForm extends JPanel {
    private GestionCabinier<Creneaux> creneauxGestion;

    private JTextField idField;
    private JTextField versionField;
    private JTextField hDebutField;
    private JTextField mDebutField;
    private JTextField hFinField;
    private JTextField mFinField;
    private JTextField idMedecinField;
    private JButton addButton;
    private JButton readButton;
    private JButton updateButton;
    private JButton deleteButton;
    private JButton showAllButton;
    private JTextArea outputArea;

    public CreneauxForm() {
        setLayout(new BorderLayout());

        creneauxGestion = new CreneauxImplementation();

        idField = new JTextField(15);
        versionField = new JTextField(15);
        hDebutField = new JTextField(15);
        mDebutField = new JTextField(15);
        hFinField = new JTextField(15);
        mFinField = new JTextField(15);
        idMedecinField = new JTextField(15);

        addButton = new JButton("Add");
        readButton = new JButton("Read");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");
        showAllButton = new JButton("Show All");

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        outputArea.setLineWrap(true);

        addButton.addActionListener(e -> addCreneaux());
        readButton.addActionListener(e -> readCreneaux());
        updateButton.addActionListener(e -> updateCreneaux());
        deleteButton.addActionListener(e -> deleteCreneaux());
        showAllButton.addActionListener(e -> showAllCreneaux());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(7, 2));
        inputPanel.add(new JLabel("ID:"));
        inputPanel.add(idField);
        inputPanel.add(new JLabel("Version:"));
        inputPanel.add(versionField);
        inputPanel.add(new JLabel("Hour Start:"));
        inputPanel.add(hDebutField);
        inputPanel.add(new JLabel("Minute Start:"));
        inputPanel.add(mDebutField);
        inputPanel.add(new JLabel("Hour End:"));
        inputPanel.add(hFinField);
        inputPanel.add(new JLabel("Minute End:"));
        inputPanel.add(mFinField);
        inputPanel.add(new JLabel("Medecin ID:"));
        inputPanel.add(idMedecinField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(addButton);
        buttonPanel.add(readButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(showAllButton);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        mainPanel.add(outputArea, BorderLayout.SOUTH);

        add(mainPanel);
    }

    private void addCreneaux() {
        try {
            int id = Integer.parseInt(idField.getText());
            int version = Integer.parseInt(versionField.getText());
            int hDebut = Integer.parseInt(hDebutField.getText());
            int mDebut = Integer.parseInt(mDebutField.getText());
            int hFin = Integer.parseInt(hFinField.getText());
            int mFin = Integer.parseInt(mFinField.getText());
            int idMedecin = Integer.parseInt(idMedecinField.getText());

            Creneaux creneau = new Creneaux(id, version, hDebut, mDebut, hFin, mFin, idMedecin);
            creneauxGestion.AddT(creneau);

            outputArea.setText("Creneau added successfully!");
        } catch (NumberFormatException | SQLException e) {
            outputArea.setText("Error adding Creneau: " + e.getMessage());
        }
    }

    private void readCreneaux() {
        try {
            int id = Integer.parseInt(idField.getText());
            Creneaux creneau = creneauxGestion.getT(id);

            outputArea.setText("ID: " + creneau.getId() +
                    "\nVersion: " + creneau.getVersion() +
                    "\nHour Start: " + creneau.gethDebut() +
                    "\nMinute Start: " + creneau.getmDebut() +
                    "\nHour End: " + creneau.gethFin() +
                    "\nMinute End: " + creneau.getmFin() +
                    "\nMedecin ID: " +creneau.getId_Medecin());
        } catch (NumberFormatException | SQLException e) {
            outputArea.setText("Error reading Creneau: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void updateCreneaux() {
        try {
            int id = Integer.parseInt(idField.getText());
            int version = Integer.parseInt(versionField.getText());
            int hDebut = Integer.parseInt(hDebutField.getText());
            int mDebut = Integer.parseInt(mDebutField.getText());
            int hFin = Integer.parseInt(hFinField.getText());
            int mFin = Integer.parseInt(mFinField.getText());
            int idMedecin = Integer.parseInt(idMedecinField.getText());

            Creneaux creneau = new Creneaux(id, version, hDebut, mDebut, hFin, mFin, idMedecin);
            creneauxGestion.updateT(creneau, id);

            outputArea.setText("Creneau updated successfully!");
        } catch (NumberFormatException | SQLException e) {
            outputArea.setText("Error updating Creneau: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void deleteCreneaux() {
        try {
            int id = Integer.parseInt(idField.getText());
            creneauxGestion.deleteT(id);

            outputArea.setText("Creneau deleted successfully!");
        } catch (NumberFormatException | SQLException e) {
            outputArea.setText("Error deleting Creneau: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showAllCreneaux() {
        try {
            List<Creneaux> creneauxList = creneauxGestion.getAllTs();

            StringBuilder result = new StringBuilder("All Creneaux:\n");
            for (Creneaux creneau : creneauxList) {
                result.append("ID: ").append(creneau.getId())
                        .append(", Hour Start: ").append(creneau.gethDebut())
                        .append(", Minute Start: ").append(creneau.getmDebut())
                        .append(", Hour End: ").append(creneau.gethFin())
                        .append(", Minute End: ").append(creneau.getmFin())
                        .append(", Medecin ID: ").append(creneau.getId_Medecin())
                        .append("\n");
            }

            outputArea.setText(result.toString());
        } catch (SQLException e) {
            outputArea.setText("Error retrieving Creneaux: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

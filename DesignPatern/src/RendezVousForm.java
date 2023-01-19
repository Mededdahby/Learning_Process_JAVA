import JNDI.GestionCabinier;
import JNDI.Rendez;
import JNDI.RendezVousImplementation;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public class RendezVousForm extends JPanel {
    private GestionCabinier<Rendez> rendezVousGestion;

    private JTextField idField;
    private JTextField jourField;
    private JTextField idClientField;
    private JTextField idCreneauField;
    private JButton addButton;
    private JButton readButton;
    private JButton updateButton;
    private JButton deleteButton;
    private JButton showAllButton;
    private JTextArea outputArea;

    public RendezVousForm() {
        setLayout(new BorderLayout());

        rendezVousGestion = new RendezVousImplementation();

        idField = new JTextField(15);
        jourField = new JTextField(15);
        idClientField = new JTextField(15);
        idCreneauField = new JTextField(15);

        addButton = new JButton("Add");
        readButton = new JButton("Read");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");
        showAllButton = new JButton("Show All");

        outputArea = new JTextArea();
        outputArea.setEditable(false);

        addButton.addActionListener(e -> addRendezVous());
        readButton.addActionListener(e -> readRendezVous());
        updateButton.addActionListener(e -> updateRendezVous());
        deleteButton.addActionListener(e -> deleteRendezVous());
        showAllButton.addActionListener(e -> showAllRendezVous());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(6, 2));
        inputPanel.add(new JLabel("ID:"));
        inputPanel.add(idField);
        inputPanel.add(new JLabel("Day (YYYY-MM-DD):"));
        inputPanel.add(jourField);
        inputPanel.add(new JLabel("Client ID:"));
        inputPanel.add(idClientField);
        inputPanel.add(new JLabel("Creneau ID:"));
        inputPanel.add(idCreneauField);
        inputPanel.add(addButton);
        inputPanel.add(readButton);
        inputPanel.add(updateButton);
        inputPanel.add(deleteButton);
        inputPanel.add(showAllButton);

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);
    }

    private void addRendezVous() {
        try {
            int id = Integer.parseInt(idField.getText());
            Date jour = Date.valueOf(jourField.getText());
            int idClient = Integer.parseInt(idClientField.getText());
            int idCreneau = Integer.parseInt(idCreneauField.getText());

            Rendez rendezVous = new Rendez(id, jour, idClient, idCreneau);
            rendezVousGestion.AddT(rendezVous);

            outputArea.setText("RendezVous added successfully!");
        } catch (NumberFormatException | SQLException e) {
            outputArea.setText("Error adding RendezVous: " + e.getMessage());
        }
    }

    private void readRendezVous() {
        try {
            int id = Integer.parseInt(idField.getText());
            Rendez rendezVous = rendezVousGestion.getT(id);

            outputArea.setText("ID: " + rendezVous.getId() +
                    "\nDay: " + rendezVous.getJour() +
                    "\nClient ID: " +
                    "\nCreneau ID: " );
        } catch (NumberFormatException | SQLException e) {
            outputArea.setText("Error reading RendezVous: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void updateRendezVous() {
        try {
            int id = Integer.parseInt(idField.getText());
            Date jour = Date.valueOf(jourField.getText());
            int idClient = Integer.parseInt(idClientField.getText());
            int idCreneau = Integer.parseInt(idCreneauField.getText());

            Rendez rendezVous = new Rendez(id, jour, idClient, idCreneau);
            rendezVousGestion.updateT(rendezVous, id);

            outputArea.setText("RendezVous updated successfully!");
        } catch (NumberFormatException | SQLException e) {
            outputArea.setText("Error updating RendezVous: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void deleteRendezVous() {
        try {
            int id = Integer.parseInt(idField.getText());
            rendezVousGestion.deleteT(id);

            outputArea.setText("RendezVous deleted successfully!");
        } catch (NumberFormatException | SQLException e) {
            outputArea.setText("Error deleting RendezVous: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showAllRendezVous() {
        try {
            List<Rendez> rendezVousList = rendezVousGestion.getAllTs();

            StringBuilder result = new StringBuilder("All RendezVous:\n");
            for (Rendez rendezVous : rendezVousList) {
                result.append("ID: ").append(rendezVous.getId())
                        .append(", Day: ").append(rendezVous.getJour())
                        .append(", Client ID: ").append(rendezVous.getId_Client() )
                        .append(", Creneau ID: ").append(rendezVous.getId_Creneau())
                        .append("\n");
            }

            outputArea.setText(result.toString());
        } catch (SQLException e) {
            outputArea.setText("Error retrieving RendezVous: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

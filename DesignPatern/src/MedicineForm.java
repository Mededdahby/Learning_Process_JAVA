import JNDI.GestionCabinier;
import JNDI.Medicine;
import JNDI.MedicineImplementation;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class MedicineForm extends JPanel {
    private GestionCabinier<Medicine> medicineGestion;

    private JTextField idField;
    private JTextField versionField;
    private JTextField titreField;
    private JTextField nomField;
    private JTextField prenomField;
    private JButton addButton;
    private JButton readButton;
    private JButton updateButton;
    private JButton deleteButton;
    private JButton showAllButton;
    private JTextArea outputArea;

    public MedicineForm() {
        setLayout(new BorderLayout());

        medicineGestion = new MedicineImplementation();

        idField = new JTextField(15);
        versionField = new JTextField(15);
        titreField = new JTextField(15);
        nomField = new JTextField(15);
        prenomField = new JTextField(15);

        addButton = new JButton("Add");
        readButton = new JButton("Read");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");
        showAllButton = new JButton("Show All");

        outputArea = new JTextArea();
        outputArea.setEditable(false);

        addButton.addActionListener(e -> addMedicine());
        readButton.addActionListener(e -> readMedicine());
        updateButton.addActionListener(e -> updateMedicine());
        deleteButton.addActionListener(e -> deleteMedicine());
        showAllButton.addActionListener(e -> showAllMedicines());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(7, 2));
        inputPanel.add(new JLabel("ID:"));
        inputPanel.add(idField);
        inputPanel.add(new JLabel("Version:"));
        inputPanel.add(versionField);
        inputPanel.add(new JLabel("Title:"));
        inputPanel.add(titreField);
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nomField);
        inputPanel.add(new JLabel("First Name:"));
        inputPanel.add(prenomField);
        inputPanel.add(addButton);
        inputPanel.add(readButton);
        inputPanel.add(updateButton);
        inputPanel.add(deleteButton);
        inputPanel.add(showAllButton);

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);
    }

    private void addMedicine() {
        try {
            int id = Integer.parseInt(idField.getText());
            int version = Integer.parseInt(versionField.getText());
            String titre = titreField.getText();
            String nom = nomField.getText();
            String prenom = prenomField.getText();

            Medicine medicine = new Medicine(id, version, titre, nom, prenom);
            medicineGestion.AddT(medicine);

            outputArea.setText("Medicine added successfully!");
        } catch (NumberFormatException | SQLException e) {
            outputArea.setText("Error adding Medicine: " + e.getMessage());
        }
    }

    private void readMedicine() {
        try {
            int id = Integer.parseInt(idField.getText());
            Medicine medicine = medicineGestion.getT(id);

            outputArea.setText("ID: " + medicine.getId() +
                    "\nVersion: " + medicine.getVersion() +
                    "\nTitle: " + medicine.getTitre() +
                    "\nName: " + medicine.getNom() +
                    "\nFirst Name: " + medicine.getPrenom());
        } catch (NumberFormatException | SQLException e) {
            outputArea.setText("Error reading Medicine: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void updateMedicine() {
        try {
            int id = Integer.parseInt(idField.getText());
            int version = Integer.parseInt(versionField.getText());
            String titre = titreField.getText();
            String nom = nomField.getText();
            String prenom = prenomField.getText();

            Medicine medicine = new Medicine(id, version, titre, nom, prenom);
            medicineGestion.updateT(medicine, id);

            outputArea.setText("Medicine updated successfully!");
        } catch (NumberFormatException | SQLException e) {
            outputArea.setText("Error updating Medicine: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void deleteMedicine() {
        try {
            int id = Integer.parseInt(idField.getText());
            medicineGestion.deleteT(id);

            outputArea.setText("Medicine deleted successfully!");
        } catch (NumberFormatException | SQLException e) {
            outputArea.setText("Error deleting Medicine: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showAllMedicines() {
        try {
            List<Medicine> medicineList = medicineGestion.getAllTs();

            StringBuilder result = new StringBuilder("All Medicines:\n");
            for (Medicine medicine : medicineList) {
                result.append("ID: ").append(medicine.getId())
                        .append(", Version: ").append(medicine.getVersion())
                        .append(", Title: ").append(medicine.getTitre())
                        .append(", Name: ").append(medicine.getNom())
                        .append(", First Name: ").append(medicine.getPrenom())
                        .append("\n");
            }

            outputArea.setText(result.toString());
        } catch (SQLException e) {
            outputArea.setText("Error retrieving Medicines: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

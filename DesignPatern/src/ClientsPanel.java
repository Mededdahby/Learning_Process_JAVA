import JNDI.ClientImplimentaion;
import JNDI.Clients;
import JNDI.GestionCabinier;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class ClientsPanel extends JPanel {
    private GestionCabinier<Clients> clientsGestion;

    private JTextField idField;
    private JTextField titleField;
    private JTextField nameField;
    private JTextField firstNameField;
    private JButton addButton;
    private JButton readButton;
    private JButton updateButton;
    private JButton deleteButton;
    private JButton showAllButton;
    private JTextArea outputArea;

    public ClientsPanel() {
        setLayout(new BorderLayout());

        clientsGestion = new ClientImplimentaion();

        idField = new JTextField(15);
        titleField = new JTextField(15);
        nameField = new JTextField(15);
        firstNameField = new JTextField(15);

        addButton = new JButton("Add");
        readButton = new JButton("Read");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");
        showAllButton = new JButton("Show All");

        outputArea = new JTextArea();
        outputArea.setEditable(false);

        addButton.addActionListener(e -> addClient());
        readButton.addActionListener(e -> readClient());
        updateButton.addActionListener(e -> updateClient());
        deleteButton.addActionListener(e -> deleteClient());
        showAllButton.addActionListener(e -> showAllClients());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(6, 2));
        inputPanel.add(new JLabel("ID:"));
        inputPanel.add(idField);
        inputPanel.add(new JLabel("Title:"));
        inputPanel.add(titleField);
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("First Name:"));
        inputPanel.add(firstNameField);
        inputPanel.add(addButton);
        inputPanel.add(readButton);
        inputPanel.add(updateButton);
        inputPanel.add(deleteButton);
        inputPanel.add(showAllButton);

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);
    }
    private void addClient() {
        try {
            int id = Integer.parseInt(idField.getText());
            String title = titleField.getText();
            String name = nameField.getText();
            String firstName = firstNameField.getText();

            Clients newClient = new Clients(id, title, name, firstName);
            clientsGestion.AddT(newClient);

            outputArea.setText("Client added successfully!");
        } catch (NumberFormatException | SQLException e) {
            outputArea.setText("Error adding client: " + e.getMessage());
        }
    }
    private void readClient() {
        try {
            int id = Integer.parseInt(idField.getText());
            Clients client = clientsGestion.getT(id);

            outputArea.setText("Read Client:\n" + client);
        } catch (NumberFormatException | SQLException e) {
            outputArea.setText("Error reading client: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void updateClient() {
        try {
            int id = Integer.parseInt(idField.getText());
            String title = titleField.getText();
            String name = nameField.getText();
            String firstName = firstNameField.getText();

            Clients updatedClient = new Clients(id, title, name, firstName);
            clientsGestion.updateT(updatedClient, id);

            outputArea.setText("Client updated successfully!");
        } catch (NumberFormatException | SQLException e) {
            outputArea.setText("Error updating client: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    
    private void deleteClient() {
        try {
            int id = Integer.parseInt(idField.getText());
            clientsGestion.deleteT(id);

            outputArea.setText("Client deleted successfully!");
        } catch (NumberFormatException | SQLException e) {
            outputArea.setText("Error deleting client: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void showAllClients() {
        try {
            List<Clients> clientsList = clientsGestion.getAllTs();

            StringBuilder result = new StringBuilder("All Clients:\n");
            for (Clients client : clientsList) {
                result.append(client).append("\n");
            }

            outputArea.setText(result.toString());
        } catch (SQLException e) {
            outputArea.setText("Error fetching clients: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

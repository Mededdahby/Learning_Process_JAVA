import JNDI.*;

import javax.swing.*;
import java.awt.*;

public class MedicalCenterApp extends JFrame {
    private JPanel mainPanel;
    private JPanel headerPanel;
    private GestionCabinier<Clients> clientsGestion;
    private GestionCabinier<Medicine> medicineGestion;
    private GestionCabinier<Rendez> rendezVousGestion;
    private GestionCabinier<Creneaux> creneauxGestion;

    public MedicalCenterApp() {
        setTitle("Medical Center Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainPanel = new JPanel();
        headerPanel = new JPanel();
        headerPanel.setLayout(new GridLayout(1, 4));

        clientsGestion = new ClientImplimentaion();
        medicineGestion = new MedicineImplementation();
        rendezVousGestion = new RendezVousImplementation();
        creneauxGestion = new CreneauxImplementation();

        // Create instances of the graphical interfaces
        ClientsPanel clientsPanel = new ClientsPanel();
        MedicineForm medicineForm = new MedicineForm();
        RendezVousForm rendezVousForm = new RendezVousForm();
        CreneauxForm creneauxForm = new CreneauxForm();

        // Add buttons to switch between panels
        addButton("Clients", clientsPanel);
        addButton("Medicine", medicineForm);
        addButton("RendezVous", rendezVousForm);
        addButton("Creneaux", creneauxForm);

        // Show ClientsPanel by default
        showPanel(clientsPanel);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(headerPanel, BorderLayout.NORTH);
        getContentPane().add(mainPanel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void addButton(String text, JPanel panel) {
        JButton button = new JButton(text);
        button.addActionListener(e -> showPanel(panel));
        headerPanel.add(button);
    }

    private void showPanel(JPanel panel) {
        mainPanel.removeAll();
        mainPanel.add(panel);
        mainPanel.revalidate();
        mainPanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MedicalCenterApp::new);
    }
}

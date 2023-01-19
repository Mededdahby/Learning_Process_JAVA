import javax.swing.*;
import java.awt.*;

public class CabinierMedicale extends JFrame {
    private JPanel panel ;
    private JButton click ;
    private Label label1 ;
    private Label label2 ;
    private Label label3 ;
    private Label label4 ;

    public CabinierMedicale( ){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300 , 300);
        panel = new JPanel();
        label1 = new Label("name");
        label2 = new Label("Prenom");
        label3 = new Label("age");
        label4 = new Label("titre");

        click = new JButton("Cilck me");
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(click);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CabinierMedicale() ;
    }

}

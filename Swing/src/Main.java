import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame  implements ActionListener {
    JButton bt1 ;
    JButton bt2 ;
    JButton bt3 ;

JPanel main_panel;
    public Main(){
        bt1 = new JButton("Click");
        bt2 = new JButton("B1");
        bt3 = new JButton("B2");
        main_panel = new JPanel();

        main_panel.add(bt1);
        main_panel.add(bt2);
        main_panel.add(bt3);
        add(main_panel);

        bt1.addActionListener(e -> getMessage());
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        addMouseListener(new MouseLinsten());

        setTitle("test Mouse");
        setBounds(500 , 100 , 450 ,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void getMessage(){
        String text = "Hello here";
        JOptionPane.showMessageDialog(this, text,
                "Hello", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void main(String[] args) {
       new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() ==bt2) System.out.println("action comes from bt1");
        if(e.getSource()==bt3) System.out.println("action comes from bt2");
    }
}
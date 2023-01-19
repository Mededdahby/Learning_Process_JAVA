package ClassIntern;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenitre extends JFrame {
    private JLabel jLabel;
    private JButton jButton;

    public Fenitre(){
        jLabel = new JLabel("compteur");
        jButton = new JButton("ok");
        setLayout(new BorderLayout());
        this.getContentPane().add(jLabel, BorderLayout.NORTH);
        this.getContentPane().add(jButton, BorderLayout.SOUTH);
        jButton.addActionListener(new Ecouteur());

    }

    public class  Ecouteur implements ActionListener {
        private int compteur;
        public Ecouteur(){
            this.compteur=0;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("hello");
        }
    }
}

package ActionsAndListeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends JFrame {
    JButton bt2 ;
    JButton bt3 ;
    JPanel main_panel;
    public Test(){
        bt2 = new JButton("B1");
        bt3 = new JButton("B2");
        main_panel = new JPanel();
        main_panel.add(bt2);
        main_panel.add(bt3);
        add(main_panel);

        //class anonym
    /*   bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hello");
            }
        });*/

        // lamda annotation
        bt2.addActionListener((ActionListener) ->{
            System.out.println("hello2");
        });

        bt3.addActionListener(new ActionListen1(this));



        setTitle("test Mouse");
        setBounds(500 , 100 , 450 ,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Test();
    }
}

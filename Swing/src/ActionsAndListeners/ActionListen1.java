package ActionsAndListeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ActionListen1 implements ActionListener {
    JFrame frame;
    public ActionListen1( JFrame frame){
        this.frame=frame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(" hello from testing actionListener ");
    }
}

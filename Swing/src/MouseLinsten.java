import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseLinsten implements MouseListener {
    private Component JFrame;

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        JOptionPane.showMessageDialog(JFrame,"Your corrdination are : "+ x +" "+ y ,
                "Hello", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Your corrdination are : "+ x +" "+ y);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Moba extends JComponent implements MouseListener{

  static JFrame frame = new JFrame();

  public Moba(){
    addMouseListener(this);
  }
  public void mouseClicked(MouseEvent e){}
  public void mouseEntered(MouseEvent e){}
  public void mouseExited(MouseEvent e){}
  public void mousePressed(MouseEvent e){}
  public void mouseReleased(MouseEvent e){}
  public static void main(String[] args){

    Moba game = new Moba();

    frame.add(game);
    frame.setSize(800, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);

  }
}

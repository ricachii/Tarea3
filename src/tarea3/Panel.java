
package tarea3;


import objeto.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class Panel extends JPanel implements MouseListener{
    
  private Expendedor E = new Expendedor(3,1500,600,50);
    private Comprador C =new Comprador(E,100,50);
    
    public Panel(){
        this.setBackground(Color.LIGHT_GRAY);
        addMouseListener(this);
    }
    public void paint(Graphics g){
        super.paint(g);
        if(E!=null)E.paint(g);
        if(C!=null)C.paint(g);
        
    }
    public void mouseClicked(MouseEvent e) {
    }
    public void mousePressed(MouseEvent e) {
          C.click(e.getX(),e.getY());
          repaint();
     
    }
    public void mouseReleased(MouseEvent e) {;}
    public void mouseEntered(MouseEvent e) {;}
    public void mouseExited(MouseEvent e) {;}
}

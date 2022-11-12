
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
    
  private Expendedor E = new Expendedor(3,1000,600,50);
  private Moneda1000 M = new Moneda1000();
    private Comprador C =new Comprador(M,E,3,50,50);
    
    public Panel(){
        this.setBackground(Color.LIGHT_GRAY);
    }
    public void paint(Graphics g){
        super.paint(g);
        if(E!=null)E.paint(g);
        if(C!=null)C.paint(g);
        if(M!=null)M.paint(g);
    }
    public void mouseClicked(MouseEvent e) {
    }
    public void mousePressed(MouseEvent e) {
      try {
          E.comprarBebida(M, 3);
          repaint();
      } catch (PagoIncorrectoException ex) {
          Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
      } catch (NoHayBebidaException ex) {
          Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
      } catch (PagoInsuficienteException ex) {
          Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    public void mouseReleased(MouseEvent e) {;}
    public void mouseEntered(MouseEvent e) {;}
    public void mouseExited(MouseEvent e) {;}
}

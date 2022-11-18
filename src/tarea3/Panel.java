
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
    
    private Expendedor E = new Expendedor(6,1000,600,50);
    private Moneda1000 M = new Moneda1000(100);
    private Comprador C =new Comprador(M,E,3,105,50);
    
    
    public Panel(){
        super();
        this.setBackground(Color.LIGHT_GRAY);
        addMouseListener(this);
    }
    public void paint(Graphics g){
        super.paint(g);
        if(E!=null)E.paint(g);
        if(C!=null)C.paint(g);
    
        
    }
    public void CompradorBebida(){
        
    }
    public Expendedor GetExp(){
        return E;
    }
    public void mouseClicked(MouseEvent e) {
    }
    public void mousePressed(MouseEvent e) {
        
        C.click(e.getX(),e.getY());
        repaint();
        System.out.println("press");
         
           
    }
    public void mouseReleased(MouseEvent e) {;}
    public void mouseEntered(MouseEvent e) {;}
    public void mouseExited(MouseEvent e) {;}
}


package tarea3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import objeto.ContenedorBebida;
import objeto.Expendedor;
import objeto.Moneda;
import objeto.Moneda1000;
import objeto.NoHayBebidaException;
import objeto.PagoIncorrectoException;
import objeto.PagoInsuficienteException;


public class Boton1 extends JButton {
    private Moneda mo;
   private ContenedorBebida cb;
   private Expendedor ex;
   private Panel mp;
   public Boton1(String n, Panel mp, Expendedor Ex){
     super(n);
     this.ex = Ex;
     this.mp = mp;
     this.addActionListener(new EscuchadorBotton());
   }
   private class EscuchadorBotton implements ActionListener {
     public void actionPerformed(ActionEvent ae) {
         try {
             ex.comprarBebida(new Moneda1000(100), 2);
         } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayBebidaException ex) {
             Logger.getLogger(Boton.class.getName()).log(Level.SEVERE, null, ex);
         }
         mp.repaint( );
     }
   }
}
   

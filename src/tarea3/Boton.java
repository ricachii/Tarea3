
package tarea3;
import objeto.ContenedorBebida;
import objeto.Expendedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import objeto.Moneda;
import objeto.Moneda1000;
import objeto.NoHayBebidaException;
import objeto.PagoIncorrectoException;
import objeto.PagoInsuficienteException;
import objeto.UseMoneda;

public class Boton extends JButton {
   private Moneda mo;
   private UseMoneda um;
   private ContenedorBebida cb;
   private Expendedor ex;
   private Panel mp;
   public Boton(String n, Panel mp, Expendedor Ex, UseMoneda u){
     super(n);
     this.ex = Ex;
     this.mp = mp;
     this.um = u;
     this.addActionListener(new EscuchadorBotton());
   }
   private class EscuchadorBotton implements ActionListener {
     public void actionPerformed(ActionEvent ae) {
         try {
             ex.comprarBebida(um.getMon(), 1);
         } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayBebidaException ex) {
             Logger.getLogger(Boton.class.getName()).log(Level.SEVERE, null, ex);
         }
         mp.repaint( );
     }
   }
}
    





package tarea3;


import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana extends JFrame {
    public Ventana(){
        this.setLayout(new BorderLayout());
        Panel m = new Panel();
        m.setLayout(null);
        this.add(m,BorderLayout.CENTER);
        Boton B = new Boton("Sale", m, m.GetExp(), m.getUse());
        B.setBounds(630, 370, 70, 30 );
        m.add(B);
        Boton1 B1 = new Boton1("Sprite", m, m.GetExp(), m.getUse());
        B1.setBounds(780, 370, 70, 30 );
        m.add(B1);
        Boton2 B2 = new Boton2("Fanta", m, m.GetExp(), m.getUse());
        B2.setBounds(950, 370, 70, 30 );
        m.add(B2);
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1200,720);
        this.setVisible(true);
    }
}
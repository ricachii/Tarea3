
package tarea3;


import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana extends JFrame {
    public Ventana(){
        setTitle("Tarea3");
        this.setLayout(new BorderLayout());
        Panel m = new Panel();
        m.setLayout(null);
        this.add(m,BorderLayout.CENTER);
        Boton B = new Boton("Cola", m, m.GetExp(), m.getUse());
        B.setBounds(630, 370, 70, 30 );
        B.setBackground(Color.RED);
        m.add(B);
        Boton1 B1 = new Boton1("Sprite", m, m.GetExp(), m.getUse());
        B1.setBounds(780, 370, 70, 30 );
        B1.setBackground(Color.GREEN);
        m.add(B1);
        Boton2 B2 = new Boton2("Fanta", m, m.GetExp(), m.getUse());
        B2.setBounds(950, 370, 70, 30 );
        B2.setBackground(Color.ORANGE);
        m.add(B2);
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1300,720);
        this.setVisible(true);
    }
}
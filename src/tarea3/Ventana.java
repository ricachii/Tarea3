
package tarea3;


import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana extends JFrame {
    public Ventana(){
        this.setLayout(new BorderLayout());          
        this.add(new Panel(),BorderLayout.CENTER);
        
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
<<<<<<< HEAD
        this.setSize(900,600);
=======
        this.setSize(1100,600);
>>>>>>> Mitad1
        this.setVisible(true);
    }
}
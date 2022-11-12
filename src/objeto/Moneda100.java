
package objeto;

import java.awt.Graphics;

public class Moneda100 extends Moneda {
<<<<<<< HEAD
    public Moneda100(){
        super();
=======
    public Moneda100(int n){
        super(n);
>>>>>>> Mitad1
    }
    public int getValor(){
        return 100;
    }
    
    public String tostring(){
        return "El numero de serie de la moneda es: " + getSerie() + " Y su valor es: "+ getValor();
    }
    @Override
    public void paint(Graphics g){
        
    }
}

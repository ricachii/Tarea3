
package objeto;

import java.awt.Graphics;

public class Moneda500 extends Moneda {
    public Moneda500(){
        super();
    }
    public int getValor(){
        return 500;
    }
      public String tostring(){
        return "El numero de serie de la moneda es: " + getSerie() + " Y su valor es: "+ getValor();
    }
    @Override
    public void paint(Graphics g){
        
    }
    
}

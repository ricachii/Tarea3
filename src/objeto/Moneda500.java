
package objeto;

import java.awt.Graphics;

public class Moneda500 extends Moneda {
  
    public Moneda500(int ser){
        super(ser);

    }
    @Override
    public void setPosicion(int a, int b){
        this.x = a;
        this.y = b;
    }
    @Override
    public int getValor(){
        return 500;
    }
      public String tostring(){
        return "El numero de serie de la moneda es: " + getSerie() + " Y su valor es: "+ getValor();
    }
    @Override
    public void paint(Graphics g){
        g.drawOval(x,y,50,50); 
        g.drawString("500", x+15, y+25);
    }
    
}


package objeto;

import java.awt.Graphics;

public class Moneda100 extends Moneda {

    public Moneda100(int ser){
        super(ser);

    }
    @Override
    public void setPosicion(int a, int b){
        this.x = a;
        this.y = b;
    }
    @Override
    public int getValor(){
        return 100;
    }
    
    public String tostring(){
        return "El numero de serie de la moneda es: " + getSerie() + " Y su valor es: "+ getValor();
    }
    @Override
    public void paint(Graphics g){
        g.drawOval(x,y,50,50);
        g.drawString("100", x+15, y+25);
    }
}

package objeto;

import java.awt.Color;
import java.awt.Graphics;


public class Moneda1000 extends Moneda{
  
    public Moneda1000(int ser){
        super(ser);
        
    }
    @Override
    public void setPosicion(int a, int b){
        this.x = a;
        this.y = b;
    }
    @Override
    public int getValor(){
        return 1000;
    }
    public String tostring(){
        return "El numero de serie de la moneda es: " + getSerie() + " Y su valor es: "+ getValor();
    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.GREEN);
        g.fillOval(x,y,50,50);
        g.setColor(Color.BLACK);        
        g.drawString("1000", x+15, y+25);
    }
}

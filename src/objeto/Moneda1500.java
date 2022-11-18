package objeto;

import java.awt.Graphics;




public class Moneda1500 extends Moneda{
    
    
    public Moneda1500(int ser){
        super(ser);
      
    }
    public int getValor(){

    return 1500;
    }
    public String tostring(){
        return "El numero de serie de la moneda es: " + getSerie() + " Y su valor es: "+ getValor();
    }
 
    public void paint(Graphics g) {
       
        g.drawOval(x,y,50,50); 
        g.drawString("1500", x+15, y+25);
        
    }
}
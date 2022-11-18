package objeto;

import java.awt.Color;
import java.awt.Graphics;

 public class Fanta extends Bebida{
     public Fanta(int Serie){
        super(Serie);
    }
    public String beber(){
        return new String("Fanta");
    }
    public void paint(Graphics g){
        g.setColor(Color.ORANGE);
        g.fillRect(x, y, 60, 30);   
        g.setColor(Color.BLUE);
        g.drawString(Serie+"", x+27, y+10);
    }
}

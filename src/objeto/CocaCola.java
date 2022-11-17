package objeto;

import java.awt.Color;
import java.awt.Graphics;

public class CocaCola extends Bebida{
    public CocaCola(int Serie){
        super(Serie);
    }
    public String beber(){
        return new String("Coca-cola");
    }
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(x,y,60,30);
        g.setColor(Color.BLACK);
        g.drawString("Coca-cola",x+4,y+16);
    }
   
}

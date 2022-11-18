package objeto;

import java.awt.Color;
import java.awt.Graphics;

public class Sprite extends Bebida{   
    public Sprite(int Serie){
        super(Serie);
    }
    public String beber(){
        return new String("Sprite");
    }
    public void paint(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(x,y,60,30);
        g.setColor(Color.WHITE);
        g.drawString(Serie+"", x+8, y+15);
    }
}


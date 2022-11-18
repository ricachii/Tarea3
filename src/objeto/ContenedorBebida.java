
package objeto;

import java.awt.Graphics;
import java.awt.Color;

 public class ContenedorBebida {
     private Bebida c;
     private int x,y;

    public ContenedorBebida(int a,int b) {
        this.c = null;  
        this.x = a;
        this.y = b;
    }
    public void setBebida(Bebida be){
        this.c=be;
    }
    public Bebida getBebida(){
        Bebida aa = c;
        c = null;
        return aa;
    }
    public void paint(Graphics g) {
        
        if(c != null){
            c.setPosicion(x+55, y+70);
            c.paint(g);
        }
            
        g.setColor(Color.BLACK);
        g.drawRect(x, y, 200, 100);
       
        
    }
}

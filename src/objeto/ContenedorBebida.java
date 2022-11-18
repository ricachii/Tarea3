
package objeto;

import java.awt.Graphics;
import java.awt.Color;

 class ContenedorBebida {
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
    public Bebida getBebida(int xx,int yy,ContenedorBebida C){
        return c;
    }
    public void paint(Graphics g) {
        if(c != null){
            c.setPosicion(x+55, y+70);
            c.paint(g);
        }
            
        
        g.drawRect(x, y, 200, 100);
       
        
    }
}

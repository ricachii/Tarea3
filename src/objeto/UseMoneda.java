
package objeto;

import java.awt.Graphics;



public class UseMoneda {
    private int x, y;
    private Moneda Mon;
    public UseMoneda(){
        
    }
    
    public void setMoneda(Moneda m, int a, int b){
        Mon = m;
        
        this.x = a;
        this.y = b;
        
    }
    public Moneda getMon(){
        Moneda aa = Mon;
        Mon = null;
        return aa;
    }
    
    public void paint(Graphics g){
        if(Mon != null){
            Mon.setPosicion(x, y);
            Mon.paint(g);
        }
        
    }
    
}

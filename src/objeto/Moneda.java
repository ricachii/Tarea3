package objeto;

import java.awt.Graphics;

public abstract class Moneda {
    protected int x,y;
    private int serie;
    public Moneda(int s){
        serie = s;
    }
    public void setPosicion(int a, int b){
        this.x = a;
        this.y = b;
    }
    public int getSerie(){
        return this.serie;
    }

   
    public abstract int getValor();
    public abstract void paint(Graphics g);
    
  
    

    
   
    
    
}


package objeto;

import java.awt.Graphics;

public abstract class Moneda {
    
    public Moneda(){
        
    }
    
    public int getSerie(){
        return this.hashCode();
    }

   
    public abstract int getValor();
    public abstract void paint(Graphics g);
    
  
    

    
   
    
    
}


package objeto;

import java.awt.Graphics;

public abstract class Moneda {
<<<<<<< HEAD
    
    public Moneda(){
        
    }
    
=======
    private int serie;
    protected int x;
    protected int y;
    
    public Moneda(int s){
        serie = s;
        
    }
    
    public void setPosicion(int a, int b){
        this.x = a;
        this.y = b;
    }
    
>>>>>>> Mitad1
    public int getSerie(){
        return this.hashCode();
    }

   
    public abstract int getValor();
    public abstract void paint(Graphics g);
    
  
    

    
   
    
    
}


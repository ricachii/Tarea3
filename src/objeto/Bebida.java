package objeto;
import java.awt.Graphics;

public abstract class Bebida{
    protected int Serie;
    protected int x;
    protected int y;
    
    public void setPosicion(int a, int b){
        this.x = a;
        this.y = b;
    }
    
    public Bebida(int serie) {
        this.Serie = serie;
    }
    public int getserie(){
        return Serie;
    }
    public abstract String beber();
    public abstract void paint(Graphics g);
}
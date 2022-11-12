package objeto;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DepositoVuelto {
    private int x;
    private int y;
    private ArrayList<Moneda> a1;
    private int vuelto;
    public DepositoVuelto(int a, int b){
        this.x = a;
        this.y = b;
        a1 = new ArrayList();
    }
    
    public void addMoneda(Moneda v){
        a1.add(v);
        
    }
    
    public Moneda getMoneda(){
        if(a1.size() == 0){
            return null;
        }else{
            return a1.remove(0);
        }
        
    }
   
    public boolean empty(){
       return a1.isEmpty();
    }
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.drawRect(x+15,y+10,120,300);
    }
}
   

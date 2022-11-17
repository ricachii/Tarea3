
package objeto;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Deposito {
    private ArrayList<Bebida> a1;
    private int x,y;
    private int vuelto;
    public Deposito(int a, int b){
        a1 = new ArrayList();
        this.x = a;
        this.y = b;
    }
    
    public void addBebida(Bebida v){
        a1.add(v);
        for(int i = 0; i < a1.size();i++){
            Bebida b1 = a1.get(i);
            b1.setPosicion(x+30, 50*i+y+20);
        }
    }
    
    public Bebida getBebida(){
        if(a1.size() == 0){
            return null;
        }
         Bebida b2 = a1.remove(0);
         for(int i = 0; i< a1.size(); i++){
             Bebida b1 = a1.get(i);
             b1.setPosicion(x+30,50*i+y+20);
        }
        return b2;
    }
    public int getSerie(){
        return a1.get(0).getserie();
    }
    
    public boolean empty(){
       return a1.isEmpty();
    }
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.drawRect(x+5,y+10,120,300);
        for (int i = 0; i < a1.size(); i++) {
            Bebida b = a1.get(i);
            b.paint(g);
        }
    }
}
    

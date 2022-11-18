
package objeto;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Deposito {
    private ArrayList<Bebida> a1;
    private int x,y,x1,y1;
    private int vuelto;
    public Deposito(int a, int b){
        a1 = new ArrayList();
        this.x = a;
        this.y = b;
        this.x1 = a;
        this.y1 = b;
    }
    
    public void addBebida(Bebida v){
        a1.add(v);
        
    }
    
    public Bebida getBebida(){
        if(a1.size() == 0){
            return null;
        }else{
            return a1.remove(0);
        
        }
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
           a1.get(i).setPosicion(x1+30,50*i+y1+20);
           a1.get(i).paint(g); 
        }       
    }
    
    public void llenarDep(Graphics g){
        if(a1.size() == 0){
            for (int i = 0; i < a1.size(); i++) {         
           a1.get(i).setPosicion(x1+30,50*i+y1+20);
           a1.get(i).paint(g); 
        }
       }
    }
    
    public void mover(){
        if(a1.size() == 0){
            y1 = 50;
        }else{ 
        y1 += 50;
        }
    }
}

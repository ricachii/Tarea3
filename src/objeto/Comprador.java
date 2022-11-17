package objeto;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Comprador {
    private String sabor;
    private int x;
    private int y;
    private Deposito depB;
    private DepositoVuelto depV;
    
    private int tipo, vueltocompleto = 0, serie;
    public Comprador(Moneda M, Expendedor e, int x,int a, int b) {      
        this.x = a;
        this.y = b;
        serie = e.getSerie(x);
        depB = new Deposito(x+10,y+10);
        depV = new DepositoVuelto(x+150,y+10);
        
        
        while(e.DepSize() != true){          
            vueltocompleto += e.getVuelto().getValor();
        }
       
    }
    
    public String queBebiste(){
        return sabor;
        
    }
    
    public int cuantoVuelto(){
        return vueltocompleto;
      
    }
    public int getSerie(){
        return serie;
    }
    public void paint(Graphics g){
        g.setColor(Color.cyan);
        g.fillOval(x,y+40,100,100);
        g.fillRect(x+35, y+120, 30, 250);
        g.fillRect(x-70, y+150, 250, 30);
        g.fillRect(x+34, y+300, 14, 200);
        g.fillRect(x+52, y+300, 15, 200);
        
        depB.paint(g);
        depV.paint(g);
    }
    
}
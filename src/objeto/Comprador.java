package objeto;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Graphics2D;

public class Comprador {
    private String sabor;
    private int x;
    private int y;
    private Expendedor E;
    private Deposito depB;
    private DepositoVuelto depV;
    private Moneda100 M;
    private Moneda500 M5;
    private Moneda1000 M10;
    
    private int tipo, vueltocompleto = 0, serie;
    public Comprador(Expendedor e, int a, int b) {      
        this.x = a;
        this.y = b;
        this.E = e;
        serie = e.getSerie(x);
        
        
        depB = new Deposito(x+10,y+10);
        depV = new DepositoVuelto(x+150,y+10);
        M = new Moneda100(x+30,y+350);
        M5= new Moneda500(x+90,y+350);
        M10= new Moneda1000(x+220,y+350);
      
        while(e.DepSize() != true){          
            vueltocompleto += e.getVuelto().getValor();
        }
       
    }
    
    public void click(int a,int b){
        if(a>=x && a<=x+300 && b>=y && b<=y+600){
            E.comprarBebida(new Moneda1500(), 2);
        }    
        if(a>=x+30&& a<=x+80 && b>=y+350 && b<=y+400){
        System.out.println("100");
        }
        if(a>=x+90&& a<=x+140 && b>=y+350 && b<=y+400){
        System.out.println("500");
        }
        if(a>=x+220&& a<=x+270 && b>=y+350 && b<=y+400){
        System.out.println("1000");
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
        g.drawRect(x,y,300,600);
        depB.paint(g);
        depV.paint(g);
        M.paint(g);
        M5.paint(g);
        M10.paint(g);
    }
    
}
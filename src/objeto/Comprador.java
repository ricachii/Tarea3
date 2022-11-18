package objeto;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Graphics2D;
import static java.lang.Math.max;
import static java.lang.Math.random;

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
    private ContenedorBebida C;
    private int ser1,ser2,ser3;
    private UseMoneda use;
    
    private int tipo, vueltocompleto = 0, serie;
    public Comprador(Moneda M1,Expendedor e,int Tipo, int a, int b) {      
        this.x = a;
        this.y = b;
        this.E = e;
        serie = e.getSerie(Tipo);
        
        
        depB = new Deposito(x+10,y+10);
        depV = new DepositoVuelto(x+150,y+10);
        M = new Moneda100(232);
        M.setPosicion(x+30, y+350);
        M5= new Moneda500(254);
        M5.setPosicion(x+90, y+350);
        M10= new Moneda1000(242);
        M10.setPosicion(x+220, y+350);
        use = new UseMoneda();
      
        while(e.DepSize() != true){          
            vueltocompleto += e.getVuelto().getValor();
        }
       
    }
    
    public void click(int a,int b){  

        ser1 = (int)(Math.random()*((100-10)+1))+10; //generamos series aleatorias para las monedas  
        ser2 = (int)(Math.random()*((500-10)+1))+10;
        ser3 = (int)(Math.random()*((1000-10)+1))+10;
        if(a>=x+30&& a<=x+80 && b>=y+350 && b<=y+400){
            use.setMoneda(new Moneda100(ser1), x-75,y+95);          
            System.out.println(ser1+"");
        }
        if(a>=x+90&& a<=x+140 && b>=y+350 && b<=y+400){
            use.setMoneda(new Moneda500(ser1), x-75,y+95); 
        System.out.println(ser2+"");
        }
        if(a>=x+220&& a<=x+270 && b>=y+350 && b<=y+400){
            use.setMoneda(new Moneda1000(ser1), x-75,y+95); 
        System.out.println(ser3+"");
        }
        if(a == x+55 && b == y+70 ){
            //C.getBebida(x, y, C);
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
    
    public UseMoneda getUse(){
        return use;
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
        M.paint(g);
        M5.paint(g);
        M10.paint(g);
        if(use != null){
            use.paint(g);
        }
    }
    
}
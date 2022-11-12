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
        try {
            sabor = e.comprarBebida(M, x).beber();
        } catch (PagoIncorrectoException | NoHayBebidaException | PagoInsuficienteException ex) {
            ex.printStackTrace();
        }
        
        
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
        g.drawRect(x,y,300,600);
        depB.paint(g);
        depV.paint(g);
    }
    
}
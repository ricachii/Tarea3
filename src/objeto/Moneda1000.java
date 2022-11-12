package objeto;


import java.awt.Color;

import java.awt.Graphics;


public class Moneda1000 extends Moneda{


    public Moneda1000(int n){
        super(n);
    }
    public int getValor(){
        return 1000;
    }
    public String tostring(){
        return "El numero de serie de la moneda es: " + getSerie() + " Y su valor es: "+ getValor();
    }
    @Override
    public void paint(Graphics g){
        

    }
}

package objeto;

import java.awt.Color;
import java.awt.Graphics;

public class Expendedor {

    private int precio, vuelto;
    private DepositoVuelto dep;
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public static final int FANTA = 3;
    private int x,y;
    private Deposito coca, sprite, fanta;

    public Expendedor(int numBebidas, int precioBebidas,int a,int b) {
        this.x = a;
        this.y = b;
        dep = new DepositoVuelto(x+210,y+110);
        coca = new Deposito(x,y);
        sprite = new Deposito(x+160,y);
        fanta = new Deposito(x+320,y);
        this.precio = precioBebidas;

        for (int i = 0; i < numBebidas; i++) {  //Etiquetando bebidas

            coca.addBebida(new CocaCola(i + 100)); //Numero de serie 
            sprite.addBebida(new Sprite(i + 200));
            fanta.addBebida(new Fanta(i + 300));
        }
    }

    public int getSerie(int Tipo){
        if(Tipo == 1 && coca.empty() == false){
           return coca.getSerie();
        }
        
        if(Tipo == 2 && sprite.empty() == false){
           return sprite.getSerie();
        }
        if(Tipo == 3 && fanta.empty() == false){
           return fanta.getSerie();
        }
        return 0;
    }

    public Bebida comprarBebida(Moneda m, int Tipo) throws PagoIncorrectoException, objeto.NoHayBebidaException, objeto.PagoInsuficienteException {//Creacion de Metodo del tipo Bebida para comprar una bebida
        if (m == null) {
            throw new PagoIncorrectoException("Metodo de pago incorrecto, Moneda no tiene valor");
        } else {
            if (m.getValor() < precio) {
                dep.addMoneda(m);
                throw new PagoInsuficienteException("Cantidad de pago insuficiente");

            } else {

                if (m != null) {
                    if ((Tipo == COCA && coca.empty() == true) || (Tipo == SPRITE && sprite.empty() == true) || (Tipo == FANTA && fanta.empty() == true) || Tipo <= 0 || Tipo > 3) {
                        dep.addMoneda(m);
                        throw new NoHayBebidaException("Deposito Vacio o codigo de bebida erroneo");

                    } else {
                        if (Tipo == COCA && m.getValor() >= precio && coca.empty() == false) {
                            vuelto = m.getValor() - precio;
                                for (int i = 0; i < vuelto / 100; ++i) {
<<<<<<< HEAD
                                    dep.addMoneda(new Moneda100());
=======
                                    dep.addMoneda(new Moneda100(100 + i));
>>>>>>> Mitad1
                                }
                                    return coca.getBebida();
                            }

                           
                         else if (Tipo == SPRITE && m.getValor() >= precio && sprite.empty() == false) {
                            vuelto = m.getValor() - precio;
                                for (int i = 0; i < vuelto / 100; ++i) {
<<<<<<< HEAD
                                    dep.addMoneda(new Moneda100());
=======
                                    dep.addMoneda(new Moneda100(100 + i));
>>>>>>> Mitad1
                                }
                                return sprite.getBebida();
                            }
                         else if (Tipo == FANTA && m.getValor() >= precio && fanta.empty() == false) {
                            vuelto = m.getValor() - precio;
                                for (int i = 0; i < vuelto / 100; ++i) {
<<<<<<< HEAD
                                    dep.addMoneda(new Moneda100());
=======
                                    dep.addMoneda(new Moneda100(100 + i));
>>>>>>> Mitad1
                                }
                                return fanta.getBebida();
                            }

                            

                         else {
                            return null;
                        }

                    }

                } else {
                    return null;

                }

            }
        }
    }

  

    public boolean DepSize(){
       return dep.empty();
    }

    

    public Moneda getVuelto() {
        return dep.getMoneda();
    }
    
    public void paint(Graphics g){
        g.setColor(Color.blue);
        g.drawRect(x,y,450,500);
        coca.paint(g);
        sprite.paint(g);
        fanta.paint(g);
    }

}


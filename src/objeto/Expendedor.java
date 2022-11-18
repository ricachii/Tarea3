package objeto;

import java.awt.Color;
import java.awt.Graphics;

public class Expendedor {

    private int precio, vuelto;
    private DepositoVuelto dep;
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public static final int FANTA = 3;
    private ContenedorBebida c;
    private int x, y;
    private Deposito coca, sprite, fanta;
    private int numeroBebida;
    private Bebida b1,b2,b3;

    public Expendedor(int numBebidas, int precioBebidas, int a, int b) {
        this.x = a;
        this.y = b;
        dep = new DepositoVuelto(x + 210, y + 110);
        coca = new Deposito(x, y);
        sprite = new Deposito(x + 160, y);
        fanta = new Deposito(x + 320, y);
        c = new ContenedorBebida(x + 120, y + 400);
        this.precio = precioBebidas;
        this.numeroBebida = numBebidas;
          
        for (int i = 0; i < numeroBebida; i++) {  //Etiquetando bebidas

            coca.addBebida(new CocaCola(i + 100)); //Numero de serie 
            sprite.addBebida(new Sprite(i + 200));
            fanta.addBebida(new Fanta(i + 300));
        }
    }

    public int getSerie(int Tipo) {
        if (Tipo == 1 && coca.empty() == false) {
            return coca.getSerie();
        }

        if (Tipo == 2 && sprite.empty() == false) {
            return sprite.getSerie();
        }
        if (Tipo == 3 && fanta.empty() == false) {
            return fanta.getSerie();
        }
        return 0;
    }

    public void comprarBebida(Moneda m, int Tipo) throws PagoIncorrectoException, PagoInsuficienteException, NoHayBebidaException {  //Creacion de Metodo del tipo Bebida para comprar una bebida
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
                        if (m != null) {
                            if ((Tipo == COCA && coca.empty() == true) || (Tipo == SPRITE && sprite.empty() == true) || (Tipo == FANTA && fanta.empty() == true) || Tipo <= 0 || Tipo > 3) {
                                dep.addMoneda(m);

                            } else {
                                if (Tipo == COCA && m.getValor() >= precio && coca.empty() == false) {
                                    vuelto = m.getValor() - precio;
                                    for (int i = 0; i < vuelto / 100; ++i) {

                                        dep.addMoneda(new Moneda100(100 + i));

                                    }

                                    c.setBebida(coca.getBebida());
                                    coca.mover();

                                } else if (Tipo == SPRITE && m.getValor() >= precio && sprite.empty() == false) {
                                    vuelto = m.getValor() - precio;
                                    for (int i = 0; i < vuelto / 100; ++i) {

                                        dep.addMoneda(new Moneda100(100 + i));

                                    }
                                    c.setBebida(sprite.getBebida());
                                    sprite.mover();
                                } else if (Tipo == FANTA && m.getValor() >= precio && fanta.empty() == false) {
                                    vuelto = m.getValor() - precio;
                                    for (int i = 0; i < vuelto / 100; ++i) {

                                        dep.addMoneda(new Moneda100(100 + i));

                                    }

                                    c.setBebida(fanta.getBebida());
                                    fanta.mover();
                                }

                            }

                        }

                    }
                }
            }
        }
    }

    public boolean DepSize() {
        return dep.empty();
    }

    public Moneda getVuelto() {
        return dep.getMoneda();
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    
    public ContenedorBebida getCont(){
        return c;
    }
    
       

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawRect(x, y, 450, 500);
        coca.paint(g);
        sprite.paint(g);
        fanta.paint(g);
        c.paint(g);
        if(coca.empty() == true){
            for (int i = 0; i < numeroBebida; i++) {
            int j = 6;
            coca.addBebida(new CocaCola((int)(Math.random()*((199-100)+1))+100));
            coca.llenarDep(g);
            j++;
            }
        }
        if(sprite.empty() == true){
            for (int i = 0; i < numeroBebida; i++) {
            int j = 6;
            sprite.addBebida(new Sprite((int)(Math.random()*((299-200)+1))+200));
            sprite.llenarDep(g);
            j++;
            }
        }
        if(fanta.empty() == true){
            for (int i = 0; i < numeroBebida; i++) {
            int j = 6;
            fanta.addBebida(new Fanta((int)(Math.random()*((399-300)+1))+300));
            fanta.llenarDep(g);
            j++;
            }
        }
    }

}

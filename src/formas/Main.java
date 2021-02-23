package formas;

import formas.formas1dimension.*;
import formas.formas2dimensiones.*;
import formas.formas3dimensiones.*;

public class Main {

    public static void main(String[] args) {
        Curva curva = new Curva();
        Recta recta = new Recta();
        Cuadrilatero cuadrilatero = new Cuadrilatero();
        Eclipse eclipse = new Eclipse();
        Hiperbola hiperbola = new Hiperbola();
        Parabola parabola = new Parabola();
        Triangulo triangulo = new Triangulo();
        Cilindro cilindro = new Cilindro();
        Cono cono = new Cono();
        Esfera esfera = new Esfera();

        curva.imprimir();
        recta.imprimir();
        cuadrilatero.imprimir();
        eclipse.imprimir();
        hiperbola.imprimir();
        parabola.imprimir();
        triangulo.imprimir();
        cilindro.imprimir();
        cono.imprimir();
        esfera.imprimir();
    }
}

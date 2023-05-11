package Productos;

import java.util.List;


import java.util.ArrayList;
import java.util.List;

public class Kit extends Elemento {
    private List<Elemento> elementos;

    public Kit(int codigo) {
        super(codigo, 0);
        this.elementos = new ArrayList<>();
        calcularPrecio();
    }

    private void calcularPrecio() {
        double precioTotal = 0;
        for (Elemento elemento : elementos) {
            precioTotal += elemento.getPrecio();
        }
        precio = precioTotal * 0.9;
    }

    public void addElemento(Elemento elemento) {
        elementos.add(elemento);
        calcularPrecio();
    }

    public void removeElemento(Elemento elemento) {
        elementos.remove(elemento);
        calcularPrecio();
    }

    @Override
    public void imprimir() {
        System.out.println("Kit - Código: " + codigo + " Precio: " + precio);
        for (Elemento elemento : elementos) {
            elemento.imprimir();
        }
    }
}



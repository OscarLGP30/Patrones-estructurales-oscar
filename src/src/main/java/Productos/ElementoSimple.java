package Productos;

public class ElementoSimple extends Elemento {
    public ElementoSimple(int codigo, double precio) {
        super(codigo, precio);
    }

    @Override
    public void imprimir() {
        System.out.println("Elemento simple - Código: " + codigo + " Precio: " + precio);
    }
}


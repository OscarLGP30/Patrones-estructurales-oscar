package Productos;

public abstract class Elemento {
    protected int codigo;
    protected double precio;

    public Elemento(int codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public abstract void imprimir();

    public int getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }
}

package Factories;

import Productos.Elemento;

import java.util.List;

public interface FabricaElementos {
    Elemento crearElementoSimple(int codigo, double precio);
    Elemento crearKit(int codigo, List<Elemento> elementos);
}


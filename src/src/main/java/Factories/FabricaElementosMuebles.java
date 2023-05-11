package Factories;

import Productos.Elemento;
import Productos.ElementoSimple;
import Productos.Kit;

import java.util.List;

public class FabricaElementosMuebles implements FabricaElementos {
    @Override
    public Elemento crearElementoSimple(int codigo, double precio) {
        return new ElementoSimple(codigo, precio);
    }

    @Override
    public Elemento crearKit(int codigo, List<Elemento> elementos) {
        return new Kit(codigo);
    }
}


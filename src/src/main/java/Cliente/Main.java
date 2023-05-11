package Cliente;

import Factories.FabricaElementos;
import Factories.FabricaElementosMuebles;
import Productos.ElementoSimple;
import Productos.Kit;

public class Main {
    public static void main(String[] args) {
        // Crear fábrica de elementos
        FabricaElementos fabrica = new FabricaElementosMuebles();

        // Crear 5 elementos simples
        ElementoSimple silla1 = (ElementoSimple) fabrica.crearElementoSimple(100, 30);
        ElementoSimple silla2 = (ElementoSimple) fabrica.crearElementoSimple(100, 60);
        ElementoSimple mesa1 = (ElementoSimple) fabrica.crearElementoSimple(200, 70);
        ElementoSimple mesa2 = (ElementoSimple) fabrica.crearElementoSimple(200, 100);
        ElementoSimple lampara1 = (ElementoSimple) fabrica.crearElementoSimple(50, 20);

        // Crear 2 kits
        Kit kit1 = new Kit(10);
        kit1.addElemento(silla1);
        kit1.addElemento(silla2);
        kit1.addElemento(mesa1);
        kit1.addElemento(lampara1);

        Kit kit2 = new Kit(20);
        kit2.addElemento(silla2);
        kit2.addElemento(mesa2);
        kit2.addElemento(lampara1);
        kit2.addElemento(mesa1);

        // Calcular precios
        System.out.println("Precio de silla 1: " + silla1.getPrecio());
        System.out.println("Precio de silla 2: " + silla2.getPrecio());
        System.out.println("Precio de mesa 1: " + mesa1.getPrecio());
        System.out.println("Precio de mesa 2: " + mesa2.getPrecio());
        System.out.println("Precio de lámpara 1: " + lampara1.getPrecio());
        System.out.println("Precio de kit 1: " + kit1.getPrecio());
        System.out.println("Precio de kit 2: " + kit2.getPrecio());
    }
}


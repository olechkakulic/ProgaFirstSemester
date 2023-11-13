package olechka.lab3.furniture;

import olechka.lab3.Color;
import olechka.lab3.Material;
import olechka.lab3.interfaces.Openable;

public class Pantry extends Furniture implements Openable {
    public Pantry(int size, Material material, Color color) {
        super(size, material, color);
    }

    @Override
    public void open() {
        System.out.println("Открываются дверцы кладовушки");
    }


    @Override
    public void close() {
        System.out.println("Закрываются дверцы кладовушки");
    }

    @Override
    public String toString() {
        return "Pantry{" +
                "size=" + size +
                ", material=" + material +
                ", color=" + color +
                '}';
    }
}

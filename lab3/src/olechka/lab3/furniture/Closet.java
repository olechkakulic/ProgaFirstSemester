package olechka.lab3.furniture;

import olechka.lab3.Color;
import olechka.lab3.Material;
import olechka.lab3.interfaces.Openable;

public class Closet extends Furniture implements Openable {
    public Closet(int size, Material material, Color color) {
        super(size, material, color);
    }

    @Override
    public void open() {
        System.out.println("Открываются дверцы шкафчика");
    }

    @Override
    public void close() {
        System.out.println("Закрываются дверцы шкафчика");
    }

    @Override
    public String toString() {
        return "Closet{" +
                "size=" + size +
                ", material=" + material +
                ", color=" + color +
                '}';
    }
}

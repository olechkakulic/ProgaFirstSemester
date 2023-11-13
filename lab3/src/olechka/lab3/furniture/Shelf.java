package olechka.lab3.furniture;

import olechka.lab3.Color;
import olechka.lab3.Material;
import olechka.lab3.interfaces.Pushable;

public class Shelf extends Furniture implements Pushable {
    public Shelf(int size, Material material, Color color) {
        super(size, material, color);
    }


    @Override
    public void push() {
        System.out.println("Полки откидываются");
    }

    @Override
    public String toString() {
        return "Shelf{" +
                "size=" + size +
                ", material=" + material +
                ", color=" + color +
                '}';
    }
}

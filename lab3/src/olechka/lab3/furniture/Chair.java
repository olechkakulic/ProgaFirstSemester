package olechka.lab3.furniture;

import olechka.lab3.Color;
import olechka.lab3.Material;
import olechka.lab3.interfaces.Pushable;

public class Chair extends Furniture implements Pushable {
    public Chair(int size, Material material, Color color) {
        super(size, material, color);
    }

    @Override
    public void push() {
        System.out.println("Стулья откидываются");
    }

    @Override
    public String toString() {
        return "Chair{" +
                "size=" + size +
                ", material=" + material +
                ", color=" + color +
                '}';
    }
}

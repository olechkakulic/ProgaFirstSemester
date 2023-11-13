package olechka.lab3.furniture;

import olechka.lab3.Color;
import olechka.lab3.Material;
import olechka.lab3.PhysicalObject;

public class Furniture extends PhysicalObject {
    public Furniture(int size, Material material, Color color) {
        super(size, material, color);
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "size=" + size +
                ", material=" + material +
                ", color=" + color +
                '}';
    }
}

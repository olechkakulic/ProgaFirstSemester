package olechka.lab4.furniture;

import olechka.lab4.Color;
import olechka.lab4.Material;
import olechka.lab4.PhysicalObject;

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

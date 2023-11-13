package olechka.lab3.furniture;

import olechka.lab3.Color;
import olechka.lab3.Material;
import olechka.lab3.interfaces.Pushable;

public class Table extends Furniture implements Pushable {
    public Table(int size, Material material, Color color) {
        super(size, material, color);
    }


    @Override
    public void push() {
        System.out.println("Столы откидываются");
    }

    @Override
    public String toString() {
        return "Table{" +
                "size=" + size +
                ", material=" + material +
                ", color=" + color +
                '}';
    }
}

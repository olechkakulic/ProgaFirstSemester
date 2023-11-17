package olechka.lab3.furniture;

import olechka.lab3.Color;
import olechka.lab3.Material;
import olechka.lab3.interfaces.Pushable;

import java.util.Objects;

public class Table extends Furniture implements Pushable {
    private boolean isPushedAway;

    public Table(int size, Material material, Color color) {
        super(size, material, color);
    }

    @Override
    public void push() {
        isPushedAway = true;
        System.out.println("Столы откидываются");
    }

    @Override
    public String toString() {
        return "Table{" +
                "isPushedAway=" + isPushedAway +
                ", size=" + size +
                ", material=" + material +
                ", color=" + color +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Table table = (Table) o;
        return isPushedAway == table.isPushedAway;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isPushedAway);
    }
}

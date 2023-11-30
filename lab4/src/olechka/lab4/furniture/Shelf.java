package olechka.lab4.furniture;

import olechka.lab4.Color;
import olechka.lab4.Material;
import olechka.lab4.exception.PushableAlreadyPushedException;
import olechka.lab4.interfaces.Pushable;

import java.util.Objects;

public class Shelf extends Furniture implements Pushable {
    private boolean isPushedAway;

    public Shelf(int size, Material material, Color color) {
        super(size, material, color);
    }

    @Override
    public void push() throws PushableAlreadyPushedException {
        if (isPushedAway) {
            throw new PushableAlreadyPushedException(this);
        }
        System.out.println("Полки откидываются");
        isPushedAway = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Shelf shelf = (Shelf) o;
        return isPushedAway == shelf.isPushedAway;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isPushedAway);
    }

    @Override
    public String toString() {
        return "Shelf{" +
                "isPushedAway=" + isPushedAway +
                ", size=" + size +
                ", material=" + material +
                ", color=" + color +
                '}';
    }
}

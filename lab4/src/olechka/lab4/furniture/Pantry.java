package olechka.lab4.furniture;

import olechka.lab4.Color;
import olechka.lab4.Material;
import olechka.lab4.interfaces.Openable;

import java.util.Objects;

public class Pantry extends Furniture implements Openable {
    public boolean isOpen;

    public Pantry(int size, Material material, Color color) {
        super(size, material, color);
    }

    @Override
    public void open() {
        isOpen = true;
        System.out.println("Открываются дверцы кладовушки");
    }


    @Override
    public void close() {
        isOpen = false;
        System.out.println("Закрываются дверцы кладовушки");
    }

    @Override
    public String toString() {
        return "Pantry{" +
                "isOpen=" + isOpen +
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
        Pantry pantry = (Pantry) o;
        return isOpen == pantry.isOpen;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isOpen);
    }
}

package olechka.lab3.furniture;

import olechka.lab3.Color;
import olechka.lab3.Material;
import olechka.lab3.interfaces.Openable;

import java.util.Objects;

public class Closet extends Furniture implements Openable {
    private boolean isOpen;

    public Closet(int size, Material material, Color color) {
        super(size, material, color);
    }

    @Override
    public void open() {
        isOpen = true;
        System.out.println("Открываются дверцы шкафчика");
    }

    @Override
    public void close() {
        isOpen = false;
        System.out.println("Закрываются дверцы шкафчика");
    }

    @Override
    public String toString() {
        return "Closet{" +
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
        Closet closet = (Closet) o;
        return isOpen == closet.isOpen;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isOpen);
    }
}

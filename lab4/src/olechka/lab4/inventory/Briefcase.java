package olechka.lab4.inventory;

import olechka.lab4.Color;
import olechka.lab4.Material;
import olechka.lab4.PhysicalObject;
import olechka.lab4.interfaces.Openable;

public class Briefcase extends PhysicalObject implements Openable {
    protected boolean isOpen;
    public final String name;

    public Briefcase(int size, Material material, Color color, String name) {
        super(size, material, color);
        this.name = name;
    }


    @Override
    public void open() {
        isOpen = true;
    }

    @Override
    public void close() {
        isOpen = false;
    }
}

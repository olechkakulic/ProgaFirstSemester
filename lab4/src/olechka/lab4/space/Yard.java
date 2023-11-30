package olechka.lab4.space;

import olechka.lab4.Color;

public class Yard extends Space {
    public Yard() {
        super(new SpaceBounds(100, 100), "двор", null, Color.GREEN);
    }

    @Override
    public String toString() {
        return "Yard{" +
                "bounds=" + bounds +
                ", name='" + name + '\'' +
                ", humans=" + humans +
                ", objects=" + objects +
                ", size=" + size +
                ", material=" + material +
                ", color=" + color +
                '}';
    }
}

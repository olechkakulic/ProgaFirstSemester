package olechka.lab4.space;

import olechka.lab4.Color;
import olechka.lab4.Material;

public class MainRoom extends Space {
    public MainRoom() {
        super(new RoomBounds(5, 20), "Зал", Material.WOOD, Color.BLUE);
    }

    @Override
    public String toString() {
        return "MainRoom{" +
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

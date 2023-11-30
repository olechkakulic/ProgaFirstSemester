package olechka.lab4.space;

import olechka.lab4.Color;
import olechka.lab4.Material;
import olechka.lab4.PhysicalObject;
import olechka.lab4.interfaces.Openable;

import java.util.Objects;

public class Barn extends Space implements Openable {
    //    среда сама подсказала сделать поле final потому шо ну блин дверь не может стать чем-то другим.
    private final Door door;
    private boolean isOpen;

    public Barn() {
        super(new RoomBounds(3, 5), "Сарай", Material.STONE, Color.BROWN);
        door = new Door();
    }

    public Door getDoor() {
        return door;
    }

    @Override
    public void open() {
        isOpen = true;
    }

    @Override
    public void close() {
        isOpen = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Barn barn = (Barn) o;
        return isOpen == barn.isOpen && Objects.equals(door, barn.door);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), door, isOpen);
    }

    @Override
    public String toString() {
        return "Barn{" +
                "door=" + door +
                ", isOpen=" + isOpen +
                ", bounds=" + bounds +
                ", name='" + name + '\'' +
                ", humans=" + humans +
                ", objects=" + objects +
                ", size=" + size +
                ", material=" + material +
                ", color=" + color +
                '}';
    }

    public class Door extends PhysicalObject implements Openable {

        public Door() {
            super(3, Material.METAL, Color.GRAY);

        }

        @Override
        public void open() {
            Barn.this.open();
        }

        @Override
        public void close() {
            Barn.this.close();
        }

        @Override
        public String toString() {
            return "Door{" +
                    "size=" + size +
                    ", material=" + material +
                    ", color=" + color +
                    '}';
        }
    }
}


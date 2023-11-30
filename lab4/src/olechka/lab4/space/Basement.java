package olechka.lab4.space;

import olechka.lab4.Color;
import olechka.lab4.Material;
import olechka.lab4.interfaces.Openable;

import java.util.Objects;

public class Basement extends Space implements Openable {
    private boolean isOpen = false;

    public Basement() {
        super(new SpaceBounds(2, 3), "Подвал", Material.WOOD, Color.WHITE);
    }


    @Override
    public void open() {
        isOpen = true;
        System.out.println("Открывается подвал");
    }

    @Override
    public void close() {
        isOpen = false;
        System.out.println("Закрывается подвал");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Basement basement = (Basement) o;
        return isOpen == basement.isOpen;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isOpen);
    }

    @Override
    public String toString() {
        return "Basement{" +
                "isOpen=" + isOpen +
                ", bounds=" + bounds +
                ", name='" + name + '\'' +
                ", humans=" + humans +
                ", objects=" + objects +
                ", size=" + size +
                ", material=" + material +
                ", color=" + color +
                '}';
    }
}

//class LocalClass {
//    // this is local class. trust me. please. я не знаю куда запихнуть РИЛ.
//}
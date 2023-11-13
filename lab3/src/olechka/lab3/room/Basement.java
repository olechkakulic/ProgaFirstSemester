package olechka.lab3.room;

import olechka.lab3.interfaces.Openable;

import java.util.Objects;

public class Basement extends Room implements Openable {
    private boolean isOpen = false;

    public Basement() {
        super(2, 3, "Подвал");
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
                ", height=" + height +
                ", width=" + width +
                ", name='" + name + '\'' +
                ", humans=" + humans +
                ", objects=" + objects +
                '}';
    }
}

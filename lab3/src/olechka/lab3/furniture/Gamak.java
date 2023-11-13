package olechka.lab3.furniture;

import olechka.lab3.Color;
import olechka.lab3.Material;
import olechka.lab3.human.Human;

import java.util.Objects;

public class Gamak extends Furniture {
    private int height = 30;
    private Human human;

    public Gamak() {
        super(200, Material.CLOTH, Color.GRAY);
    }

    public void humanLay(Human human) {
        this.human = human;

    }

    public void humanWakeUp() {
        human = null;
    }


    public void lower() {
        //        типа опустили унизили гамак
        while (height > 0) {
            height -= 5;
        }
        System.out.println("Гамак с " + human.getName() + " постепенно опустился ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Gamak gamak = (Gamak) o;
        return height == gamak.height && Objects.equals(human, gamak.human);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height, human);
    }

    @Override
    public String toString() {
        return "Gamak{" +
                "height=" + height +
                ", human=" + human +
                ", size=" + size +
                ", material=" + material +
                ", color=" + color +
                '}';
    }

}

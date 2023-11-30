package olechka.lab4.furniture;

import olechka.lab4.Color;
import olechka.lab4.Material;
import olechka.lab4.exception.WrongGamakHeightException;
import olechka.lab4.human.Human;

import java.util.Objects;

public class Gamak extends Furniture {
    private int height = 30;
    private Human human;

    public Gamak() {
        super(200, Material.CLOTH, Color.GRAY);
    }

    //кладем шурупчика на гамак
    public void humanLay(Human human) {
        this.human = human;

    }

    //поднимаем встаем нах
    public void humanWakeUp() {
        human = null;
    }


    public void lower(int height) {
        if (height < 0) {
            throw new WrongGamakHeightException();
        }
        //        типа опустили унизили гамак
        while (this.height > height) {
            this.height -= 5;
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

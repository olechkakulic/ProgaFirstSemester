package olechka.lab4.human;

import olechka.lab4.space.Space;

public class Shurupchik extends Human {
    public Shurupchik() {
        super(20, 190, 100, "Шурупчик");
    }

    @Override
    public String toString() {
        return "Shurupchik{" +
                "name='" + name + '\'' +
                ", mouth=" + mouth +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", sense=" + sense +
                ", isBroughtTo=" + isBroughtTo +
                '}';
    }

    public void bring(Human human, Space space) {
        System.out.println("Шурупчик подвел " + human.name + " к " + space.getName());
        human.isBroughtTo = space;
    }

}

package olechka.lab4.human;

public class Vintik extends Human {
    public Vintik() {
        super(12, 155, 50, "Винтик");
    }

    @Override
    public String toString() {
        return "Vintik{" +
                "name='" + name + '\'' +
                ", mouth=" + mouth +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", sense=" + sense +
                ", isBroughtTo=" + isBroughtTo +
                '}';
    }
}
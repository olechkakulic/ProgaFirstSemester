package olechka.lab4.human;

public class Shpuntik extends Human {
    public Shpuntik() {
        super(13, 160, 100, "Шпунтик");
    }

    @Override
    public String toString() {
        return "Shpuntik{" +
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

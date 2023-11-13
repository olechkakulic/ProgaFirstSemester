package olechka.lab3.human;

public class Shurupchik extends Human {
    public Shurupchik() {
        super(20, 190, 100, "Шурупчик");
    }

    @Override
    public String toString() {
        return "Shurupchik{" +
                "age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}

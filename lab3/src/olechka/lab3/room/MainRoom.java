package olechka.lab3.room;

public class MainRoom extends Room {


    public MainRoom() {
        super(5, 20, "Зал");
    }

    @Override
    public String toString() {
        return "MainRoom{" +
                "height=" + height +
                ", width=" + width +
                ", name='" + name + '\'' +
                ", humans=" + humans +
                ", objects=" + objects +
                '}';
    }
}

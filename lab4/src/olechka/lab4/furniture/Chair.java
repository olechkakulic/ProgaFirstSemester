package olechka.lab4.furniture;

import olechka.lab4.Color;
import olechka.lab4.Material;
import olechka.lab4.exception.PushableAlreadyPushedException;
import olechka.lab4.interfaces.Pushable;

import java.util.Objects;

public class Chair extends Furniture implements Pushable {
    private boolean isPushedAway;

    public Chair(int size, Material material, Color color) {
        super(size, material, color);
    }

    //я вот тут выбрасываю исключение но в будущем нигде не ловлю, просто потому что стулья не будут откидываться
//    больше. блять сукеа в плане ОНИ ОДИН РАЗ ОТКИНУЛИСЬБ И ВСЕ.
    @Override
    public void push() throws PushableAlreadyPushedException {
        if (isPushedAway) {
//            this будет ссылкой на текущий объект очев. ну тип если мы бы обрабатывали это исключение то
//            объекты то были бы каждый раз разные. стул стол полки и тд............блять.................
            throw new PushableAlreadyPushedException(this);
        }
        isPushedAway = true;
        System.out.println("Стулья откидываются");
    }

    @Override
    public String toString() {
        return "Chair{" +
                "isPushedAway=" + isPushedAway +
                ", size=" + size +
                ", material=" + material +
                ", color=" + color +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Chair chair = (Chair) o;
        return isPushedAway == chair.isPushedAway;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isPushedAway);
    }
}

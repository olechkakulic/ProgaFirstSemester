package olechka.lab3.button;

import olechka.lab3.Color;
import olechka.lab3.Material;
import olechka.lab3.furniture.Gamak;
import olechka.lab3.human.Human;

import java.util.Objects;

//кнопка которая опускает (унижает типа лол) гамак пусть будет у нас всегда задана с такими параметрами.
public class GamakButton extends Button {
    //    по дефолту лучше все поля класса которые ток можно делать приватными
    private final Gamak gamak;

    //кнопка будет подвязана к существующему гамаку.
    //обязаны вызвать конструктор род класс.
//    так как кнопки вполне себе конкретные, то мы уберем параметры в конструкторе
    public GamakButton(Gamak gamak) {
        super(10, Material.WOOD, Color.BROWN);
        this.gamak = gamak;
    }

    @Override
    public void interact(Human human) {
        super.interact(human);
        if (isToggled) {
            gamak.lower();
        }
    }

    @Override
    public String toString() {
        return "GamakButton{" +
                "gamak=" + gamak +
                ", isToggled=" + isToggled +
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
        GamakButton that = (GamakButton) o;
        return Objects.equals(gamak, that.gamak);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), gamak);
    }
}

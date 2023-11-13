package olechka.lab3.button;

import olechka.lab3.Color;
import olechka.lab3.Material;
import olechka.lab3.human.Human;
import olechka.lab3.interfaces.Pushable;

import java.util.Objects;
//кнопка которая откидывает стулья пусть будет у нас всегда задана с такими параметрами.

public class PushFurnitureButton extends Button {
    //    интерфейс для этого и придумали. мы передаем в конструктор объект интерфейса. то есть у всех классов которые реализуют этот интерфейс,
//    а соотвественно переопределяют метод push (в нашем случае). и мы на этом объекте интерфейса как раз вызовем метод push.
//    просто прикол в том что мы не будем понимать в моменте (я щас ВООБЩЕ не в моменте) у какого конкретно класса стул стол или блять полки
//    мы этот ПУШ (нет блин git pull) используем. когда я говорила что прога лучше физики я ошибалась. но я вот всегда ошибаюсь по жизни. что сделать то.
//  однако  -все-таки программисты они аутисты, а физики шизофреники. разные люди.
    private final Pushable pushable;

    public PushFurnitureButton(Pushable pushable, Color color) {
        super(15, Material.METAL, color);
        this.pushable = pushable;
    }

    //мы проверяем состояние (нажато или нет кнопка) и выполняем определенное действием. пинаем.
    @Override
    public void interact(Human human) {
        super.interact(human);
        if (isToggled) {
            pushable.push();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PushFurnitureButton button = (PushFurnitureButton) o;
        return Objects.equals(pushable, button.pushable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pushable);
    }

    @Override
    public String toString() {
        return "PushFurnitureButton{" +
                "pushable=" + pushable +
                ", isToggled=" + isToggled +
                ", size=" + size +
                ", material=" + material +
                ", color=" + color +
                '}';
    }
}

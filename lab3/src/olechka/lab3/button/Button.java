package olechka.lab3.button;

import olechka.lab3.Color;
import olechka.lab3.Material;
import olechka.lab3.PhysicalObject;
import olechka.lab3.interfaces.Interactible;

import java.util.Objects;

//щас мы нах будем реализовывать умный дом ШИЗОФРЕНИКА
public class Button extends PhysicalObject implements Interactible {
    //    модификатор protected позволит использовать эту переменную в классах наследниках
    protected boolean isToggled;

    //обязаны вызвать конструктор род класс. Но если бы в род классе был конструктор без аргументов то мы могли бы и не писать
//    слово super тогда вызвался бы конструктор род класса без аргументов
    public Button(int size, Material material, Color color) {
        super(size, material, color);
//        для очевидности прописала. хотя очев в этой переменной уже false лежит
        isToggled = false;
    }


    //интеракт у нас будет отвечать за взаимодействие. если кнопка уже нажата то поменяем переменную на false. и наоборот
    @Override
    public void interacted() {
//        знак ! не меняет значение переменной, тут буквально написано если тут правда лежит false то
        isToggled = !isToggled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Button button = (Button) o;
        return isToggled == button.isToggled;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isToggled);
    }

    @Override
    public String toString() {
        return "Button{" +
                "isToggled=" + isToggled +
                ", size=" + size +
                ", material=" + material +
                ", color=" + color +
                '}';
    }
}
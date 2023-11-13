package olechka.lab3.room;

import olechka.lab3.PhysicalObject;
import olechka.lab3.human.Human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public abstract class Room {
    protected final int height;
    protected final int width;
    protected final String name;

    //    для интеофейса у  нас динамическое связывание как и для всех объектов.
//    мы создаем объект класса ArrayList с типом List. Мы используем методы интерфейса List потому что именно этот тип
//    указан у нашей переменной. но фактически вызываются методы arraylist. Но по сути даже если бы лист был классом то все равно вызывались бы методы arraylist
//    потому что динамическое связывание. Без разнрицы какой тип перменной мы указали, фактическая реализация будет от ArrayList
    protected final List<Human> humans = new ArrayList<>();
    protected final List<PhysicalObject> objects = new ArrayList<>();

    protected Room(int height, int width, String name) {
        this.height = height;
        this.width = width;
        this.name = name;
    }

    public void addObjects(PhysicalObject... objects) {
        Collections.addAll(this.objects, objects);
    }

    public void enter(Human... humans) {
        Collections.addAll(this.humans, humans);
        for (Human human : humans) {
            System.out.println(human.getName() + " оказался в " + name);
        }
    }

    public void leave(Human human) {
        humans.remove(human);
        System.out.println(human.getName() + " выходит из " + name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return height == room.height && width == room.width && Objects.equals(name, room.name) && Objects.equals(humans, room.humans) && Objects.equals(objects, room.objects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width, name, humans, objects);
    }

    @Override
    public String toString() {
        return "Room{" +
                "height=" + height +
                ", width=" + width +
                ", name='" + name + '\'' +
                ", humans=" + humans +
                ", objects=" + objects +
                '}';
    }
}

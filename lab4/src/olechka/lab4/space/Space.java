package olechka.lab4.space;

import olechka.lab4.Color;
import olechka.lab4.Material;
import olechka.lab4.PhysicalObject;
import olechka.lab4.human.Human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public abstract class Space extends PhysicalObject {
    protected final RoomBounds bounds;
    protected final String name;

    //    для интеофейса у  нас динамическое связывание как и для всех объектов.
//    мы создаем объект класса ArrayList с типом List. Мы используем методы интерфейса List потому что именно этот тип
//    указан у нашей переменной. но фактически вызываются методы arraylist. Но по сути даже если бы лист был классом то все равно вызывались бы методы arraylist
//    потому что динамическое связывание. Без разнрицы какой тип перменной мы указали, фактическая реализация будет от ArrayList
    protected final List<Human> humans = new ArrayList<>();
    protected final List<PhysicalObject> objects = new ArrayList<>();

    protected Space(RoomBounds bounds, String name, Material material, Color color) {
        super(bounds.height * bounds.width, material, color);
        this.bounds = bounds;
        this.name = name;
    }

    public void addObjects(PhysicalObject... objects) {
        Collections.addAll(this.objects, objects);
    }

    public void enter(Human... humans) {
//        List of из массива сделает список и просто передадим это в enter
        enter(List.of(humans));
    }

    public void enter(List<Human> humans) {
//        раньше было Collections.addAll(this.humans, humans) а щас уже список передается сразу поэтому с ним можно вызвать addAll
        this.humans.addAll(humans);
        for (Human human : humans) {
            System.out.println(human.getName() + " оказался в " + name);
        }
    }

    public void leave(Human... humans) {
        leave(List.of(humans));
    }

    public void leave(List<Human> humans) {
        this.humans.removeAll(humans);
        for (Human human : humans) {
            System.out.println(human.getName() + " выходит из " + name);
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Space room = (Space) o;
        return Objects.equals(bounds, room.bounds) && Objects.equals(name, room.name) && Objects.equals(humans, room.humans) && Objects.equals(objects, room.objects);
    }


    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bounds, name, humans, objects);
    }

    @Override
    public String toString() {
        return "Room{" +
                "bounds=" + bounds +
                ", name='" + name + '\'' +
                ", humans=" + humans +
                ", objects=" + objects +
                ", size=" + size +
                ", material=" + material +
                ", color=" + color +
                '}';
    }

    public static class RoomBounds {
        public final int height;
        public final int width;

        protected RoomBounds(int height, int width) {
            this.height = height;
            this.width = width;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            RoomBounds that = (RoomBounds) o;
            return height == that.height && width == that.width;
        }

        @Override
        public int hashCode() {
            return Objects.hash(height, width);
        }

        @Override
        public String toString() {
            return "RoomBounds{" +
                    "height=" + height +
                    ", width=" + width +
                    '}';
        }
    }
}

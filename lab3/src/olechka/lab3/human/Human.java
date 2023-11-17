package olechka.lab3.human;

import olechka.lab3.button.Button;

import java.util.Objects;

public class Human {
    protected int age;
    protected int height;
    protected int weight;
    protected HumanSense sense;

    protected final String name;


    public Human(int age, int height, int weight, String name) {
//        при созданрии объекта в классе Main ну или в любом другом лол.. мы зададим параметры и они передадутся в поля класса
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.name = name;
        sense = HumanSense.NORMAL;
    }

    public String getName() {
        return name;
    }

    public void surprise() {
        setSense(HumanSense.ASTONISHED);
    }

    public void setSense(HumanSense sense) {
        this.sense = sense;
        System.out.println(name + " теперь " + sense.getState());
    }

    public void pushButton(Button button) {
        button.interacted();
        System.out.println(name + " нажимает на кнопку");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && height == human.height && weight == human.weight && Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, height, weight, name);
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", sense=" + sense +
                ", name='" + name + '\'' +
                '}';
    }
}

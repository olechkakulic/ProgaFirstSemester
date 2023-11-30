package olechka.lab4.human;

import olechka.lab4.button.Button;
import olechka.lab4.interfaces.Speaking;
import olechka.lab4.space.Space;

import java.util.Objects;

public class Human {
    protected final String name;
    protected final Speaking mouth;
    protected int age;
    protected int height;
    protected int weight;
    protected HumanSense sense;
    protected Space isBroughtTo;


    public Human(int age, int height, int weight, String name) {
//        при созданрии объекта в классе Main ну или в любом другом лол.. мы зададим параметры и они передадутся в поля класса
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.name = name;
        sense = HumanSense.NORMAL;

        class HumanMouth implements Speaking {
            @Override
            public void say(String phrase) {
                System.out.println(name + " говорит: " + phrase);
            }
        }
        mouth = new HumanMouth();
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

    public void say(String phrase) {
        mouth.say(phrase);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && height == human.height && weight == human.weight && Objects.equals(name, human.name) && Objects.equals(mouth, human.mouth) && sense == human.sense && Objects.equals(isBroughtTo, human.isBroughtTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mouth, age, height, weight, sense, isBroughtTo);
    }

    @Override
    public String toString() {
        return "Human{" +
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

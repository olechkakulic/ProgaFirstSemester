//в каждом классе мы обязаны прописать к какрму package
//он принадлежит
package attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

//https://pokemondb.net/move/ice-beam

//для каждого класса в неявном виде прописано extends Object
//каждый конструктор вызывает конструктор родительского класса
//и если мы явно не пропишем слово super то будет вызываться
//родительнский конструктор без аргументов
public class IceBeamMove extends SpecialMove {
//    статическое поле класса существует в одном экземлпряе
//    а поле объекта разное для каждого объекта (без слова static)

    //    конструктор это как метод, но который вызывается
//    при использовании  ключевого слова new , то есть
//    при создании объекта
//    загрузкой классов в оперативную память занимаются
//    специальные чмори под названием classloader
//    тут мы просто передали три аргумента родительскому конструктору
//    если мы перейдем к Type там будет enum
//    это по сути класс но с ограниченным количеством
//    объектов
//    то есть эти объекты заданы там в виде констант
//    я не смогу создать свой объект класса Type
    public IceBeamMove() {
        super(Type.ICE, 90, 100);
    }

    //    по заданию нам надо переопределить метод describe
//    сделаем это так: пишем de И tab
//вот эта строчка   protected String describe() - это описание. Что идет дальше в скобках - это исполняемый код
//    в конструкторе мы можем только ВЫЗВАТЬ МЕТОД, который мы определим ранее
//    мы вызываем describe родительского класса, если бы не было слова super был бы лютый пиздец..
    @Override
    protected String describe() {
//        выводилось сообщение которое в методе describe прописано было
//        return super.describe();
        return "использует атаку Ice Beam";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if (Math.random() <= 0.1) {
            Effect.freeze(pokemon);
        }
    }

    //    сам класс в себе содержит какие-то описания.
}

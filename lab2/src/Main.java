import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;


public class Main {

//    когда мы создаем новый объект в классе в котором не прописан явно конструктор, это значит что там точно существует конструктор
//    без аргументов. Но когда мы создадим конструктои с аргументом, тот старый конструктор исчезнет

    public static void main(String[] args) {

        Battle b = new Battle();
        Pokemon p1 = new SilcoonPokemon(1);
        Pokemon p2 = new Pokemon("Хищник", 30);
        Pokemon p3 = new BreloomPokemon(90);
        Pokemon p4 = new BronzongPokemon(1);
        Pokemon p5 = new BronzorPokemon(200);
        Pokemon p6 = new MarilPokemon(1);
        Pokemon p7 = new PurrloinPokemon(15);
        Pokemon p8 = new ShroomishPokemon(1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addAlly(p4);

        b.addFoe(p5);
        b.addFoe(p6);
        b.addFoe(p7);
        b.addFoe(p8);
        b.go();
    }
}
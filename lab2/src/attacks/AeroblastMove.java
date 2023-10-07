package attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

//https://pokemondb.net/move/aeroblast
public class AeroblastMove extends SpecialMove {
    public AeroblastMove() {
        super(Type.FLYING, 100, 95);
    }

    //переопределеяем метод describe
    @Override
    protected String describe() {
        return "использует атаку Aeroblast";
    }


    //    хз правильно или нет нахуй..........у меня уже сердце балид душа балид
    @Override
    protected double calcCriticalHit(Pokemon pokemon, Pokemon pokemon1) {
// Аэробласт наносит урон и имеет увеличенный коэффициент критического попадания (1⁄8 вместо 1⁄24).
        return 1d / 8d;
    }
}

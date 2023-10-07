package attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

//https://pokemondb.net/move/poison-gas
public class PoisonGasMove extends StatusMove {
    public PoisonGasMove() {
        super(Type.POISON, 0, 90);
    }

    @Override
    protected String describe() {
        return "Использует атаку Poison Gas";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        Effect.poison(pokemon);
    }
}

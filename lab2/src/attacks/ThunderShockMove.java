package attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

//https://pokemondb.net/move/thunder-shock
public class ThunderShockMove extends SpecialMove {
    public ThunderShockMove() {
        super(Type.ELECTRIC, 40, 100);
    }

    @Override
    protected String describe() {
        return "Покемон использует атаку Thunder Shock";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if (Math.random() < 0.1) {
            Effect.paralyze(pokemon);
        }
    }
}

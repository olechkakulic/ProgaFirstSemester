package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

//https://pokemondb.net/move/rage
public class RageMove extends PhysicalMove {
    public RageMove() {
        super(Type.NORMAL, 20, 100);
    }

    @Override
    protected String describe() {
        return "использует атаку Rage Move";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        pokemon.setMod(Stat.ATTACK, 1);
    }
}

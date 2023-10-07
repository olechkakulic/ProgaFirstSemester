package pokemons;

import attacks.IceBeamMove;
import attacks.ThunderShockMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class ShroomishPokemon extends Pokemon {
    public ShroomishPokemon(int level) {
        super("Shroomish", level);
        setStats(70, 20, 50, 20, 50, 40);
        setType(Type.GRASS);
        setMove(new IceBeamMove(), new ThunderShockMove());
    }
}

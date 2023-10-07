package pokemons;

import attacks.IceBeamMove;
import attacks.PoisonGasMove;
import attacks.ThunderShockMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class PurrloinPokemon extends Pokemon {
    public PurrloinPokemon(int level) {
        super("Purrloin", level);
        setStats(41, 50, 37, 50, 37, 66);
        setType(Type.DARK);
        setMove(new IceBeamMove(), new ThunderShockMove(), new PoisonGasMove());
    }
}

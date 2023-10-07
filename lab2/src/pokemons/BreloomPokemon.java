package pokemons;

import attacks.AeroblastMove;
import attacks.IceBeamMove;
import attacks.PoisonGasMove;
import attacks.ThunderShockMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class BreloomPokemon extends Pokemon {
    public BreloomPokemon(int level) {
        super("Breloom", level);
        setStats(60, 130, 80, 60, 60, 70);
        setType(Type.GRASS, Type.FIGHTING);
        setMove(new IceBeamMove(), new ThunderShockMove(), new PoisonGasMove(), new AeroblastMove());
    }
}

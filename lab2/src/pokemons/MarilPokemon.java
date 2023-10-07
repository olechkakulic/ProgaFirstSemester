package pokemons;

import attacks.MegaKickMove;
import attacks.MoonlightMove;
import attacks.RageMove;
import attacks.SmellingSaltsMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class MarilPokemon extends Pokemon {
    public MarilPokemon(int level) {
        super("Maril", level);
        setStats(70, 20, 50, 20, 50, 40);
        setType(Type.WATER, Type.FAIRY);
        setMove(new MoonlightMove(), new SmellingSaltsMove(), new MegaKickMove(), new RageMove());
    }
}

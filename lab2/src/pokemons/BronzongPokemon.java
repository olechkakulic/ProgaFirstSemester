package pokemons;

import attacks.IceBeamMove;
import attacks.MirrorMove;
import attacks.SleepTalkMove;
import attacks.SynthesisMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

//https://pokemondb.net/pokedex/bronzong
public class BronzongPokemon extends Pokemon {
    public BronzongPokemon(int level) {
        super("Bronzong", level);
        setStats(67, 89, 116, 79, 116, 33);
        setType(Type.STEEL, Type.PSYCHIC);
        setMove(new SynthesisMove(), new SleepTalkMove(), new IceBeamMove(), new MirrorMove());
    }
}

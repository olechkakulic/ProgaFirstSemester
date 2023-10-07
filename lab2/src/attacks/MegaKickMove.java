package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

//https://pokemondb.net/move/mega-kick
public class MegaKickMove extends PhysicalMove {
    public MegaKickMove() {
        super(Type.NORMAL, 120, 75);
    }

    @Override
    protected String describe() {
        return "использует атаку Mega Kick";
    }

}

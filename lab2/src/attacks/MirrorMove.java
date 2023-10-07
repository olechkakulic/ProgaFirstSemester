package attacks;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

//https://pokemondb.net/move/mirror-move
public class MirrorMove extends SpecialMove {
    public MirrorMove() {
        super(Type.FLYING, 0, 0);
    }

    @Override
    protected String describe() {
        return "Использует атаку Mirror";
    }
//    к большому ВЕЛИКОМУ СОЖАЛЕНИЮ мы не можем НИКАК вытащить последний ход противника, потому что у метода getPreparedMove
//    стоит модификатор доступа private... поэтому данная атака как бы есть но она делает ровно ничего
//    что очень печально и грустно конечно ДА.
}

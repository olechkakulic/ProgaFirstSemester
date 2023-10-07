package attacks;

import ru.ifmo.se.pokemon.*;

//https://pokemondb.net/move/synthesis
public class SynthesisMove extends StatusMove {
    public SynthesisMove() {
//        хз указывать ли тут 0 0
//        https://pokemondb.net/move/synthesis
        super(Type.GRASS, 0, 0);
    }

    @Override
    protected String describe() {
        return "использует атаку Synthesis";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        double restoreHP = pokemon.getStat(Stat.HP) - pokemon.getHP();
        Effect effect = new Effect();
        effect.stat(Stat.HP, (int) -restoreHP);
        pokemon.addEffect(effect);
    }
}



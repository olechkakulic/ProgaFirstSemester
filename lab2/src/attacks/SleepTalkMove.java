package attacks;

import ru.ifmo.se.pokemon.*;

//        https://pokemondb.net/move/sleep-talk
public class SleepTalkMove extends StatusMove {
    public SleepTalkMove() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected String describe() {
        return "использует атаку Sleep Talk";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        if (pokemon.getCondition() == Status.SLEEP) {
            pokemon.setMod(Stat.ATTACK, 1);
        }
    }
}


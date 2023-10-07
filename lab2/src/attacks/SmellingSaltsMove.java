package attacks;

import ru.ifmo.se.pokemon.*;
//https://pokemondb.net/move/smelling-salts

public class SmellingSaltsMove extends PhysicalMove {
    public SmellingSaltsMove() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected String describe() {
        return "Использует атаку Smelling Salts";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
//        без if снялись бы все эффеккты, а нам надо только у парализованных покемонов снимать парализованный жффект
        if (pokemon.getCondition() == Status.PARALYZE) {
            pokemon.setCondition(new Effect());
        }
    }

    @Override
    protected double calcBaseDamage(Pokemon attacker, Pokemon defender) {
//        сразу положим результат вызова родительского метода в переменную

        double basedDamage = super.calcBaseDamage(attacker, defender);
        if (defender.getCondition() == Status.PARALYZE) {
            return basedDamage * 2;
        } else {
            return basedDamage;
        }

    }
}

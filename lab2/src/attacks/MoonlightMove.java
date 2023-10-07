package attacks;

import ru.ifmo.se.pokemon.*;

//https://pokemondb.net/move/moonlight
public class MoonlightMove extends StatusMove {
    public MoonlightMove() {
        super(Type.FAIRY, 0, 0);
    }

    @Override
    protected String describe() {
        return "использует атаку Sleep Talk";
    }


    //    мы переопределяем метод который есть в статус муве. Этот метод действует на нашего покемона.
//    Мы хотим добавить эффект с восстановлением HP. Создаем объект класса Effect. У этого объекта используем метод
//    stat который позволяет нам уз
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
//        в getStat мы для начала передаем конкретно HP чтобы этот метод вернул нам начальное значение жизней покемона.
//        затем мы вычтем из него getHP, кльлоый возвращает нам актуальное HP/
//        таким образом мы полу
        double restoreHP = pokemon.getStat(Stat.HP) - pokemon.getHP();
        Effect effect = new Effect();
//        первым аргументом мы передаем тип стата, стат у нас енам ес чо (заходи)
//        просто этот тупой стат он принимает не начальное значение жизней, а дельту - значение которое мы хотим добавить
//        если мы передадим положительное HP ТО ОН ИХ ВЫЧТЕТ ПИДАРАС А МЫ ХОТИМ ИХ ВЕРНУТЬ
//        просто потому что НУ ВОТ ТАК СДЕЛАЛИ КЛАС.........................................

        effect.stat(Stat.HP, (int) -restoreHP);
//        Effect e = new Effect().chance(0.5).turns(3).stat(Stat.ATTACK, -1);
//        мы могли бы в одну строчку написать, потоиу что просто эти методы возвращают тот же объект
        pokemon.addEffect(effect);
    }
}


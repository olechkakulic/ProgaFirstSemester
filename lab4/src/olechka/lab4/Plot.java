package olechka.lab4;


import olechka.lab4.button.Button;
import olechka.lab4.button.GamakButton;
import olechka.lab4.button.OpenCloseButton;
import olechka.lab4.button.PushFurnitureButton;
import olechka.lab4.furniture.*;
import olechka.lab4.human.Human;
import olechka.lab4.human.Shpuntik;
import olechka.lab4.human.Shurupchik;
import olechka.lab4.human.Vintik;
import olechka.lab4.inventory.NuclearBriefcase;
import olechka.lab4.space.Barn;
import olechka.lab4.space.Basement;
import olechka.lab4.space.MainRoom;
import olechka.lab4.space.Yard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Plot {
    private final Gamak gamak = new Gamak();
    private final GamakButton gamakButton = new GamakButton(gamak);
    private final Shurupchik shurupchik = new Shurupchik();
    private final Shpuntik shpuntik = new Shpuntik();
    private final Vintik vintik = new Vintik();
    private final NuclearBriefcase nuclearBriefcase = new NuclearBriefcase();


    //    предзаполненный список (класс анонимус)
    private final List<Human> visitors = new ArrayList<>() {
        //        безымянный конструктор
        {
            add(new Human(5, 92, 36, "Зритель 1"));
            add(new Human(5, 94, 37, "Зритель 2"));
            add(new Human(4, 95, 31, "Зритель 3"));
            add(new Human(6, 93, 32, "Зритель 4"));
            add(shpuntik);
            add(vintik);

        }
    };

    private final MainRoom mainRoom = new MainRoom();
    private final Basement basement = new Basement();
    private final Yard yard = new Yard();
    private final Barn barn = new Barn();

    private final OpenCloseButton basementButton = new OpenCloseButton(Color.WHITE, basement);
    //значения кнопкам мы присваиваем в методе prepare.
    private List<Button> buttons;
    private int timeInSecondsSinceSunrise;


    public Plot() {
        timeInSecondsSinceSunrise = 43200;
    }

    //создадим метод который подготавливает нам обстановку
    public void prepare() {
        List<Button> buttons = new ArrayList<>();
        mainRoom.addObjects(gamakButton, gamak);
        mainRoom.addObjects(basementButton);
        for (int i = 0; i < 5; i++) {
            Chair chair = new Chair(20, Material.CLOTH, Color.WHITE);
            PushFurnitureButton button = new PushFurnitureButton(chair, Color.PURPLE);
            mainRoom.addObjects(chair, button);
            buttons.add(button);
        }
        for (int i = 0; i < 7; i++) {
            Shelf shelf = new Shelf(10, Material.STONE, Color.GRAY);
            PushFurnitureButton button = new PushFurnitureButton(shelf, Color.BLUE);
            mainRoom.addObjects(shelf, button);
            buttons.add(button);
        }
        for (int i = 0; i < 2; i++) {
            Table table = new Table(30, Material.WOOD, Color.BROWN);
            PushFurnitureButton button = new PushFurnitureButton(table, Color.GRAY);
            mainRoom.addObjects(table, button);
            buttons.add(button);
        }
        for (int i = 0; i < 5; i++) {
            Closet closet = new Closet(10, Material.WOOD, Color.RED);
            OpenCloseButton button = new OpenCloseButton(Color.BLUE, closet);
            mainRoom.addObjects(closet, button);
            buttons.add(button);
        }
        for (int i = 0; i < 3; i++) {
            Pantry pantry = new Pantry(20, Material.METAL, Color.WHITE);
            OpenCloseButton button = new OpenCloseButton(Color.BLACK, pantry);
            mainRoom.addObjects(pantry, button);
            buttons.add(button);
        }
        gamak.humanLay(shurupchik);
        mainRoom.enter(shurupchik);
        mainRoom.enter(visitors);

        Collections.shuffle(buttons);
        this.buttons = buttons;
    }

    public void run() {
        shurupchik.pushButton(gamakButton);
        for (Human visitor : visitors) {
            visitor.surprise();
        }
        gamak.humanWakeUp();
        for (Button button : buttons) {
            shurupchik.pushButton(button);
        }
        shurupchik.pushButton(basementButton);
        mainRoom.leave(shurupchik);
        basement.enter(shurupchik);
        waitTimeInMinutes(1);
        basement.leave(shurupchik);
        yard.enter(shurupchik);
//        честно говоря щас оч хочется написать "идите нахуй!"
        shurupchik.say("Идите сюда! ");
        mainRoom.leave(shpuntik, vintik);
        yard.enter(shpuntik, vintik);
        shurupchik.say("Здесь у меня гараж!");
        shurupchik.bring(shpuntik, barn);
        shurupchik.bring(vintik, barn);
        shurupchik.openBrieface(nuclearBriefcase);
        Button deadButton = nuclearBriefcase.getButton();
        shurupchik.pushButton(deadButton);


    }

    public void waitTimeInMinutes(int minutes) {
        timeInSecondsSinceSunrise += (minutes * 60);
        System.out.println("Прошло минут: " + minutes);
    }
}

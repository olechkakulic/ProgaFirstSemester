package olechka.lab3;

import olechka.lab3.button.Button;
import olechka.lab3.button.GamakButton;
import olechka.lab3.button.OpenCloseButton;
import olechka.lab3.button.PushFurnitureButton;
import olechka.lab3.furniture.*;
import olechka.lab3.human.Human;
import olechka.lab3.human.Shurupchik;
import olechka.lab3.room.Basement;
import olechka.lab3.room.MainRoom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Plot {
    Gamak gamak = new Gamak();
    GamakButton gamakButton = new GamakButton(gamak);
    Shurupchik shurupchik = new Shurupchik();
    Human[] visitors = {
            new Human(5, 92, 36, "Зритель 1"),
            new Human(5, 94, 37, "Зритель 2"),
            new Human(4, 95, 31, "Зритель 3"),
            new Human(6, 93, 32, "Зритель 4"),
    };
    MainRoom mainRoom = new MainRoom();
    Basement basement = new Basement();
    OpenCloseButton basementButton = new OpenCloseButton(Color.WHITE, basement);

    List<Button> buttons = new ArrayList<>();

    public Plot() {
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
    }

    public void run() {
        gamakButton.interact(shurupchik);
        for (Human visitor : visitors) {
            visitor.surprise();
        }
        gamak.humanWakeUp();
        for (Button button : buttons) {
            button.interact(shurupchik);
        }
        basementButton.interact(shurupchik);
        mainRoom.leave(shurupchik);
        basement.enter(shurupchik);
    }
}

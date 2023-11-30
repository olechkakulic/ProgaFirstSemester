package olechka.lab4.inventory;

import olechka.lab4.Color;
import olechka.lab4.Material;
import olechka.lab4.button.Button;
import olechka.lab4.exception.AtomicExplosionError;

public class NuclearBriefcase extends Briefcase {
    public NuclearBriefcase() {
        super(20, Material.CLOTH, Color.ORANGE, "ядерный чемоданчик");
    }

    public Button getButton() {
        if (!isOpen) {
            throw new IllegalStateException("долбик сначала открой чемоданчик");
        }
        Button deadButton = new Button(20, Material.METAL, Color.RED) {
            @Override
            public void interacted() {
                super.interacted();
                if (isToggled) {
                    System.out.println("нажата кнопка ядерного чемоданчика всем соболезнуем");
                    throw new AtomicExplosionError();
                }
            }

        };
        return deadButton;
    }
}

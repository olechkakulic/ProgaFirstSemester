package olechka.lab4.button;

import olechka.lab4.Color;
import olechka.lab4.Material;
import olechka.lab4.interfaces.Openable;

import java.util.Objects;

public class OpenCloseButton extends Button {
    private final Openable openable;

    public OpenCloseButton(Color color, Openable openable) {
        super(20, Material.PLASTIC, color);
        this.openable = openable;
    }

    @Override
    public void interacted() {
        super.interacted();
        if (isToggled) {
            openable.open();
        } else {
            openable.close();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        OpenCloseButton button = (OpenCloseButton) o;
        return Objects.equals(openable, button.openable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), openable);
    }

    @Override
    public String toString() {
        return "OpenCloseButton{" +
                "openable=" + openable +
                ", isToggled=" + isToggled +
                ", size=" + size +
                ", material=" + material +
                ", color=" + color +
                '}';
    }
}

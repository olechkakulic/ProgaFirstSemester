package olechka.lab4;

import java.util.Objects;

public abstract class PhysicalObject {
    //    сделаем final потому что эти параметры не будут меняться
    protected final int size;
    protected final Material material;
    protected final Color color;

    //alt+insert может все САМ гений.
    public PhysicalObject(int size, Material material, Color color) {
        this.size = size;
        this.material = material;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhysicalObject object = (PhysicalObject) o;
        return size == object.size && material == object.material && color == object.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, material, color);
    }

    @Override
    public String toString() {
        return "PhysicalObject{" +
                "size=" + size +
                ", material=" + material +
                ", color=" + color +
                '}';
    }
}

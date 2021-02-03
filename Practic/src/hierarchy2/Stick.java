package hierarchy2;

import java.util.Objects;

public class Stick extends Chocolate{
    int size;
    final boolean withNuts;

    public Stick(String name, int price, int size, boolean withNuts){
        super(name, price);
        this.size = size;
        this.withNuts = withNuts;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stick stick = (Stick) o;
        return size == stick.size &&
                withNuts == stick.withNuts;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, withNuts);
    }
}

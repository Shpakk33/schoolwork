package hierarchy;

import java.util.Objects;

public class Square extends Figure {
    int size;
    final String name;

    public Square(int P, float S, int size, String name) {
        super(P, S);
        this.size = size;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return size * (int) (Math.random() * 100);
    }

}


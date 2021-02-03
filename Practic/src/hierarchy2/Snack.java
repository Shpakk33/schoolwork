package hierarchy2;

public class Snack extends Chocolate {
    int weight;
    final boolean withNuts;

    public Snack(String name, int price, int weight, boolean withNuts) {
        super(name,price);
        this.weight = weight;
        this.withNuts = withNuts;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "weight=" + weight +
                ", withNuts=" + withNuts +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return weight == snack.weight &&
                withNuts == snack.withNuts;
    }

    @Override
    public int hashCode() {
        return weight*(int)(Math.random()*100);
    }
}

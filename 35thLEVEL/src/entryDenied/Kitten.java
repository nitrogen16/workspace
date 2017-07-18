package entryDenied;

public class Kitten extends Cat {

    public Kitten(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Котенок " + name;
    }
}

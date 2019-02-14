package piggybank;

public class Nickle extends Money {

    public Nickle(int numOfMonies) {
        addMonies(numOfMonies);
        value = .05;
        name = "Nickle";
    }

    public Nickle() {
        addMonies(1);
        value = .05;
        name = "Nickle";
    }

    @Override
    public double getTotal() {
        return value * numOfMonies;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addMonies(int numOfMonies) {
        this.numOfMonies += numOfMonies;
    }
}

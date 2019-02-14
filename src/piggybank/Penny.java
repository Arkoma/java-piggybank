package piggybank;

public class Penny extends Money {

    public Penny(int numOfMonies) {
        addMonies(numOfMonies);
        value = .01;
        name = "Penny";
    }

    public Penny() {
        addMonies(1);
        value = .01;
        name = "Penny";
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

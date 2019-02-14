package piggybank;

public class Dime extends Money {

    public Dime(int numOfMonies) {
        addMonies(numOfMonies);
        value = .1;
        name = "Dime";
    }

    public Dime() {
        addMonies(1);
        value = .1;
        name = "Dime";
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

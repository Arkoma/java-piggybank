package piggybank;

public class Dollar extends Money  {

    public Dollar(int numOfMonies) {
        addMonies(numOfMonies);
        value = 1.0;
        name = "$";
    }

    public Dollar() {
        addMonies(1);
        value = 1.0;
        name = "$";
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

package piggybank;

public class Quarter extends Money {

    public Quarter(int numOfMonies) {
        addMonies(numOfMonies);
        value = .25;
        name = "Quarter";
    }

    public Quarter() {
        addMonies(1);
        value = .25;
        name = "Quarter";
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

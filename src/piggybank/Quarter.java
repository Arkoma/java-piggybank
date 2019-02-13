package piggybank;

public class Quarter extends Bill {

    public Quarter(int numOfCoins) {
        addCoins(numOfCoins);
    }

    public Quarter() {
        value = .25;
        name = "Quarter";
    }

    @Override
    public double getTotal() {
        return value * getNumOfBills();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addCoins(int numOfCoins) {
        this.numOfBills += numOfCoins;
    }

    @Override
    public int getNumOfBills() {
        return this.numOfBills;
    }
}

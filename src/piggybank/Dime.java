package piggybank;

public class Dime extends Bill {
    @Override
    public double getTotal() {
        return value * numOfBills;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void addCoins(int numOfCoins) {

    }

    @Override
    public int getNumOfBills() {
        return 0;
    }
}

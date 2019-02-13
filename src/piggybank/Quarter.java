package piggybank;

public class Quarter extends Coin {

    public Quarter(int numOfCoins) {
        super(numOfCoins);
        addCoins(numOfCoins);
    }

    public Quarter() {
        value = .25;
        name = "Quarter";
        numOfCoins = 0;
    }

    @Override
    public double getTotal() {
        return value * getNumOfCoins();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addCoins(int numOfCoins) {
        this.numOfCoins += numOfCoins;
    }

    @Override
    public int getNumOfCoins() {
        return this.numOfCoins;
    }
}

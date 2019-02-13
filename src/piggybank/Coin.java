package piggybank;

public abstract class Coin {

    public double total = 0;
    public double value = 0;
    public String name;
    public int numOfCoins = 0;


    public Coin(int numOfCoins) {
        addCoins(numOfCoins);
        }

    protected Coin() {
        this.total = total;
        this.name = name;
        this.numOfCoins = numOfCoins;
        this.value = value;
    }


    public abstract double getTotal();
    public abstract String getName();
    public abstract void addCoins(int numOfCoins);
    public abstract int getNumOfCoins();
}

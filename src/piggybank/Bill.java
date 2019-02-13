package piggybank;

public abstract class Bill {

    public double total = 0;
    public double value = 0;
    public String name;
    public int numOfBills = 1;


    public Bill(int numOfBills) {
        addCoins(numOfBills);
    }

    protected Bill() {
        this.total = total;
        this.name = name;
        this.numOfBills = numOfBills;
        this.value = value;
    }


    public abstract double getTotal();
    public abstract String getName();
    public abstract void addCoins(int numOfBills);
    public abstract int getNumOfBills();

    @Override
    public String toString() {
        return name + numOfBills;
    }
}

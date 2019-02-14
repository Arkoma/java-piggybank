package piggybank;

public abstract class Money {

    public double value = 0;
    public String name;
    public int numOfMonies = 0;


    public Money(int numOfMonies) {
        addMonies(numOfMonies);
        }

    protected Money() {
        this.name = name;
        this.numOfMonies = numOfMonies;
        this.value = value;
    }


    public abstract double getTotal();
    public abstract String getName();
    public abstract void addMonies(int numOfMonies);
}

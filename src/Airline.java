public class Airline {

    private String name;
    private double costPerCustomer;
    private double profitRate;

    public Airline(String name, double costPerCustomer, double profitRate) {
        this.name = name;
        this.costPerCustomer = costPerCustomer;
        this.profitRate = profitRate;
    }

    public String getName(){
        return name;
    }

    public double getCostPerCustomer() {
        return costPerCustomer;
    }

    public double getProfitRate() {
        return profitRate;
    }

}
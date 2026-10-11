public class Airline {

    private String name;
    private double costPerClient;
    private double profitTax;
    private double profitRate;

    public Airline(String name, double costPerClient, double profitRate, double profitTax) {
        this.name = name;
        this.costPerClient = costPerClient;
        this.profitTax = profitTax;
        this.profitRate = profitRate;
    }

    public String getName(){
        return name;
    }

    public double getCostPerClient() {
        return costPerClient;
    }

    public double getProfitRate() {
        return profitRate;
    }

    public double getProfitTax() {return profitTax;}
}
public class Airline {

    private String name;
    private double costPerClient;
    private double profitRate;

    public Airline(String name, double costPerClient, double profitRate) {
        this.name = name;
        this.costPerClient = costPerClient;
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

}
public class AirCraft {

    private String manufacturer;
    private String model;
    private int capacity;

    public AirCraft(String manufacturer, String model, int capacity){
        this.manufacturer = manufacturer;
        this.model = model;
        this.capacity = capacity;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

}

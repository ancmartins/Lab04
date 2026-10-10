public class Aircraft {

    private String manufacturer;
    private String model;
    private int capacity;

    public Aircraft(String manufacturer, String model, int capacity){
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

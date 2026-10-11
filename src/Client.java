import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {
    private String name;
    private List<Flight> flights;

    public Client(String name){
        this.name = name;
        flights = new ArrayList<Flight>();
    }

    public void addFlight( Flight flight){
        flights.add(flight);
    }

    public String getName() {
        return name;
    }

    public Iterator<Flight> getFlights(){return flights.iterator();}
}

import java.time.LocalTime;
import java.util.*;

public abstract class Flight {

    private int flightNumber;
    private String destination;
    private LocalTime departureTime;
    private String gate;

    private Airline company;
    private AirCraft aircraft;

    private List<Client> passengers;
    private Map<Client, Boarding> boardings;

    public Flight(int flightNumber, String destination, LocalTime departureTime, String gate, Airline company, AirCraft aircraft){
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.gate = gate;
        this.company = company;
        this.aircraft = aircraft;

        passengers = new ArrayList<>();
        boardings = new HashMap<>();
    }

    protected double baseCost() {
        return company.getCostPerClient() * (1 + company.getProfitRate());
    }

    public void addPassenger(Client passenger, Boarding boarding){
        passengers.add(passenger);
        boardings.put(passenger,boarding);
    }

    public Airport getBoardingAirport(Client passenger){
        return boardings.get(passenger).getBoarding();
    }

    public abstract double passengerCost();

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getGate() {
        return gate;
    }

    public Iterator<Client> getPassengers() {
        return passengers.iterator();
    }
}

import java.time.LocalTime;

public abstract class Flight {

    private int flightNumber;
    private String destination;
    private LocalTime departureTime;
    private String boardingGate;

    private Airline airline;
    private Aircraft aircraft;

    public Flight(int flightNumber, String destination, LocalTime departureTime, String boardingGate, Airline airline, Aircraft aircraft){
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.boardingGate = boardingGate;
        this.airline = airline;
        this.aircraft = aircraft;
    }

    protected double baseCost() {
        return airline.getCostPerCustomer() * (1 + airline.getProfitRate());
    }

    public abstract double calculateCost();

}

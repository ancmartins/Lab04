import java.time.LocalTime;

public class DirectFlight extends Flight {

    public DirectFlight(int flightNumber, String destination, LocalTime departureTime, String boardingGate, Airline airline, AirCraft aircraft){
        super(flightNumber, destination, departureTime, boardingGate, airline, aircraft);
    }

    public double passengerCost(){
        return baseCost();
    }

}

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class IndirectFlight extends Flight {

    private float additionalFee;
    private List<Airport> connections;

    public IndirectFlight(int flightNumber, String destination, LocalTime departureTime, String boardingGate, Airline airline,
                          AirCraft aircraft, float additionalFee, List<Airport> connections){

        super(flightNumber, destination, departureTime, boardingGate, airline, aircraft);
        this.additionalFee = additionalFee;
        this.connections = new ArrayList<>(connections);
    }

    public double passengerCost(){
        return baseCost() + additionalFee;
    }

}
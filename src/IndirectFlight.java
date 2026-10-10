import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class IndirectFlight extends Flight {

    private double additionalFee;
    private boolean boardingAtTransit;
    private List<Airport> stopovers = new ArrayList<>();

    public IndirectFlight(int flightNumber, String destination, LocalTime departureTime,
                          String boardingGate, Airline airline, Aircraft aircraft,
                          double additionalFee, boolean boardingAtTransit, List<Airport> stopovers){
        super(flightNumber, destination, departureTime, boardingGate, airline, aircraft);
        this.additionalFee = additionalFee;
        this.boardingAtTransit = boardingAtTransit;
        this.stopovers = new ArrayList<>(stopovers);
    }

    public double calculateCost(){
        return baseCost() + additionalFee;
    }

}
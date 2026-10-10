import java.time.LocalDateTime;

public class Boarding {

    private Airport boarding;
    private LocalDateTime boardingHour;

    public Boarding(Airport boarding, LocalDateTime boardingHour){
        this.boarding = boarding;
        this.boardingHour = boardingHour;
    }

    public Airport getBoarding(){
        return boarding;
    }

    public LocalDateTime getBoardingHour() {
        return boardingHour;
    }
}

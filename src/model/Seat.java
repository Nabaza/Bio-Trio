package model;

/**
 * Defines a seat entity in a cinema
 * @author Mads
 */
public class Seat {
    private boolean status;
    private final int ROW, SEAT;
    
    public Seat(int row, int seat){
        status = false;
        this.ROW = row;
        this.SEAT = seat;
    }
    
    @Override
    public String toString(){
        return "Række " + ROW +", sæde " + SEAT;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
package model;

/**
 * Defines a cinema/room/hall entity
 *
 * @author Mads
 */
public class Cinema {
    private final String NUMBER;
    private final int ROW_COUNT;
    private final int SEAT_COUNT;
    private final int SEAT_SUM;
    private final Seat[][] SEATS;

    public Cinema(String number, int rowCount, int seatCount) {
        NUMBER = number;
        ROW_COUNT = rowCount;
        SEAT_COUNT = seatCount;
        SEAT_SUM = ROW_COUNT * SEAT_COUNT;
        SEATS = initializeSeats();
    }

    private Seat[][] initializeSeats() {
        Seat[][] seats = new Seat[ROW_COUNT][SEAT_COUNT];

        for (int row = 0; row < ROW_COUNT; row++) {
            for (int seat = 0; seat < SEAT_COUNT; seat++) {
                seats[row][seat] = new Seat(row, seat);
            }
        }
        return seats;
    }
    
    public Seat getSeat(int row, int seat){
        return SEATS[row][seat];
    }
    
    public Seat[][] getSEATS() {
        return SEATS;
    }

    @Override
    public String toString() {
        return "Sal " + NUMBER;
    }

    public String getNUMBER() {
        return NUMBER;
    }

    public int getROW_COUNT() {
        return ROW_COUNT;
    }

    public int getSEAT_COUNT() {
        return SEAT_COUNT;
    }

    public int getSEAT_SUM() {
        return SEAT_SUM;
    }
}
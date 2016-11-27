package model;

import java.util.ArrayList;

/**
 * Final booking information for a customer
 *
 * @author Mads
 */
public class Booking {
    private final Customer CUSTOMER;
    private final Show SHOW;
    private final ArrayList<Seat> BOOKED_SEATS;

    public Booking(Customer customer, Show show, ArrayList bookedSeats) {
        CUSTOMER = customer;
        SHOW = show;
        BOOKED_SEATS = bookedSeats;
    }

    @Override
    public String toString() {
        String output = CUSTOMER.toString() + "\n" + SHOW.toString();
        for (Seat seat : BOOKED_SEATS) {
            output = output + "\n" + seat.toString();
        }
        return output;
    }
}

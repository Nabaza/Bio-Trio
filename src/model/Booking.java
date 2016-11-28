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
    private final int PRICE;

    public Booking(Customer customer, Show show, ArrayList bookedSeats) {
        CUSTOMER = customer;
        SHOW = show;
        BOOKED_SEATS = bookedSeats;
        PRICE = priceFinalize();
    }

    private int priceFinalize() {
        int price = 0;
        for (Seat seat : BOOKED_SEATS) {
            price = price + 100;
        }
        if (BOOKED_SEATS.size() == 4) {
            price = price - 50;
        }
        return price;
    }

    @Override
    public String toString() {
        String output = CUSTOMER.toString() + "\n" + SHOW.toString();
        for (Seat seat : BOOKED_SEATS) {
            output = output + "\n" + seat.toString();
        }
        return output + "\nSamlet pris: " + PRICE;
    }
}

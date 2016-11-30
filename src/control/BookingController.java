package control;

import dataAccess.DatabaseHandler;
import java.util.ArrayList;
import model.Booking;
import model.Customer;
import model.Show;

/**
 *
 * @author Mads
 */
public class BookingController {
    private final DatabaseHandler CONNECT;

    public BookingController() {
        CONNECT = DatabaseHandler.getInstance();
    }

    public void createBooking(Customer customer, Show show, ArrayList bookedSeats) {
        Booking booking = new Booking(customer, show, bookedSeats);
        CONNECT.insertBooking(booking);
    }
}

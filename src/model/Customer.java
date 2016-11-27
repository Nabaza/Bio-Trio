package model;

/**
 *
 * @author Mads
 */
public class Customer {
    private final String NAME;
    private final String PHONE;
    
    public Customer(String name, String phone){
//        name and phone for booking, phone will be used as ID
        this.NAME = name;
        this.PHONE = phone;
    }

    @Override
    public String toString() {
        return NAME + "{" + "Booking nr.: " + PHONE + "}";
    }

    public String getPHONE() {
        return PHONE;
    }
}
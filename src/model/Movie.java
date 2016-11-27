package model;

/**
 * Movie information
 * @author Mads
 */
public class Movie {
    private final String TITLE;
    
    public Movie(String title){
        this.TITLE = title;
    }

    @Override
    public String toString(){
        return "Film: " + TITLE;
    }
    
    public String getTITLE() {
        return TITLE;
    }
}
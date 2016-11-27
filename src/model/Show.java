package model;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Collects all information needed for definition of a complete show
 * @author Mads
 */
public class Show {
    private final Movie MOVIE;
    private final Cinema CINEMA;
    private final LocalDate DATE;
    private final LocalTime TIME;
    
    public Show(Movie movie, Cinema cinema, LocalDate date, LocalTime time){
        this.MOVIE = movie;
        this.CINEMA = cinema;
        this.DATE = date;
        this.TIME = time;            
    }
    
    @Override
    public String toString(){
        return MOVIE.toString() + "\n"
                + CINEMA.toString()
                + "\nDato: " + DATE
                + "\nTid: " + TIME;
    }

    public Movie getMOVIE() {
        return MOVIE;
    }

    public Cinema getCINEMA() {
        return CINEMA;
    }

    public LocalDate getDATE() {
        return DATE;
    }

    public LocalTime getTIME() {
        return TIME;
    }
}
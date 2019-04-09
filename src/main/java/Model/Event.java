package Model;

import java.time.LocalDateTime;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;

public class Event extends AbstractModel {

    private String name;

    private NavigableSet<LocalDateTime> airDates = new TreeSet<>();

    private double basePrice;

    private EventRating rating;

    private NavigableMap<LocalDateTime, Place> auditoriums = new TreeMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NavigableSet<LocalDateTime> getAirDates() {
        return airDates;
    }

    public void setAirDates(NavigableSet<LocalDateTime> airDates) {
        this.airDates = airDates;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public EventRating getRating() {
        return rating;
    }

    public void setRating(EventRating rating) {
        this.rating = rating;
    }

    public NavigableMap<LocalDateTime, Place> getAuditoriums() {
        return auditoriums;
    }

    public void setAuditoriums(NavigableMap<LocalDateTime, Place> auditoriums) {
        this.auditoriums = auditoriums;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Event event = (Event) o;
        return Double.compare(event.basePrice, basePrice) == 0 &&
            Objects.equals(name, event.name) &&
            Objects.equals(airDates, event.airDates) &&
            rating == event.rating &&
            Objects.equals(auditoriums, event.auditoriums);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, airDates, basePrice, rating, auditoriums);
    }

    @Override
    public String toString() {
        return "Event{" +
            "name='" + name + '\'' +
            ", airDates=" + airDates +
            ", basePrice=" + basePrice +
            ", rating=" + rating +
            ", auditoriums=" + auditoriums +
            '}';
    }
}

package Model;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;

public class Place extends AbstractModel {

    private String name;

    private long numberOfSeats;

    private Set<Long> vipSeats = Collections.emptySet();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(long numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Set<Long> getVipSeats() {
        return vipSeats;
    }

    public void setVipSeats(Set<Long> vipSeats) {
        this.vipSeats = vipSeats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Place place = (Place) o;
        return numberOfSeats == place.numberOfSeats &&
            Objects.equals(name, place.name) &&
            Objects.equals(vipSeats, place.vipSeats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberOfSeats, vipSeats);
    }

    @Override
    public String toString() {
        return "Place{" +
            "name='" + name + '\'' +
            ", numberOfSeats=" + numberOfSeats +
            ", vipSeats=" + vipSeats +
            '}';
    }
}

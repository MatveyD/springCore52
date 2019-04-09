package Model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Ticket {

    private User user;

    private Event event;

    private LocalDateTime dateTime;

    private long seat;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public long getSeat() {
        return seat;
    }

    public void setSeat(long seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Event{" +
            "user=" + user +
            ", event=" + event +
            ", dateTime=" + dateTime +
            ", seat=" + seat +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ticket ticket = (Ticket) o;
        return seat == ticket.seat &&
            Objects.equals(user, ticket.user) &&
            Objects.equals(event, ticket.event) &&
            Objects.equals(dateTime, ticket.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, event, dateTime, seat);
    }
}

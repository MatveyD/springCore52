package service.impl;

import Model.Event;
import Model.Ticket;
import Model.User;
import java.time.LocalDateTime;
import java.util.Set;
import service.BookingService;

public class BookingServiceImpl implements BookingService {

    @Override
    public double getTicketsPrice(Event event, LocalDateTime dateTime, User user, Set<Long> seats) {
        return 0;
    }

    @Override
    public void bookTickets(Set<Ticket> tickets) {

    }

    @Override
    public Set<Ticket> getPurchasedTicketsForEvent(Event event, LocalDateTime dateTime) {
        return null;
    }
}

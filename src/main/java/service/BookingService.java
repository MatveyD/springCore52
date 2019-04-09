package service;

import Model.Event;
import Model.Ticket;
import Model.User;
import java.time.LocalDateTime;
import java.util.Set;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

public interface BookingService {

    /**
     * Getting price when buying all supplied seats for particular event
     *
     * @param event
     *            Event to get base ticket price, vip seats and other
     *            information
     * @param dateTime
     *            Date and time of event air
     * @param user
     *            User that buys ticket could be needed to calculate discount.
     *            Can be <code>null</code>
     * @param seats
     *            Set of seat numbers that user wants to buy
     * @return total price
     */
    double getTicketsPrice(@NonNull Event event, @NonNull LocalDateTime dateTime, @Nullable User user,
        @NonNull Set<Long> seats);


    /**
     * Books tickets in internal system. If user is not
     * <code>null</code> in a ticket then booked tickets are saved with it
     *
     * @param tickets
     *            Set of tickets
     */
    void bookTickets(@NonNull Set<Ticket> tickets);


    /**
     * Getting all purchased tickets for event on specific air date and time
     *
     * @param event
     *            Event to get tickets for
     * @param dateTime
     *            Date and time of airing of event
     * @return set of all purchased tickets
     */
    Set<Ticket> getPurchasedTicketsForEvent(@NonNull Event event, @NonNull LocalDateTime dateTime);




}

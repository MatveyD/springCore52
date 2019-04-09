package service;

import Model.Event;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;
import org.springframework.lang.NonNull;

public interface EventService {

    /**
     * Finding event by name
     *
     * @param name Name of the event
     * @return found event or <code>null</code>
     */
    Event getByName(@NonNull String name);


    /**
     * Finding all events that air on specified date range
     *
     * @param from Start date
     * @param to End date inclusive
     * @return Set of events
     */
    Set<Event> getForDateRange(@NonNull LocalDate from, @NonNull LocalDate to);

    /**
     * Return events from 'now' till the the specified date time
     *
     * @param to End date time inclusive s
     * @return Set of events
     */
    Set<Event> getNextEvents(@NonNull LocalDateTime to);

}

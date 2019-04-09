package service.impl;

import Model.Event;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;
import service.EventService;

public class EventServiceImpl implements EventService {


    @Override
    public Event getByName(String name) {
        return null;
    }

    @Override
    public Set<Event> getForDateRange(LocalDate from, LocalDate to) {
        return null;
    }

    @Override
    public Set<Event> getNextEvents(LocalDateTime to) {
        return null;
    }
}

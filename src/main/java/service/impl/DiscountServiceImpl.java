package service.impl;

import Model.Event;
import Model.User;
import java.time.LocalDateTime;
import service.DiscountService;

public class DiscountServiceImpl implements DiscountService {

    @Override
    public byte getDiscount(User user, Event event, LocalDateTime airDateTime, long numberOfTickets) {
        return 0;
    }
}

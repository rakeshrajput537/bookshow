package com.minify.bookshow.models;

import java.util.Date;
import java.util.List;

public class Ticket extends BaseModel{
    private Show show;
    private List<Payment> payments;
    private double amount;
    private List<ShowSeat> showSeats;
    private Date bookingTime;
    private TicketStatus ticketStatus;

}

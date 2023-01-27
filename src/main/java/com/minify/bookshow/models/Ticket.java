package com.minify.bookshow.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Getter
@Setter
@Entity
public class Ticket extends BaseModel{
    @ManyToOne
    private Show show;
    @OneToMany
    private List<Payment> payments;
    private double amount;
    @ManyToMany // because of cancellation of seat
    private List<ShowSeat> showSeats;
    private Date bookingTime;
    @Enumerated(EnumType.ORDINAL)
    private TicketStatus ticketStatus;

}

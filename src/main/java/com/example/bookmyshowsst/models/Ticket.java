package com.example.bookmyshowsst.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity

public class Ticket extends BaseModel{
    private String ticketNumber;
    private Date timestamp;

    @ManyToOne
//    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @OneToMany
    private List<ShowSeat> showSeats;
    private Double amount;

    @OneToOne
    private Payment payment;

    @Enumerated(EnumType.ORDINAL)
    private TicketStatus ticketStatus; // Booked, Cancelled, Refunded

}

package com.minify.bookshow.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    // S: ST
    @ManyToOne
    private SeatType seatType;
    private String name;
    private int row;
    private int col;
}

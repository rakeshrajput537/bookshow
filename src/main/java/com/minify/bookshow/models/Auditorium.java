package com.minify.bookshow.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@Entity
public class Auditorium extends BaseModel{
    private String name;
    // A:S -> Cardinality
    // 1:m
    // 1:1
    @OneToMany(mappedBy = "auditorium")
    private List<Show> shows;
    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Feature> features;

    // A: S
    // 1:m
    // 1:1
    @OneToMany
    private List<Seat> seats;
}

package com.minify.bookshow.models;

import java.util.List;

public class Auditorium extends BaseModel{
    private String name;
    private List<Show> shows;
    private List<Feature> features;
    private List<Seat> seats;
}

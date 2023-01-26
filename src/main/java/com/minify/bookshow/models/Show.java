package com.minify.bookshow.models;

import java.util.Date;
import java.util.List;

public class Show  extends BaseModel {
    private Auditorium auditorium;
    private Date startTime;
    private Date endTime;
    private Movie movie;
    private List<Feature> features;
}

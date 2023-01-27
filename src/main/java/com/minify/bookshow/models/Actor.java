package com.minify.bookshow.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Actor extends BaseModel{
    private String name;
}

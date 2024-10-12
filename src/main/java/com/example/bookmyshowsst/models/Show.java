package com.example.bookmyshowsst.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter

@Entity

public class Show extends BaseModel{
    @ManyToOne
    private Movie movie;

    private Date startDate;
    private Date endDate;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> features;

    @ManyToOne
    private Screen screen;
    private String language;
}

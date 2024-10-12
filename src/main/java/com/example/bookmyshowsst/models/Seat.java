package com.example.bookmyshowsst.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity

public class Seat extends BaseModel{
    private String name;
    private Integer rowNum;
    private Integer colNum;

    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;
}

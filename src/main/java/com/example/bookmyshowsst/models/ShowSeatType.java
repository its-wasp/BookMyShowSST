package com.example.bookmyshowsst.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.type.descriptor.jdbc.OrdinalEnumJdbcType;

@Getter
@Setter
@Entity

public class ShowSeatType extends BaseModel{
    @ManyToOne
    private Show show;

    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;

    private Integer price;
}

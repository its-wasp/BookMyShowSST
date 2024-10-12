package com.example.bookmyshowsst.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.type.descriptor.jdbc.OrdinalEnumJdbcType;

@Getter
@Setter
@Entity(name = "shows")
public class ShowSeat extends BaseModel{
    @ManyToOne
    private Show singleShow;

    @ManyToOne
    private Seat seat;

    @Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus showSeatStatus;
}

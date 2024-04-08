package com.mattflug.ScheduleApp.models;
import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "days")
public class Schedule {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "day_id")
    private Integer id;

    @Column(name = "date", nullable = false)
    private LocalDateTime date;

    public enum Location {
        OFFICE, HOME, FIELD, OOO
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "location")
    private Location location;


}

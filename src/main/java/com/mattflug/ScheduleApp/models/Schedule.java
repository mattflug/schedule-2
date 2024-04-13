package com.mattflug.ScheduleApp.models;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "weeks")
public class Schedule {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "week_id")
    private Integer id;

//    @Column(name = "date", nullable = false)
//    private LocalDateTime date;

    private String notes;

    //constructor
    public Schedule () {

    }

    //getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "id=" + id +
                ", notes='" + notes + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Schedule schedule = (Schedule) o;
        return Objects.equals(id, schedule.id) && Objects.equals(notes, schedule.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, notes);
    }
}

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

    @Column(name = "date", nullable = false)
    private LocalDateTime date;

    public enum Monday {
        OFFICE, HOME, FIELD, OOO
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "monday")
    private Monday monday;

    public enum Tuesday {
        OFFICE, HOME, FIELD, OOO
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "tuesday")
    private Tuesday tuesday;

    public enum Wednesday {
        OFFICE, HOME, FIELD, OOO
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "wednesday")
    private Wednesday wednesday;

    public enum Thursday {
        OFFICE, HOME, FIELD, OOO
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "thursday")
    private Thursday thursday;

    public enum Friday {
        OFFICE, HOME, FIELD, OOO
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "friday")
    private Friday friday;

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

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Monday getMonday() {
        return monday;
    }

    public void setMonday(Monday monday) {
        this.monday = monday;
    }

    public Tuesday getTuesday() {
        return tuesday;
    }

    public void setTuesday(Tuesday tuesday) {
        this.tuesday = tuesday;
    }

    public Wednesday getWednesday() {
        return wednesday;
    }

    public void setWednesday(Wednesday wednesday) {
        this.wednesday = wednesday;
    }

    public Thursday getThursday() {
        return thursday;
    }

    public void setThursday(Thursday thursday) {
        this.thursday = thursday;
    }

    public Friday getFriday() {
        return friday;
    }

    public void setFriday(Friday friday) {
        this.friday = friday;
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
                ", date=" + date +
                ", monday=" + monday +
                ", tuesday=" + tuesday +
                ", wednesday=" + wednesday +
                ", thursday=" + thursday +
                ", friday=" + friday +
                ", notes='" + notes + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Schedule schedule = (Schedule) o;
        return Objects.equals(id, schedule.id) && Objects.equals(date, schedule.date) && monday == schedule.monday && tuesday == schedule.tuesday && wednesday == schedule.wednesday && thursday == schedule.thursday && friday == schedule.friday && Objects.equals(notes, schedule.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, monday, tuesday, wednesday, thursday, friday, notes);
    }
}

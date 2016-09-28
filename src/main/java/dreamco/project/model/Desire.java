package dreamco.project.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by Artyom on 19.09.2016.
 */
public class Desire extends BaseEntity{ // Описание параметров бартера
    private Integer id;

    private final LocalDateTime dateTime;

    private final String desireDescription;

    private final String barterPropose;

    public Desire(LocalDateTime dateTime, String description, String barterPropose) {
        this(null, dateTime, description, barterPropose);
    }


    public Desire(Integer id, LocalDateTime dateTime, String desireDescription, String barterPropose) {
        this.id = id;
        this.dateTime = dateTime;
        this.desireDescription = desireDescription;
        this.barterPropose = barterPropose;
    }


    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getDesireDescription() {
        return desireDescription;
    }


    public LocalDate getDate() {
        return dateTime.toLocalDate();
    }

    public LocalTime getTime() {
        return dateTime.toLocalTime();
    }

    public String getBarterPropose() {
        return barterPropose;
    }

    @Override
    public String toString() {
        return "Desire{" +
                "id=" + id +
                ", dateTime=" + dateTime +
                ", desireDescription='" + desireDescription + '\'' +
                ", barterPropose='" + barterPropose + '\'' +
                '}';
    }
}

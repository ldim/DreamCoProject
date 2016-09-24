package dreamco.project.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by Artyom on 19.09.2016.
 */
public class UserDesire {

    private final LocalDateTime dateTime;

    private final String desireDescription;

    private final String barterPropose;


    public UserDesire(LocalDateTime dateTime, String desireDescription, String barterPropose) {
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
}

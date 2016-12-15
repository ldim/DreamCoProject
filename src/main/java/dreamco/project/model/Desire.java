package dreamco.project.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by temaprof on 19.09.2016.
 */
public class Desire extends BaseEntity { // Описание параметров бартера

    private LocalDateTime dateTime;

    private String description;

    private String barter;

    private String categories;

    public String getCategories() {
        return categories;
    }

    public Desire() {

    }

    public Desire(LocalDateTime dateTime, String description, String barterPropose, String categories) {
        this(null, dateTime, description, barterPropose, categories);
    }

    public Desire(Integer id, LocalDateTime dateTime, String desireDescription, String barterPropose, String categories) {
        super(id);
        this.dateTime = dateTime;
        this.description = desireDescription;
        this.barter = barterPropose;
        this.categories = categories;
    }


    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBarter(String barter) {
        this.barter = barter;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getDescription() {
        return description;
    }


    public LocalDate getDate() {
        return dateTime.toLocalDate();
    }

    public LocalTime getTime() {
        return dateTime.toLocalTime();
    }

    public String getBarter() {
        return barter;
    }


    @Override
    public String toString() {
        return "Desire{" +
                "id=" + id +
                ", dateTime=" + dateTime +
                ", description='" + description + '\'' +
                ", barter='" + barter + '\'' +
                ", categories='" + categories + '\'' +
                '}';
    }
}

package dreamco.project.model;

/**
 * User: Artyom
 * Date: 19.09.2016
 */
public class BaseEntity { // Класс для хранения сущностей
    protected Integer id;

    public BaseEntity() {
    }

    protected BaseEntity(Integer id) {
        this.id = id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public boolean isNew() {
        return (this.id == null);
    }
}

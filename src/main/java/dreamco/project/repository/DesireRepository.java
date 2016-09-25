package dreamco.project.repository;

import dreamco.project.model.Desire;

import java.util.Collection;

/**
 * Created by Artyom on 25.09.2016.
 */
public interface DesireRepository {
    Desire save(Desire desire);

    void delete(int id);

    Desire get(int id);

    Collection<Desire> getAll();
}

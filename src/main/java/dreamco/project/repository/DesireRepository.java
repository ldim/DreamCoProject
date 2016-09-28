package dreamco.project.repository;

import dreamco.project.model.Desire;

import java.util.Collection;

/**
 * Created by Artyom on 25.09.2016.
 */
public interface DesireRepository {
    // null if updated meal do not belong to userId
    Desire save(Desire Desire, int userId);

    // false if meal do not belong to userId
    boolean delete(int id, int userId);

    // null if meal do not belong to userId
    Desire get(int id, int userId);

    // ORDERED dateTime
    Collection<Desire> getAll(int userId);
}

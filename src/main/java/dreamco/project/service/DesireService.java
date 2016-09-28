package dreamco.project.service;

import dreamco.project.model.Desire;
import dreamco.project.util.exception.NotFoundException;

import java.util.Collection;

/**
 * User: Artyom
 * Date: 19.09.2016
 */
public interface DesireService {
    Desire get(int id, int userId) throws NotFoundException;

    void delete(int id, int userId) throws NotFoundException;

    Collection<Desire> getAll(int userId);

    Desire update(Desire desire, int userId) throws NotFoundException;

    Desire save(Desire desire, int userId);
}

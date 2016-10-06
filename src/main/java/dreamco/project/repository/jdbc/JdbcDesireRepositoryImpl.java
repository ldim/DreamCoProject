package dreamco.project.repository.jdbc;

import dreamco.project.model.Desire;
import dreamco.project.repository.DesireRepository;
import org.springframework.stereotype.Repository;


import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * User: temaprof
 * Date: 26.09.2016
 */

@Repository
public class JdbcDesireRepositoryImpl implements DesireRepository {

    @Override
    public Desire save(Desire Desire, int userId) {
        return null;
    }

    @Override
    public boolean delete(int id, int userId) {
        return false;
    }

    @Override
    public Desire get(int id, int userId) {
        return null;
    }

    @Override
    public List<Desire> getAll(int userId) {
        return null;
    }

    @Override
    public Collection<Desire> getBetween(String category, int userId) {
        return null;
    }


}

package dreamco.project.repository;

import dreamco.project.model.Desire;
import dreamco.project.util.DesireUtil;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Artyom on 25.09.2016.
 */
public class InMemoryDesireRepositoryImpl implements DesireRepository {
    private Map<Integer, Desire> repository = new ConcurrentHashMap<>();
    private AtomicInteger counter = new AtomicInteger(0);

    {
        DesireUtil.BARTER.forEach(this::save);
    }

    @Override
    public Desire save(Desire desire) {
        if(desire.isNew()){
            desire.setId(counter.incrementAndGet());
        }
        repository.put(desire.getId(), desire);
        return desire;
    }

    @Override
    public void delete(int id) {
        repository.remove(id);
    }

    @Override
    public Desire get(int id) {
        return repository.get(id);
    }

    @Override
    public Collection<Desire> getAll() {
        return repository.values();
    }
}

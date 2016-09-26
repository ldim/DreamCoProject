package dreamco.project.service;


import dreamco.project.repository.DesireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: Artyom
 * Date: 19.09.2016
 */
@Service
public class DesireServiceImpl implements DesireService {
    @Autowired
    private DesireRepository repository;

}

package dreamco.project.util;

import dreamco.project.model.Categories;
import dreamco.project.model.Desire;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Artyom on 24.09.2016.
 */
public class DesireUtil {
    public static final List<Desire> BARTER = Arrays.asList(
            new Desire(LocalDateTime.of(2016, Month.SEPTEMBER, 24, 9, 0), "Need apple iphone 7", "Do something for you", "Desire"),
            new Desire(LocalDateTime.of(2016, Month.SEPTEMBER, 22, 14, 23), "Need Tesla model S", "Do something for you", "Job"),
            new Desire(LocalDateTime.of(2016, Month.SEPTEMBER, 17, 6, 35), "Need some house in California", "Do something for you", "Hobbie")
    );

    public static final int DEFAULT_BARTER = 3;

    public static List<Desire> getBARTER() {
        return BARTER;
    }

    public static List<Desire> getBARTERwithCollections(Collection<Desire> desires, int DEFAULT_BARTER) {

        return desires.stream().collect(Collectors.toList());
    }

    public static List<Desire> getFilteredWithCategory(Collection<Desire> desires, String category) {
       // CategoriesUtil.categoryInitialize(Collections.synchronizedCollection(desires));
        List<Desire> categoriesList = Collections.synchronizedList(CategoriesUtil.getCategory(category));
        return categoriesList;
    }
}

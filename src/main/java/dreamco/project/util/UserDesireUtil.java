package dreamco.project.util;

import dreamco.project.model.UserDesire;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Artyom on 24.09.2016.
 */
public class UserDesireUtil {
    public static final List<UserDesire> BARTER = Arrays.asList(
            new UserDesire(LocalDateTime.of(2016, Month.SEPTEMBER, 24, 9, 0), "Need apple iphone 7", "Do something for you"),
            new UserDesire(LocalDateTime.of(2016, Month.SEPTEMBER, 22, 14, 23), "Need Tesla model S", "Do something for you"),
            new UserDesire(LocalDateTime.of(2016, Month.SEPTEMBER, 17, 6, 35), "Need some house in California", "Do something for you")
    );

    public static List<UserDesire> getBARTER() {
        return BARTER;
    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class dayOneTests {
    @Test
    public void convertsToArrays() {
       DayOne dayOne = new DayOne();
       dayOne.splitList();
    }

    @Test
    public void getsLastThree() {
DayTwo dayTwo = new DayTwo();
Assertions.assertEquals(206104, dayTwo.lastThree());
;
    }
}

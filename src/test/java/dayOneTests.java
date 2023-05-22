import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class dayOneTests {
    @Test
    public void convertsToArrays() {
       DayOne dayOne = new DayOne();
       dayOne.splitList();
    }

    @Test
    public void getsLastThree() {
DayOnePtTwo dayOnePtTwo = new DayOnePtTwo();
Assertions.assertEquals(206104, dayOnePtTwo.lastThree());
;
    }
}

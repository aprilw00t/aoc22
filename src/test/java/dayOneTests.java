import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class dayOneTests {
    @Test
    public void convertsToArrays(){
        DayOne dayone = new DayOne();
        String input = "10 3 4 \\n\\n 8 7";
        int[] output = dayone.splitList(input);
        Assertions.assertArrayEquals(output, new int[]{17, 15});
    }
}

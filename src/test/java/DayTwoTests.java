import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DayTwoTests {
    //A, X rock score 1
    //B, Y paper score 2
    //C, Z scissors score 3
    // 0 lost, 3 draw, 6 win
    @Test
    public void correctAnswerForTwoNumber(){
DayTwo dayTwo = new DayTwo();
int scoreLose = dayTwo.addsScore("A", "Z");
        Assertions.assertEquals(3, scoreLose);
        int scoreWin = dayTwo.addsScore("B", "Z");
        Assertions.assertEquals(12, scoreWin);

    }
}

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class DayTwo {
    Integer score = 0;
    int addsScore(String opponent, String own){
        if(Objects.equals(own, "X")){score = score + 1;}
        if(Objects.equals(own, "Y")){score = score + 2;}
        if(Objects.equals(own, "Z")){score = score + 3;}
        if(Objects.equals(opponent, "A") && Objects.equals(own, "Y")){score = score + 6;}
        if(Objects.equals(opponent, "B") && Objects.equals(own, "Z")){score = score + 6;}
        if(Objects.equals(opponent, "C") && Objects.equals(own, "X")){score = score + 6;}
        if(Objects.equals(opponent, "A") && Objects.equals(own, "X")){score = score + 3;}
        if(Objects.equals(opponent, "B") && Objects.equals(own, "Y")){score = score + 3;}
        if(Objects.equals(opponent, "C") && Objects.equals(own, "Z")){score = score + 3;}

        return score;}

    int scanFileGetAnswer(){
        String fileName = "C:\\Users\\April\\IdeaProjects\\AOC2022\\src\\main\\resources\\dayTwoInput.txt";
        String[] totals = {};
        //read file into stream, try-with-resources

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            List<String> linesList = Files.readAllLines(Paths.get(fileName));
            totals = linesList.toArray(new String[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(int i = 0; i < totals.length; i++ )
        {
            addsScore(String.valueOf(totals[i].charAt(0)), String.valueOf(totals[i].charAt(2)));
        }
        System.out.println(score);
        return score;
    }
}

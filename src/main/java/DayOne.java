import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class DayOne {



    public int[] splitList(String input) {
        String fileName = "C:\\Users\\April\\IdeaProjects\\AOC2022\\src\\main\\resources\\dayOneinput.txt";
int total = 0;
ArrayList<Integer> Totals = new ArrayList<>();
        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            stream.forEach(item -> {
                        if (item.equals("\n")) {
                            Totals.add(Integer.valueOf(total));
                        }
                    }
            );

        } catch (IOException e) {
            e.printStackTrace();
        }
        return new int[]{2};
    }
}

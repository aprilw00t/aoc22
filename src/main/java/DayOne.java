import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class DayOne {
    public ArrayList<Integer> splitList() {
        String fileName = "C:\\Users\\April\\IdeaProjects\\AOC2022\\src\\main\\resources\\dayOneinput.txt";
        int total = 0;
        ArrayList<Integer> Totals = new ArrayList<>();
        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(item -> {
                        if (item.equals("")) {
                            Totals.add(-1);
                        } else {
                            Totals.add(Integer.valueOf(item));
                        }
                    }
            );

        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<Integer> calories = new ArrayList<>();
        for (Integer berry : Totals
        ) {
            if (berry >= 0) {
                total = total + berry;
            } else {
                calories.add(total);
                total = 0;
            }
        }
        System.out.println("Maximum Element in ArrayList = "
                + Collections.max(calories));
        return calories;
    }
}

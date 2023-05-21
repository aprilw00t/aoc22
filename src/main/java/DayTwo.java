import java.util.ArrayList;
import java.util.Collections;

public class DayTwo {
    DayOne dayOne = new DayOne();
    public int lastThree(){
        ArrayList<Integer> calories = dayOne.splitList();
        Collections.sort(calories);
        System.out.println(calories);
return calories.get(calories.size()-1) + calories.get(calories.size()-2) + calories.get(calories.size()-3);

}}

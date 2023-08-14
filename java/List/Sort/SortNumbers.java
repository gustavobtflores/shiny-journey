package Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortNumbers  {
    List<Integer> numbers;

    public SortNumbers(){
        numbers = new ArrayList<Integer>();
    }

    public void addNumber(int number){
        numbers.add(number);
    }

    public List<Integer> sortAscending(){
        List<Integer> sortedNumbers = new ArrayList<>(numbers);
        Collections.sort(sortedNumbers);

        return sortedNumbers;
    }

    public List<Integer> sortDescending(){
        List<Integer> sortedNumbers = new ArrayList<>(numbers);
        Collections.sort(sortedNumbers, Collections.reverseOrder());
        return sortedNumbers;
    }
}

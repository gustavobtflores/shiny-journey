package list.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortNumbers {
    List<Integer> numbers;

    public SortNumbers() {
        numbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public List<Integer> sortAscending() {
        List<Integer> sortedNumbers = new ArrayList<>(numbers);
        Collections.sort(sortedNumbers);

        return sortedNumbers;
    }

    public List<Integer> sortDescending() {
        List<Integer> sortedNumbers = new ArrayList<>(numbers);
        sortedNumbers.sort(Collections.reverseOrder());
        return sortedNumbers;
    }

    public static void main(String[] args) {
        SortNumbers sortNumbers = new SortNumbers();

        sortNumbers.addNumber(1);
        sortNumbers.addNumber(-20);
        sortNumbers.addNumber(9);
        sortNumbers.addNumber(2);
        System.out.println(sortNumbers.sortAscending());
        System.out.println(sortNumbers.sortDescending());
    }
}
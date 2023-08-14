package list.Search;

import java.util.ArrayList;
import java.util.List;

public class Sum {
    List<Integer> numbers;

    public Sum() {
        this.numbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public int calculateSum() {
        int acc = 0;

        for (int number : numbers) {
            acc += number;
        }

        return acc;
    }

    public int findBigger() {
        int bigger = numbers.get(0);

        for (int number : numbers) {
            if (number > bigger) {
                bigger = number;
            }
        }

        return bigger;
    }

    public int findSmaller() {
        int smaller = numbers.get(0);

        for (int number : numbers) {


            if (number < smaller) {
                smaller = number;
            }
        }

        return smaller;
    }

    public void showNumbers() {
        System.out.println(numbers);
    }

    public static void main(String[] args) {
        Sum sum = new Sum();

        sum.addNumber(1);
        sum.addNumber(9);
        sum.addNumber(81);

        System.out.println(sum.calculateSum());
        System.out.println(sum.findBigger());
        System.out.println(sum.findSmaller());
        sum.showNumbers();

    }
}
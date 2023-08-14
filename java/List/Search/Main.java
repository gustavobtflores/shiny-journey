package Search;

public class Main {
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

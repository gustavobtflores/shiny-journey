package Sort;

public class Main {
    public static void main(String[] args) {
        SortNumbers sortNumbers = new SortNumbers();

        sortNumbers.addNumber(1);
        sortNumbers.addNumber(-20);
        sortNumbers.addNumber(9);
        sortNumbers.addNumber(2);
        System.out.println(sortNumbers.sortAscending());
        System.out.println(sortNumbers.sortDescending());

        SortPeople sortPeople = new SortPeople();

        sortPeople.addPerson("Gustavo", 23, 1.82);
        sortPeople.addPerson("Maria", 28, 1.65);
        sortPeople.addPerson("João", 30, 1.75);
        sortPeople.addPerson("Ana", 26, 1.70);

        System.out.println(sortPeople.sortByAge());
        System.out.println(sortPeople.sortByHeight());
    }
}

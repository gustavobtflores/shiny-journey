package list.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortPeople {
    List<Person> people = new ArrayList<>();

    public void addPerson(String name, int age, double height) {
        Person person = new Person(name, age, height);
        people.add(person);
    }

    public List<Person> sortByAge(){
        List<Person> sortedByAge = new ArrayList<>(people);
        Collections.sort(sortedByAge);

        return sortedByAge;
    }

    public List<Person> sortByHeight(){
        List<Person> sortedByHeight = new ArrayList<>(people);
        sortedByHeight.sort(new ComparatorByHeight());

        return sortedByHeight;
    }

    public static void main(String[] args) {
        SortPeople sortPeople = new SortPeople();

        sortPeople.addPerson("Gustavo", 23, 1.82);
        sortPeople.addPerson("Maria", 28, 1.65);
        sortPeople.addPerson("João", 30, 1.75);
        sortPeople.addPerson("Ana", 26, 1.70);

        System.out.println(sortPeople.sortByAge());
        System.out.println(sortPeople.sortByHeight());
    }
}

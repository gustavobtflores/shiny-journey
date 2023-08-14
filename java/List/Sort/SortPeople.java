package Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortPeople {
  List<Person> people = new ArrayList<Person>();

  public void addPerson(String name, int age, double height) {
    Person person = new Person(name, age, height);
    people.add(person);
  }

  public List<Person> sortByAge(){
    List<Person> sortedByAge = new ArrayList<Person>(people);
    Collections.sort(sortedByAge);

    return sortedByAge;
  }

  public List<Person> sortByHeight(){
    List<Person> sortedByHeight = new ArrayList<Person>(people);
    Collections.sort(sortedByHeight, new ComparatorByHeight());

    return sortedByHeight;
  }
}



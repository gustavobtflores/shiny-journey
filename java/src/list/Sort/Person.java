package list.Sort;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    private final String name;
    private final int age;
    private final double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    @Override
    public int compareTo(Person p){
        return Integer.compare(this.age, p.age);
    }

    @Override
    public String toString(){
        return "Name: " + name + " Age: " + age + " Height: " + height;
    }
}

class ComparatorByHeight implements Comparator<Person>{
    @Override
    public int compare(Person p1, Person p2) {
        return Double.compare(p1.getHeight(), p2.getHeight());
    }
}

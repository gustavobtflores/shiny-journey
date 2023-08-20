package set.Sort;

public record Student(String name, Long registration, double average) implements Comparable<Student> {
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", average=" + average +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        return name.compareTo(s.name());
    }
}

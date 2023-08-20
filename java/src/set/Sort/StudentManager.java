package set.Sort;

import java.util.*;

public class StudentManager {
    Set<Student> studentsList;

    public StudentManager() {
        this.studentsList = new HashSet<>();
    }

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();

        // Adicionar estudantes à lista
        Student student1 = new Student("Bob", 1002L, 75.0);
        Student student2 = new Student("Alice", 1001L, 85.5);
        Student student3 = new Student("Carol", 1003L, 92.3);
        Student student4 = new Student("David", 1004L, 78.9);
        Student student5 = new Student("Eva", 1005L, 88.2);
        
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);
        studentManager.addStudent(student4);
        studentManager.addStudent(student5);

        // Exibir lista de estudantes
        System.out.println("Lista de estudantes:");
        studentManager.displayStudents();

        // Remover um estudante da lista
        long registrationToRemove = 1002L;
        studentManager.removeStudent(registrationToRemove);

        // Exibir lista de estudantes após remoção
        System.out.println("Lista de estudantes após remoção:");
        studentManager.displayStudents();

        //Exibir lista de estudantes por nome:
        System.out.println("Lista de estudantes por nome:");
        studentManager.displayStudentsByName();

        //Exibir lista de estudantes por nota:
        System.out.println("Lista de estudantes por nota:");
        studentManager.displayStudentsByAverage();
    }

    public void addStudent(Student student) {
        studentsList.add(student);
    }

    public void removeStudent(long registration) {
        if (studentsList.isEmpty()) {
            System.out.println("Não é possível remover de uma lista vazia");
            return;
        }

        for (Student student : studentsList) {
            if (student.registration().equals(registration)) {
                studentsList.remove(student);
                return;
            }
        }

        System.out.println("Estudante não presente na lista");
    }

    public void displayStudents(){
        System.out.println(studentsList);
    }

    public void displayStudentsByName() {
        Set<Student> studentsByName = new TreeSet<>(studentsList);

        System.out.println(studentsByName);
    }

    public void displayStudentsByAverage(){
        List<Student> studentsByAverage = new ArrayList<>(studentsList);

        Collections.sort(studentsByAverage, new ComparatorAverage().reversed());

        System.out.println(studentsByAverage);
    }
}

class ComparatorAverage implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.average(), s2.average());
    }
}

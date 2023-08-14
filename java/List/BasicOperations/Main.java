package BasicOperations;

public class Main {
    public static void main(String[] args) {
        //Lista de tarefas
        TodoList list = new TodoList();

        list.addTodo("Study Java Collections", "Take some time to learn more about Java collections like lists, sets, arrays.");
        list.addTodo("Complete Data Structures Assignment", "Finish the programming assignment on implementing common data structures in Java.");
        list.addTodo("Prepare for Coding Interview", "Practice solving algorithm and data structure problems to excel in upcoming interviews.");
        list.addTodo("Go for a Jog", "Take a break from coding and get some fresh air with a refreshing jog in the park.");


        System.out.println("\nTotal amount of todos: " + list.getTotalTodoAmount());
        System.out.println("List of todos descriptions: " + list.getTodosDescriptions());
    }
}

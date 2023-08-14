package list.BasicOperations;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private final List<Todo> todoList;

    public TodoList() {
        todoList = new ArrayList<>();
    }


    public void addTodo(String title, String description){
        Todo newTodo = new Todo(title, description);
        todoList.add(newTodo);
        System.out.println("Task " + title + " added!");
    }

    public int getTotalTodoAmount(){
        return this.todoList.size();
    }

    public ArrayList<String> getTodosDescriptions(){
        ArrayList<String> descriptions = new ArrayList<>();

        for(Todo todo : todoList){
            descriptions.add(todo.getDescription());
        }

        return descriptions;
    }

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

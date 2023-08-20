package set.Search;

import java.util.HashSet;
import java.util.Set;

public class TodoList {
    private final Set<Todo> list;

    public TodoList() {
        this.list = new HashSet<>();
    }

    public static void main(String[] args) {
        TodoList todoList = new TodoList();

        // Add tasks
        Todo task1 = new Todo("Go grocery shopping");
        Todo task2 = new Todo("Study for the exam");
        todoList.addTask(task1);
        todoList.addTask(task2);

        // Display tasks
        System.out.println("All tasks:");
        todoList.displayTasks();

        // Mark a task as completed
        todoList.markTaskCompleted("Go grocery shopping");
        todoList.displayTasks();

        //Mark a task as pending
        todoList.markTaskPending("Go grocery shopping");
        todoList.displayTasks();

        // Get completed tasks
        todoList.markTaskCompleted("Study for the exam");
        Set<Todo> completedTasks = todoList.getCompletedTasks();
        System.out.println("Completed tasks:");
        for (Todo task : completedTasks) {
            System.out.println(task.getDescription());
        }

        // Count tasks
        int totalTasks = todoList.countTasks();
        System.out.println("Total number of tasks: " + totalTasks);

        // Remove a task
        todoList.removeTask("Study for the exam");

        // Get pending tasks
        Set<Todo> pendingTasks = todoList.getPendingTasks();
        System.out.println("Pending tasks:");
        for (Todo task : pendingTasks) {
            System.out.println(task.getDescription());
        }

        // Clear the todo list
        todoList.clearTodoList();
    }

    public void addTask(Todo todo) {
        list.add(todo);
    }

    public void removeTask(String description) {
        for (Todo todo : list) {
            if (todo.getDescription().equals(description)) {
                list.remove(todo);
                return;
            }
        }
    }

    public void displayTasks() {
        System.out.println(list);
    }

    public int countTasks() {
        int count = 0;

        if (!list.isEmpty()) for (Todo todo : list) count += 1;

        return count;
    }

    public Set<Todo> getCompletedTasks() {
        HashSet<Todo> doneTodos = new HashSet<>();

        if (!list.isEmpty()) {
            for (Todo todo : list) {
                if (todo.isCompleted()) {
                    doneTodos.add(todo);
                }
            }
        }

        return doneTodos;
    }

    public Set<Todo> getPendingTasks() {
        HashSet<Todo> pendingTodos = new HashSet<>();

        if (!list.isEmpty()) {
            for (Todo todo : list) {
                if (!todo.isCompleted()) {
                    pendingTodos.add(todo);
                }
            }
        }

        return pendingTodos;
    }

    public void markTaskCompleted(String description) {
        for(Todo todo: list){
            if(todo.getDescription().equalsIgnoreCase(description)){
                todo.setAsCompleted();
                return;
            }
        }
    }

    public void markTaskPending(String description){
        for(Todo todo: list){
            if(todo.getDescription().equalsIgnoreCase(description)){
                todo.setAsPending();
                return;
            }
        }
    }

    public void clearTodoList(){
        list.clear();
    }
}

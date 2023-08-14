package BasicOperations;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<Todo> todoList;

    public TodoList() {
        todoList = new ArrayList();
    }


    public void addTodo(String title, String description){
        Todo newTodo = new Todo(title, description);
        todoList.add(newTodo);
        System.out.println("Task " + title + " added!");
    }

    public void removeTodo(String title){
        for(Todo todo : todoList){
            if(title.equals(todo.getTitle())){
                todoList.remove(todo);
                return;
            }

            System.out.printf("Task with the title '%s' not found", title);
        }
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
}

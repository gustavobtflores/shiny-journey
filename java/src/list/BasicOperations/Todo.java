package list.BasicOperations;

public class Todo {
    String title;
    String description;

    public String getDescription() {
        return description;
    }

    public Todo(String title, String description){
        this.title = title;
        this.description = description;
    }
}

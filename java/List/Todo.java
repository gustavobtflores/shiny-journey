public class Todo {
    String title;
    String description = "";

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Todo(String title){
        this.title = title;
    }

    public Todo(String title, String description){
        this.title = title;
        this.description = description;
    }
}

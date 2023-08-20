package set.Search;

import java.util.Objects;

public class Todo {
    private boolean isCompleted;
    private final String description;

    public Todo(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public String getDescription() {
        return description;
    }

    public void setAsPending(){
        isCompleted = false;
    }

    public void setAsCompleted() {
        isCompleted = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return Objects.equals(getDescription(), todo.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescription());
    }

    @Override
    public String toString() {
        return "Todo{" +
                "isCompleted=" + isCompleted +
                ", description='" + description + '\'' +
                '}';
    }
}

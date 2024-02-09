package chainedlist;

public class TodoTask {

    String description;
    String status;
    TodoTask next;

    public TodoTask(String description, String status) {
        this.description = description;
        this.status = status;
        this.next = null;
    }

    @Override
    public String toString() {
        return "TodoTask{" +
                "description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

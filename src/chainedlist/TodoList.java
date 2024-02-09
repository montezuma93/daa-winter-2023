package chainedlist;

public class TodoList {

    private TodoTask head;
    private TodoTask tail;

    public TodoList() {
        this.head = null;
    }

    void addTask(String description) {
        TodoTask newTask = new TodoTask(description, "uncompleted");
        if(head == null) {
            head = newTask;
            tail = newTask;
        } else {
            tail.next = newTask;
            tail = newTask;
        }
    }

    void displayTask(){
        TodoTask current = head;
        System.out.println(current);
        while(current.next != null){
            current = current.next;
            System.out.println(current);
        }
    }


}

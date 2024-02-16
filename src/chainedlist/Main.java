package chainedlist;

public class Main {


        public static void main(String[] args) {

            TodoList todoList = new TodoList();
            todoList.addTask("Küche aufräumen");
            todoList.addTask("kochen");
            todoList.addTask("Auto waschen");
            todoList.displayTask();

        }
}

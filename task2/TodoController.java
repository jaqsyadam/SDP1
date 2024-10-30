public class TodoController {
    private final TodoView view;
    private final List<Todo> todos;

    public TodoController(TodoView view) {
        this.view = view;
        this.todos = new ArrayList<>();
        this.view.setController(this);
    }

    public void addTodo() {
        String title = view.getNewTodoTitle();
        if (!title.isEmpty()) {
            Todo newTodo = new Todo(todos.size(), title);
            todos.add(newTodo);
            view.displayTodos(todos);
        }
    }
}

// Main
public class Main {
    public static void main(String[] args) {
        TodoView view = new TodoViewImpl();
        new TodoController(view);
    }
}

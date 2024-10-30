public class Main {
    public static void main(String[] args) {
        StudentView view = new StudentViewImpl();
        StudentViewModel viewModel = new StudentViewModel();
        view.setViewModel(viewModel);
    }
}

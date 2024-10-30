public class StudentViewModel {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(String name, int age, String course) {
        students.add(new Student(name, age, course));
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public void updateStudent(int index, String course) {
        students.get(index).setCourse(course);
    }
}

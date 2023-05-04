import java.util.ArrayList;

public class Group {
    private Student leader;
    private ArrayList<Student> students;
    private ArrayList<String> tasks;

    public Group(Student leader) {
        this.leader = leader;
        this.students = new ArrayList<Student>();
        this.tasks = new ArrayList<String>();
    }

    public void changeLeader(Student newLeader) {
        this.leader = newLeader;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudent(Student student) {
        this.students.remove(student);
    }

    public void renameStudent(Student student, String newFirstName, String newLastName) {
        student.setFirstName(newFirstName);
        student.setLastName(newLastName);
    }

    public void addTask(String task) {
        this.tasks.add(task);
    }

    public Student getLeader() {
        return leader;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<String> getTasks() {
        return tasks;
    }
}

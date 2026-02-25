import java.util.Map;
import java.util.TreeMap;

public class StudentRecordManager {
    private TreeMap<Integer, Student> students = new TreeMap<>();

    public StudentRecordManager() {
        this.students = new TreeMap<>();
    }

    public void addStudent(Student student) {
        students.put(getNextId(), student);
    }

    private int getNextId() {
        if (students.isEmpty()) {
            return 1;
        } else {
            return students.lastKey() + 1;
        }
    }

    public Student getStudent(int id) {
        return students.get(id);
    }

    public void removeStudent(int id) {
        students.remove(id);
    }

    public void changeStudentGPA(int id, double newGPA) {
        Student student = students.get(id);
        if (student != null) {
            student.setGPA(newGPA);
        }
        else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
    public void printAllStudents() {
        for (Map.Entry<Integer, Student> e : students.entrySet()) {
            System.out.print("ID:" + e.getKey() + " " + e.getValue());
        }
    }

    public TreeMap<Integer, Student> getStudentsAboveGPA(double gpa) {
        TreeMap<Integer, Student> result = new TreeMap<>();
        for (Map.Entry<Integer, Student> e : students.entrySet()) {
            if (e.getValue().getGpa() > gpa) {
                result.put(e.getKey(), e.getValue());
            }
        }
        return result;
    }

    public void printStudentsAboveGPA(double gpa) {
        TreeMap<Integer, Student> result = new TreeMap<>();
        for (Map.Entry<Integer, Student> e : students.entrySet()) {
            if (e.getValue().getGpa() > gpa) {
                result.put(e.getKey(), e.getValue());
            }
        }
        for (Map.Entry<Integer, Student> e : result.entrySet()) {
            System.out.print("ID:" + e.getKey() + " " + e.getValue());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        StudentRecordManager studentMap = new StudentRecordManager();

        studentMap.addStudent(new Student("Alice", "Smith", 3.8));
        studentMap.addStudent(new Student("Bob", "Johnson", 3.2));
        studentMap.addStudent(new Student("Charlie", "Brown", 3.6));
        
        System.out.println("All students:");
        studentMap.printAllStudents();

        System.out.println("\nStudents with GPA above 3.5:");
        System.out.println(studentMap.getStudentsAboveGPA(3.5).values());

    }
}
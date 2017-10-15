public class Main {
    public static void main(String[] args) {
        Student student = new Student("Maciej", "Kopciał", 26, Grade.A);
        System.out.println(student);
        student.setGrade(Grade.D);
        System.out.println(student);
    }
}

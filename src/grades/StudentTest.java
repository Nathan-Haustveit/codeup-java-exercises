package grades;

public class StudentTest {
    public static void main(String[] args) {

        Student Student1 = new Student("Nate");
        System.out.println(Student1.getName());
        Student1.addGrade(88);
        Student1.addGrade(93);
        Student1.addGrade(79);
        System.out.println(Student1.getGrades());
        System.out.println(Student1.getGradeAverage());

    }
}

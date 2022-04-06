package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private  ArrayList<Integer> grades;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double gradeAverage = 0;
//        for (int i = 0; i < grades.size(); i++) {
//            gradeAverage += this.grades.get(i);
//        }
        for (Integer grade : grades) {
            gradeAverage += grade;
        }
        return gradeAverage / this.grades.size();
    }
}
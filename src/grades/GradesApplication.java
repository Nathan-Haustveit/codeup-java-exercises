package grades;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class GradesApplication {
//    public static void outputStudentInfo(){
//
//    }

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student Student1 = new Student("nate");
        Student1.addGrade(98);
        Student1.addGrade(39);
        Student1.addGrade(59);
        students.put("nate123", Student1);

        Student Student2 = new Student("jake");
        Student2.addGrade(93);
        Student2.addGrade(59);
        Student2.addGrade(70);
        students.put("jake123", Student2);

        Student Student3 = new Student("josh");
        Student3.addGrade(93);
        Student3.addGrade(59);
        Student3.addGrade(70);
        students.put("josh123", Student3);

        Student Student4 = new Student("mark");
        Student4.addGrade(38);
        Student4.addGrade(100);
        Student4.addGrade(60);
        students.put("mark123", Student4);
        System.out.println(students);

        System.out.println("Welcome!");
        System.out.println("");
        System.out.println("Here are the github usernames of our students: ");
        System.out.println("");

        Set<String> gitHubUserNames = students.keySet();
        for(String gitHubUserName : gitHubUserNames){
            System.out.printf("|%s| ", gitHubUserName);

        }

        System.out.println("\nWhat student would you like to see more information on?");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        if(gitHubUserNames.contains(userInput)) {
            System.out.printf("Name: %s - GitHub Username: %s%n", students.get(userInput).getName(), userInput);
            System.out.printf("Current Average: %f%n", students.get(userInput).getGradeAverage());
        }else{
            System.out.println("Sorry, no student found with the GitHub username of "+ userInput);
        }

        while (true){
            System.out.println("Would you like to see another student?");
            String userChoice = scanner.nextLine();
            userChoice = userChoice.toLowerCase();
            if (userChoice.equals("no") || userChoice.equals("n")) {
                System.out.println("Goodbye, and have a wonderful day!");
                break;
            }else{
                System.out.println("What student would you like to see more information on?");
                System.out.println("");
                userInput = scanner.nextLine();
                if(gitHubUserNames.contains(userInput)) {
                    System.out.printf("Name: %s - GitHub Username: %s%n", students.get(userInput).getName(), userInput);
                    System.out.printf("Current Average: %f%n", students.get(userInput).getGradeAverage());
                }else{
                    System.out.println("Sorry, no student found with the GitHub username of "+ userInput);
                }
            }
        }




        System.out.println(Student1.getName());
        System.out.println(Student1.getGrades());
        System.out.println(Student1.getGradeAverage());

    }
}

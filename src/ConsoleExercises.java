import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        System.out.println("ConsoleExercises");

        double pi = 3.14159;
        String output = String.format("The value of pi is approximately %.2f.               %n", pi);
        //OR// System.out.printf("The value of pi is approximately %.2f.               %n", pi);
      System.out.print(output);

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter an integer: ");
      int userInput =  sc.nextInt();
      System.out.println(userInput);

      sc.nextLine();

      System.out.print("Enter three words: ");
      String word1 = sc.next();
      String word2 = sc.next();
      String word3 = sc.next();
      System.out.println(word1);
      System.out.println(word2);
      System.out.println(word3);

      sc.nextLine();

      System.out.print("Enter a sentence: ");
      String userSentence = sc.nextLine();
      System.out.println(userSentence);

      System.out.print("Enter the classroom length: ");
      String classLength = sc.nextLine();
      int classLengthInt = Integer.parseInt(classLength);

      System.out.print("Enter the classroom width: ");
      String classWidth = sc.nextLine();
      int classWidthInt = Integer.parseInt(classWidth);


      int area = classLengthInt * classWidthInt;
      int perimeter = 2 * (classLengthInt + classWidthInt);
      System.out.println("The area of the classroom is: " + area);
      System.out.println("The perimeter of the classroom is: " + perimeter);
    }
}


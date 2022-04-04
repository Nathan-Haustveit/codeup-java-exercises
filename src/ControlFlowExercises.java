import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //1
    //while loop//
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }
    //for loop//
//        for(int i = 5; i <= 15; i ++) {
//            System.out.println(i + " ");
//        }

    //2
    // do while loop//
//        int i = 0;
//        do {
//            System.out.println(i);
//            i+=2;
//        } while (i <= 100);
    //for loop//
//        for(int i = 0; i <= 100; i+=2) {
//            System.out.println(i);
//        }

    //3
    //while loop//
//        int i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        } while (i >= -10);
    //for loop//
//        for(int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

    //4
    //while loop
//        long i = 2;
//        do{
//            System.out.println(i);
//            i *= i;
//        }while (i <= 1_000_000);

    //for loop//
//        for(int i = 2; i < 1_000_000; i *= i) {
//            System.out.println(i);
//        }

    //5
    //FizzBuzz//
        for(int i = 1; i <= 100; i ++) {

            if ((i % 3 == 0) & (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        //6
        boolean userContinues = true;

        do {
     System.out.print("What number would you like to go up to? ");
     int userInt = sc.nextInt();
     System.out.println();
     System.out.println("Here is your table!");
     System.out.println();
     System.out.println("number | squared | cubed");
     System.out.println("------ | ------- | -----");
     for (int i = 1; i <= userInt; i += 1) {
         System.out.format("%-7d", i);
         System.out.print("|");
         System.out.format(" %-8d", i * i);
         System.out.print("|");
         System.out.format(" %-9d", i * i * i);
         System.out.println();
     }
     System.out.print("Would you like to enter another number (y/n)? ");
     String userResponse = sc.next();
     if (!userResponse.equalsIgnoreCase("y")) {
         userContinues = false;
     }
 } while (userContinues);

        // 7
      boolean anotherGrade = true;
         do {
             System.out.print("Please enter a numerical grade from 0 to 100 ");

             int userInput = sc.nextInt();
        if (userInput >=0 & userInput <= 59){
            System.out.println("Your grade is an F");
        } else if (userInput >=60 & userInput <= 66){
            System.out.println("Your grade is a D");
        } else if (userInput >=67 & userInput <= 79){
            System.out.println("Your grade is a C");
        } else if (userInput >=80 & userInput <= 87){
            System.out.println("Your grade is a B");
        } else if (userInput >=88 & userInput <= 100) {
            System.out.println("Your grade is an A");
        }
        System.out.print("Do you wish to enter a new grade? (y/n) ");
             String userResponse = sc.next();
             if (!userResponse.equalsIgnoreCase("y")) {
                 anotherGrade = false;
             }
         } while (anotherGrade);

    }
}

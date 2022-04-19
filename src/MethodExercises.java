import java.util.Scanner;
public class MethodExercises {

    //1
//    public static int addNums(int num1, int num2){
//        return num1 + num2;
//    }
//    public static int subtractNums(int num1, int num2){
//        return num1 - num2;
//    }
//    public static int multiplyNums(int num1, int num2){
//        return num1 * num2;
//    }
//    public static int divideNums(int num1, int num2){
//        return num1 / num2;
//    }

    //2
//    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//        int userInput = sc.nextInt();
//        if (userInput >= min & userInput <= max){
//            return userInput;
//        }
//        return getInteger(min, max);
//    }

    //3
//    public static int factorialOfNum(int num){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number between 1-10:");
//            long userNumber = sc.nextLong();
//            System.out.println("Your factorial: " + userNumber);
//
//            System.out.println("Continue? [y/N]");
//            String userInput2 = sc.next();
//
//            long fact = 1;
//
//            if (userInput2.equals("y") && userNumber <= 10) {
//                for (int i = 1; i < userNumber; i++) {
//                    fact = fact * i;
//                    System.out.println("Fact = " + fact);
//                }
//            }
//    }

    //4
    public static void diceGame(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of sides on your pair of dice:");
        int sidesOfDice = sc.nextInt();

        if (sidesOfDice == 0){
            System.out.println("Pick a different number...");
            diceGame();
        }

        double diceRoll1 = diceRoll(sidesOfDice);
        double diceRoll2 = diceRoll(sidesOfDice);

        System.out.println("You rolled: " + diceRoll1);
        System.out.println("You rolled: "+ diceRoll2);

        System.out.println("Play again? [y/N]");
        String answer = sc.next();
        if (answer.equals("y")){
            diceGame();
        }

    }

    public static double diceRoll(int num){
        double diceRoll = Math.floor(Math.random() * num + 1);
        return diceRoll;
    }

    public static void guessingGame() {
        System.out.println("Let's play a guessing game!");
        System.out.println("I'm thinking of a number between 1 and 10, try and guess the number: ");
        Scanner sc = new Scanner(System.in);
        int computerValue = (int) (Math.random() * 10 + 1);
        int numberOfTries = 0;
        while (true) {
            numberOfTries++;
            int guessedNum = sc.nextInt();

            if (guessedNum < computerValue) {
                System.out.println("HIGHER");
            } else if (guessedNum > computerValue) {
                System.out.println("LOWER");
            } else {
                System.out.println("GOOD GUESS! You tried " + numberOfTries + " time(s).");
                break;
            }
        }
    }


    public static void main(String[] args) {
        //1
//        int addingNums = addNums(2, 1);
//        System.out.println("num1 + num2 = " + addingNums);
//        int subtractingNums = subtractNums(2, 1);
//        System.out.println("num1 - num2 = " + subtractingNums);
//        int multiplyingNums = multiplyNums(2, 1);
//        System.out.println("num1 * num2 = " + multiplyingNums);
//        int dividingNums = divideNums(2, 1);
//        System.out.println("num1 / num2 = " + dividingNums);
        //2
        //System.out.print("Enter a number between 1 and 10: ");
        //getInteger(1, 10);
        //3
        //System.out.print("Enter a number between 1 and 10: ");
        //4
        //diceGame();
        //5
        guessingGame();




    }
}


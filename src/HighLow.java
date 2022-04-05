import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            System.out.println("enter a number 0-100");
            int guess1 = input.nextInt();
            int correctNum = random.nextInt(100);
            if(guess1 < correctNum){
                System.out.println("number is too low!");
            }
            else if(guess1 > correctNum){
                System.out.println("Number is too high!");
            }
            else if(guess1 == correctNum){
                System.out.println("correct!");
                break;
            }
            else{
                System.out.println("not a valid option");
            }
        }
    }

}
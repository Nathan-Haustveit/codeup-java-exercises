package util;

import java.util.Scanner;

public class Input {
    private Scanner input = new Scanner(System.in);

     String getString(){
         System.out.println("Enter a string");
         return input.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Yes or No?");
        String userInput = input.nextLine();
        if (userInput.equals( "y")|| userInput.equals("Y") || userInput.equals("yes") || userInput.equals("Yes")) {
            return true;
        }
        return false;
    }
    public int getInt(int min, int max){
        System.out.println("Enter a number between" + min + "and" + max + "int");
        int userInt = input.nextInt();
        if (userInt > min || userInt < max){
            return getInt(min, max);
        }
        return userInt;
    }
    public int getInt(){
        int userInt = input.nextInt();
        return userInt;
    }
    public double getDouble(double min, double max){
        System.out.println("Enter a number between" + min + "and" + max + "double");
        int userDouble = input.nextInt();
        if (userDouble > min || userDouble < max){
            return getDouble(min, max);
        }
        return userDouble;
    }
    public double getDouble(){
        double userDouble = input.nextDouble();
        return userDouble;
    }

}
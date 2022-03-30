import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a statement or ask a question to talk to Bob.");

        String userSentence = sc.nextLine();
        String question = "?";
        String exclamation = "!";
        if (userSentence.endsWith(question)){
            System.out.println("Sure.");
        }else if (userSentence.endsWith(exclamation)) {
            System.out.println("Whoa, chill out!");
        }else if (userSentence.equals("")){
            System.out.println("Fine. Be that way!");
        }else{
            System.out.println("Whatever.");
        }
        //System.out.println(userSentence);
    }
}

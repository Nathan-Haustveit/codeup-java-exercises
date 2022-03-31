public class JavaWarmups {

    //1
//        Create a method, returnFirstCapitalLetter, that takes in a string and returns the first capital letter as a              char. If no capital letter is found, return a single space character ' '. Assume only letters in the input                string and all possible inputs will have at least one letter.
//
//        Examples...
//
//        returnFirstCapitalLetter("hellO") // returns 'O'
//        returnFirstCapitalLetter("hello") // returns ' '
//        returnFirstCapitalLetter("hEllo") // returns 'E'
//        returnFirstCapitalLetter("hELlO") // returns 'E'
//        returnFirstCapitalLetter("H") // returns 'H'

    public static char returnFirstCapitalLetter(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == Character.toUpperCase(str.charAt(i))) {
                return str.charAt(i);
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(returnFirstCapitalLetter("hellO"));
        System.out.println(returnFirstCapitalLetter("hello"));
        System.out.println(returnFirstCapitalLetter("hEllo"));
        System.out.println(returnFirstCapitalLetter("hELlO"));
        System.out.println(returnFirstCapitalLetter("H"));
    }
}
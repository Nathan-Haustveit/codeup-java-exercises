import java.util.Arrays;

public class ArraysLecture {
    public static void main(String[] args) {
        // we declare a reference variable, numbers, of type Integer Array
        int[] numbers;
        // we assign an actual array to the numbers reference
        numbers = new int[5];
        numbers[0] = 78;
        numbers[1] = 76;
        numbers[2] = 43;
        numbers[3] = 12;
        numbers[4] = -56;

//        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        Arrays.sort(numbers);
        // *not* numbers.sort();
        System.out.println(numbers[0]);

        // array initializer syntax

        String[] synonymsOfWeird = {"strange", "bizarre", "uncanny", "odd", "peculiar", "uncommon"};
        System.out.println(synonymsOfWeird[2]);
        synonymsOfWeird[0] = "extraordinary";
        System.out.println(synonymsOfWeird[0]);
        //synonymsOfWeird[6] = "uCantDoThis";
        System.out.println(synonymsOfWeird.length);

        for(int i = 0; i < synonymsOfWeird.length; i++){
            System.out.println("The number at index " + i + " is " + synonymsOfWeird[i]);
        }

        // enhanced for loop
        for (String synonymOfWeird : synonymsOfWeird){
            System.out.println(synonymOfWeird);
        }

        // Create an array of five bytes using either array variable declaration or array initialization syntax. Use either a for loop or an enhanced for loop to output the values to the terminal.

        byte[] num = new byte[5];

        num[0] =-120;
        num[1] =-32;
        num[2] =14;
        num[3] =56;
        num[4] =108;

        for(byte i = 0; i < num.length; i++){
            System.out.println("The byte at index " + i + " is " + num[i]);
        }
    }
}

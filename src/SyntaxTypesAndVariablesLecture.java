public class SyntaxTypesAndVariablesLecture {
    public static void main(String[] args) {

        /**
         * statements
         */

        //
        System.out.println("this is a statement");

        /**
         * Data Types
         */

//        /**
//         * byte	    1	Very short integers from -128 to 127
        byte myBite =127;
        System.out.println("myBite = "  + myBite);

//         * short	2	Short integers from -32,768 to 32,767
        short myShort = -31000;
        System.out.println("myShort = " + myShort);

//         * int	    4	Integers from -2,147,483,648 to 2,147,483,647
        int myInt = myShort; // implicit. ---casting example---

        myInt = (int) myBite; // explicit

        System.out.println("myInt = " + myInt);

//         * long	    8	Long integers from -9,223,372,036,854,775,808 to 9,223,372,036,               854,775,807
        long myLong = 100_000_000;
        System.out.println("myLong = " + myLong);

//         * float	4	Single-precision, floating-point numbers from -3.4E38 to 3.4E38               with up to 7 significant digits
        //Decimal value
        float myFloat = 1.234567890123F;
            //returns 1.23456789 -> 7 digits of precision.
        System.out.println("myFloat = " + myFloat);

        myFloat = myLong;
        System.out.println("myFloat = " + myFloat);

//         * double	8	Double-precision, floating-point numbers from -1.7E308 to                     1.7E308 with up to 16 significant digits
        double myDouble = 10.12122345352D;
        double myOtherDouble = 11.1234234234D;
        System.out.println("myDouble = " + myDouble);

        myFloat = (float) myOtherDouble;
        System.out.println("myFloat = " + myFloat);

//         * char	    2	A single Unicode character that’s stored in two bytes
        char myChar = 'C';
        myChar = 'C';
        System.out.println("myChar = " + myChar);

//         * boolean	1	A true or false value
                // in js; boolean = true or false (1 or 0)
        boolean isTrue = true;
        System.out.println("isTrue = " + isTrue);
        isTrue = !isTrue;
        System.out.println("isTrue = " + isTrue);


        //Reference Date Types
        //Default to null if not assigned anything.
        //String()
        String myString = "Double Quotes!!! For Strings!";
        System.out.println("myString = " + myString);

        //Escape Characters
        myString = "  \" Hello \"  \\";
        System.out.println("myString = " + myString);

        /**
         * Reserved Keywords
         */
        //Certain words can't be used outside the purpose

        /**
         * Constants
         *
         * 1. Variable that can not change!
         * 2. Java uses a keyword called final
         * Naming Conventions
         * -2 different ones:
         *      1. PascalCase => first Character is Cap.
         *      2. ALL CAPS! CONSTANT_NAME_IS_THIS;
         *
         */

        final int FINAL_VALUE = 11;
        System.out.println("FINAL_VALUE = " + FINAL_VALUE);

        final String FinalString = "First Letter Cap!";
        System.out.println("FinalString = " + FinalString);

        //can not change these values ever.

        /**
         * Arithmetic
         *
         * Operators are very similar to Javascript
         */

        int myValue = 10;
        System.out.println("myValue++ = " + myValue++);
        System.out.println("myValue = " + myValue); //current value
        System.out.println("++myValue = " + (++myValue)); // incrementing value

        int i = 10;
        int n = i++ % 5;
        System.out.println("n = " + n); //


//         */
        // Variables
        /**
         *
         * Must be defined before you can use them
         *
         * - Start w/ letter, inderscore or dollar sign (java)
         * -consist of letters, and underscores and digits.
         * - but can't be more thans 255 characters
         *
         * instantiates when assigned value
         */


        /**
         * Casting
         *
         * JS -> parseInt() -> type cohesion ==== casting
         *
         * TWO Types:
         *
         * Implicit - Imply, based on the situation. clearly
         *
         * Explicit - TELLING the app that its specifically needs to change the data type
         *
         */



    }
}

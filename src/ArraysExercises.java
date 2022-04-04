import java.util.Arrays;

public class ArraysExercises {
    public static Person[] addPerson(Person[] persons, Person mark){
        Person[] newArray = new Person[persons.length +1];
        for(int i = 0; i < persons.length; i++){
            newArray[i] = persons[i];
        }
        newArray[newArray.length-1] = mark;
        return newArray;
    }

    public static void main(String[] args) {
        //What happens when you run the following code? Why is Arrays.toString necessary?  **Displays memory address
        int[] numbers = {1, 2, 3, 4, 5};
        //System.out.println(numbers);
        //Should be System.out.println(Arrays.toString(numbers));

//Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.


        Person[] persons = new Person[3];
        persons[0] = new Person("nate");
        persons[1] = new Person("jake");
        persons[2] = new Person("josh");


        for (Person person : persons) {
            System.out.println(person.getName());
        }
        Person[] newPersonsArray = ArraysExercises.addPerson(persons, new Person("wendy"));
        for (Person person : newPersonsArray) {
            person.sayHello();
        }
        System.out.println(Arrays.toString(newPersonsArray));
    }
}
        //Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.















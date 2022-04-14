package practicetest;

import java.util.ArrayList;

public class PetTest {
    public static void main(String[] args) {
        PetDog dog1 = new PetDog("dog", "dog", true);
        PetDog dog2 = new PetDog("spot", "dog", false);

        System.out.println(dog1.getName());
        System.out.println(dog1.getType());
        System.out.println(dog1.isTrained());
        System.out.println(dog1.snuggle());

        ArrayList<PetDog> pets = new ArrayList<>();
        pets.add(dog1);
        pets.add(dog2);
        //PetDog.allSnuggle(pets);
    }
}


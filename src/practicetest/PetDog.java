package practicetest;

public class PetDog extends Pet implements Companion{

    private boolean trained;

    public PetDog(String name, String type, boolean trained) {
        super(name, type);
        this.trained = trained;
    }

    boolean isTrained(){
        return true;
    }

    @Override
    public String snuggle() {
        return getName() + " wants to snuggle!";
    }
}

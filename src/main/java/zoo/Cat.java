package zoo;

public class Cat extends Feline implements Pet{

    public void makeNoise(){
        System.out.println("Meow Meow");
    }

    @Override
    public boolean isAPet() {
        return true;
    }
}

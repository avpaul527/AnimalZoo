package zoo;

public class Dog extends Canine implements Pet{
    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, String food) {
        super(name, food);
    }


    public void makeNoise() {
        System.out.println("Woof woof");
    }

    public void greetOwner() {
        System.out.println("Wag tail and smile");
    }
}

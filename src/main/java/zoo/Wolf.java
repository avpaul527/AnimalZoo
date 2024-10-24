package zoo;

public class Wolf extends Canine{
    public Wolf() {
    }

    public Wolf(String name) {
        super(name);
    }

    public Wolf(String name, String food) {
        super(name, food);
    }

    public void makeNoise() {
        System.out.println("oooowwll");
    }
}

package dependencyInversion.goodExample;

public class Main {

    public static void main(String[] args) {
        EngineInterface e1 = new PetrolEngine();
        Car c = new Car(e1);
        c.start();
    }
}

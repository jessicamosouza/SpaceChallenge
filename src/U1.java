import java.util.Random;

public class U1 extends Rocket {

    double weight = 18000; //kg
    int maxWeight = 29000; //kg

    @Override
    public boolean launch() {
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
        int factor = (int) (0.05 * (weight / maxWeight));
        return factor >= rand;
    }

    @Override
    public boolean land() {
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
        int factor = (int) (0.01 * (weight / maxWeight));
        return factor >= rand;
    }
}

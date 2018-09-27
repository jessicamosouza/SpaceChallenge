import java.util.Random;

public class U2 extends Rocket {

    double weight = 18000; //kg
    int maxWeight = 29000; //kg

    @Override
    public boolean launch() {
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
        int factor = (int) (0.04 * (weight / maxWeight));
        return factor >= rand;
    }

    @Override
    public boolean land() {
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
        int factor = (int) (0.08 * (weight / maxWeight));
        return factor >= rand;
    }
}


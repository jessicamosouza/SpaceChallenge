public class U1 extends Rocket{

    double rocketU1Cost = 100000000;
    double rocketU1Weight = 10000; //kg
    int rocketU1MaxWeight = 18000; //kg

    @Override
    public boolean land() {
        //    Chance of launch explosion = 5% * (cargo carried / cargo limit)
        int factor = (int) (1.05 * (10000/18000));
        return factor > 100;
    }

    @Override
    public boolean launch() {
        //  2     Chance of launch explosion = 5% * (cargo carried / cargo limit)
        return super.launch();
    }
}

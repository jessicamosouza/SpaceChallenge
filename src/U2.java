public class U2 extends Rocket{

    double rocketU2Cost = 120000000;
    double rocketU2Weight = 18000; //kg
    int rocketU2MaxWeight = 29000; //kg


    @Override
    public boolean land() {
//        Chance of landing crash = 8% * (cargo carried / cargo limit)
        return super.land();
    }

    @Override
    public boolean launch() {
//        Chance of launch explosion = 4% * (cargo carried / cargo limit)
        return super.launch();
    }
}


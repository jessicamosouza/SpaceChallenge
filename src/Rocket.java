public class Rocket implements SpaceShip {

    @Override
    public boolean launch() {
        // method that returns either true or false
        // indicating if the launch was successful
        // or if the rocket has crashed.
        return true;
    }

    @Override
    public boolean land() {
        // method that also returns either true or false
        // based on the success of the landing.
        return true;
    }

    public void carry(Item item) {
        // method that also takes an Item object
        // and updates the current weight of the rocket
        return 0;
    }

    public boolean canCarry(Item item) {
        // method that takes an Item as an argument
        // and returns true if the rocket can carry such item
        // or false if it will exceed the weight limit.
        return false;
    }
}

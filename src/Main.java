import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    private static final String ITEMS_FILE = "phase-1.txt";

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(list); //test
        Simulation simulation = new Simulation(ITEMS_FILE);
        ArrayList<Item> items = simulation.loadItems();

        ArrayList<U1> rockets = simulation.loadU1(items);
        System.out.println(rockets); //test
    }
}

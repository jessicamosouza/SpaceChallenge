import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    private static final String ITEMS_FILE = "phase-1.txt";

    public static void main(String[] args) throws FileNotFoundException {
        int sum = items.sum();
        System.out.println(list); //test
        System.out.println(sum); //test
        Simulation simulation = new Simulation(ITEMS_FILE);
        ArrayList<Item> items = simulation.loadItems();

    }
}

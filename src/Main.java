import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    private static final String ITEMS_FILE = "phase-1.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Simulation items = new Simulation(ITEMS_FILE);
        ArrayList<Integer> itemsList = items.loadItems();

        System.out.println(itemsList);

    }
}

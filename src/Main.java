import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    private static final String ITEMS_FILE = "phase-1.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Simulation items = new Simulation(ITEMS_FILE);
        ArrayList<Integer> list = items.loadItems();
        int sum = items.sum();
        System.out.println(list); //test
        System.out.println(sum); //test

    }
}

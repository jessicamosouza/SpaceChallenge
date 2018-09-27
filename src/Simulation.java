import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
    // class that is responsible for reading item data
    // and filling up the rockets

    private ArrayList<Integer> itemsList;

    public Simulation(String itemsFile) throws FileNotFoundException {
        itemsList = new ArrayList<>();
        File file = new File(itemsFile);
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("\n");
        while (scanner.hasNext()) {
            String line = scanner.next();
            String[] pieces = line.split("=");
            itemsList.add(Integer.parseInt(pieces[1]));
        }
        scanner.close();
    }

    public ArrayList<Integer> loadItems(){
        return itemsList;
    }
}




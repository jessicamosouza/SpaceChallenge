import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
    // class that is responsible for reading item data
    // and filling up the rockets

    private ArrayList<String> itemsList;

    public Simulation(String itemsFile) throws FileNotFoundException {
        itemsList = new ArrayList<>();
        File file = new File(itemsFile);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            itemsList.add(scanner.nextLine());
        }
    }

    public ArrayList<String> loadItems(){
        return itemsList;
    }
}




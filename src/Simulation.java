import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
    // class that is responsible for reading item data
    // and filling up the rockets

    private ArrayList<Integer> itemsList;
    private File file;

    public Simulation(String itemsFile) {
        itemsList = new ArrayList<>();
        file = new File(itemsFile);
    }

    public ArrayList<Integer> loadItems() throws FileNotFoundException{
        /*
         * this method loads all items from a text file and
         * returns an ArrayList of Items
         */
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("\n");
        while (scanner.hasNext()) {
            String line = scanner.next();
            String[] pieces = line.split("=");
            itemsList.add(Integer.parseInt(pieces[1]));
        }
        scanner.close();

        return itemsList;
    }

    public int sum(){
        /*
         * this method sums all the items weight
         */
        int sum = 0;
        for (Integer anItemsList : itemsList) { //for each element of the list
            sum += anItemsList;
        }
        return sum;
    }
}




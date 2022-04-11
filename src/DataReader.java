import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataReader {

    /**
     * Read a .csv data file. For each line (i.e., row) of
     * the data file, parse the line as a string of Superhero
     * attributes, then classify the hero based on those attributes.
     * DO NOT modify.
     */
    public static ArrayList<Fast.SuperHero> readDataFileAndClassify(String fileName) throws IOException {
        ArrayList<Fast.SuperHero> heroes = new ArrayList<>();
        File file = new File(fileName);
        Scanner fileReader = new Scanner(file);
        fileReader.nextLine(); //skip headers

        while (fileReader.hasNextLine()) {
            String[] fields = parseRow(fileReader.nextLine(), 18);
            heroes.add(classifyHero(fields));
        }

        return heroes;
    }

    /**
     * Of all the possible parent and child classes for a
     * superhero to be, which best matches the attributes
     * in the String array?
     * TODO: Definitely modify.
     */
    public static Fast.SuperHero classifyHero(String[] fields) {
        Fast.SuperHero hero = null;

        //Does it meet the conditions of the current superhero classes?
        if (Fast.SuperHero.meetsConditions(fields)) {
            hero = new Fast.SuperHero(fields);
        }
        return hero;
    }

    /**
     * Reads in a row from a CSV file and splits it into
     * a String array. Expects each row to contain a predefined
     * number of fields.
     * DO NOT modify.
     */
    public static String[] parseRow(String row, int fieldCount) throws IOException {
        String[] fields = row.split(",");
        if (fields.length != fieldCount) { //parsing error or problem with file
            System.out.println("expected " + fieldCount + " fields but counted " + fields.length);
            for (String str : fields)
                System.out.println(str);
            throw new IOException();
        }
        return fields;
    }
}

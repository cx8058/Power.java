import java.io.IOException;
import java.util.ArrayList;

public class BattleRoyale {
    public static void main(String[] args) throws IOException {

        ArrayList<SuperHero> heroes = DataReader.readDataFileAndClassify("SuperheroDataset.csv");

        for(SuperHero hero : heroes)
            System.out.println(hero);
    }
}

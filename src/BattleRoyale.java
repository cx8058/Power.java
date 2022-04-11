import java.io.IOException;
import java.util.ArrayList;

public class BattleRoyale {
    public static void main(String[] args) throws IOException {

        ArrayList<Fast.SuperHero> heroes = DataReader.readDataFileAndClassify("SuperheroDataset.csv");

        for(Fast.SuperHero hero : heroes)
            System.out.println(hero);
    }
}
//
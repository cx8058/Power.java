import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class BattleRoyale {
    public static void main(String[] args) throws IOException {

        ArrayList<SuperHero> heroes = DataReader.readDataFileAndClassify("SuperheroDataset.csv");


        for (SuperHero hero : heroes) {
            for (int i = 0; i < heroes.size(); i++) {
                if (hero.combat(heroes.get(i)) > heroes.get(i).combat(hero)) {
                    hero.heroWin();

                }
                else if (hero.combat(heroes.get(i)) < heroes.get(i).combat(hero)) {
                    hero.heroLose();}
                else
                    hero.heroDraw();

            }

            int FastWin = 0;
            int FastDraw = 0;
            int FastLose = 0;
            //compare




        }
        heroes.sort(SuperHero::compare);
        java.io.File file = new java.io.File("results.txt");

        java.io.PrintWriter output = new java.io.PrintWriter(file);
        for (SuperHero hero:heroes){
            output.println(hero.toString() + " win: " + hero.win + " lose: " + hero.lose + " draw: " + hero.draw
            );
        }
        heroes.sort(SuperHero::compare);


    }
}


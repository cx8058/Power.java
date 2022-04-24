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

                    switch (hero.getClass().getSimpleName()) {
                        case "Fast":
                            Fast.addWin();

                            break;
                        case "Genius":
                            Genius.addWin();
                            break;
                        case "Heal":
                            Heal.addWin();
                            break;
                        case "Intelligence":
                            Intelligence.addWin();
                            break;
                        case "Power":
                            Power.addWin();
                            break;
                        case "Strength":
                            Strength.addWin();
                            break;
                        case "SuperHero":
                            SuperHero.addWin();
                            break;
                        default:
                            break;
                    }
                }
                else if (hero.combat(heroes.get(i)) < heroes.get(i).combat(hero)) {
                    hero.heroLose();


                    switch (hero.getClass().getSimpleName()) {
                        case "Fast":
                            Fast.addLose();
                            break;
                        case "Genius":
                            Genius.addLose();
                            break;
                        case "Heal":
                            Heal.addLose();
                            break;
                        case "Intelligence":
                            Intelligence.addLose();
                            break;
                        case "Power":
                            Power.addLose();
                            break;
                        case "Strength":
                            Strength.addLose();
                            break;
                        case "SuperHero":
                            SuperHero.addLose();
                            break;
                        default:
                            break;
                    }


                }

                else {
                    hero.heroDraw();


                    switch (hero.getClass().getSimpleName()) {
                        case "Fast":
                            Fast.addTie();
                            break;
                        case "Genius":
                            Genius.addTie();
                            break;
                        case "Heal":
                            Heal.addTie();
                            break;
                        case "Intelligence":
                            Intelligence.addTie();
                            break;
                        case "Power":
                            Power.addTie();
                            break;
                        case "Strength":
                            Strength.addTie();
                            break;
                        case "SuperHero":
                            SuperHero.addTie();
                            break;
                        default:
                            break;
                    }


                }
            }





        }







        heroes.sort(SuperHero::compare);
        java.io.File file = new java.io.File("results.txt");

        java.io.PrintWriter output = new java.io.PrintWriter(file);


        output.println("Fast class: " + Fast.getWin() + " | " + Fast.getLose() + " | " + Fast.getTie());
        output.println("Genius class: " + Genius.getWin() + " | " + Genius.getLose() + " | " + Genius.getTie());
        output.println("Heal class: " + Heal.getWin() + " | " + Heal.getLose() + " | " + Heal.getTie());
        output.println("Intelligence class: " + Intelligence.getWin() + " | " + Intelligence.getLose() + " | " + Intelligence.getTie());
        output.println("Power class: " + Power.getWin() + " | " + Power.getLose() + " | " + Power.getTie());
        output.println("Strength class: " + Strength.getWin() + " | " + Strength.getLose() + " | " + Strength.getTie());
        output.println("SuperHero class: " + SuperHero.getWin() + " | " + SuperHero.getLose() + " | " + SuperHero.getTie());
        output.println(" ");




        for (SuperHero hero:heroes){
            output.println(hero.toString() + " win: " + hero.win + " lose: " + hero.lose + " draw: " + hero.draw
            );
        }
        heroes.sort(SuperHero::compare);


    }
}


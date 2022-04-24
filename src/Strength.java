public class Strength extends Power {
        public Strength(String[] fields){super (fields); }
        @Override
        public int attack(SuperHero oHero){
            int result = this.getCombat() + this.getSpeed() - oHero.getCombat();
            if ( result > 0)
                this.heroWin();
            else if ( result == 0)
                this.heroDraw();
            else if ( result < 0)
                this.heroLose();
            return result;
        }
        public int defend(int damage) {
            int durability = 10;
            return Math.max(0, durability - damage);}
    public static boolean meetsConditions(String[] fields){
        if (Integer.parseInt(fields[2]) > 86) {
            return true;
        }
            return false;

        }
    public static int heroWin = 0;
    public static int heroLose = 0;
    public static int heroTie = 0;

    public static void addWin() { heroWin++;}
    public static void addLose() { heroLose++;}
    public static void addTie() { heroTie++;}

    public static int getWin() { return heroWin++;}
    public static int getLose() { return heroLose++;}
    public static int getTie() { return heroTie++;}
}

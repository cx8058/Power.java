public class Strength extends Fast.SuperHero {
        public Strength(String[] fields){super (fields); }
        @Override
        public int attack(Fast.SuperHero oHero){
            return Math.max(0, this.getCombat() + this.getStrength() - oHero.getCombat());
        }
        public int defend(int damage) {
            int durability = 10;
            return Math.max(0, durability - damage);}
    public static boolean meetsConditions(String[] fields){
        if (Integer.parseInt(fields[0]) > 100) {
            return true;
        }
            return false;

        }

}

public class Intelligence extends Fast.SuperHero {
        public Intelligence(String[] fields){super (fields);}
        @Override
        public int attack(Fast.SuperHero oHero){
            return Math.max(0, this.getCombat() + this.getIntelligence() - oHero.getCombat());

        }
        public int defend(Fast.SuperHero oHero){
            int durability = 20;
            int damage = 5;
            return Math.max(0, durability - damage);}
    public static boolean meetsConditions(String[] fields){
        if (Integer.parseInt(fields[0]) > 50) {
            return true;
        }
        return false;

    }
}

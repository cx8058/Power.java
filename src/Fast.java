public class Fast extends Fast.SuperHero {
    public Fast(String[] fields){super (fields);}
    @Override
    public int attack(SuperHero oHero){
        return Math.max(0, this.getCombat() + this.getSpeed() - oHero.getCombat());

    }
    public  int defend(int damage) {
        int durability = 5;
        return Math.max(0, durability - damage);}
    public static boolean meetsConditions(String[] fields){
        if (Integer.parseInt(fields[0]) > 200) {
            return true;
        }
        return false;
    }



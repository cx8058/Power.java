public class Genius extends Intelligence {
    public Genius(String[] fields) {
        super(fields);
    }

    @Override
    public int attack(SuperHero oHero) {
        int result = this.getCombat() + this.getSpeed() - oHero.getCombat();
        if ( result > 0)
            this.heroWin();
        else if ( result == 0)
            this.heroDraw();
        else if ( result < 0)
            this.heroLose();
        return result;

    }

    public int defend(SuperHero oHero) {
        int durability = 20;
        int damage = 5;
        return Math.max(0, durability - damage);
    }

    public static boolean meetsConditions(String[] fields) {
        if (Integer.parseInt(fields[1]) >= 95) {
            return true;
        }
        return false;
    }
}

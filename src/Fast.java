public class Fast extends SuperHero {
    public Fast(String[] fields) {
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

    public int defend(int damage) {
        int durability = 5;
        return Math.max(0, durability - damage);
    }

    public static boolean meetsConditions(String[] fields) {
        if (Integer.parseInt(fields[0]) > 200) {
            return true;
        }
        return false;
    }

        }




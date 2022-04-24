    public class SuperHero {
    private final String name;
    private final int intelligence;
    private final int strength;
    private final int speed;
    private final int durability;
    private final int power;
    private final int combat;
    private final String fullName;
    private final String alignment;
    private final String gender;
    private final String race;
    private final int height; //in cm
    private final int weight; //in kg
    private final String eyeColor;
    private final String hairColor;
    private final String occupation;
    public int win;
    public int lose;
    public int draw;
    public int compare(SuperHero oHero) {
        if (this.win > oHero.win){
            return 10;
        }
        else if (this.win  < oHero.win) {
            return -10;
            //postive
            //negative
        }
        else
            return 0;
    }



            /**
             * Creates a new Fast.SuperHero object based on the format of the data in the csv file.
             * Some fields are parsed into Integer values (ordinal data)
             * Other fields are parsed into String values (categorical data).
             */
    public SuperHero(String[] fields){
        this.name = fields[0];
        this.intelligence = Integer.parseInt(fields[1]);
        this.strength = Integer.parseInt(fields[2]);
        this.speed = Integer.parseInt(fields[3]);
        this.durability = Integer.parseInt(fields[4]);
        this.power = Integer.parseInt(fields[5]);
        this.combat = Integer.parseInt(fields[6]);
        this.fullName = fields[9];
        this.alignment = fields[10];
        this.gender = fields[11];
        this.race = fields[12];
        this.height = Integer.parseInt(fields[13]);
        this.weight = Integer.parseInt(fields[14]);
        this.eyeColor = fields[15];
        this.hairColor = fields[16];
        this.occupation = fields[17];
        this.win = 0;
        this.lose = 0;
        this.draw = 0;
    }

    /**
     * Determine the amount of damage to other object based upon the difference in
     * their combat ability.
     * Cannot deal negative damage (e.g., if the other is much better at combat).
     * DO NOT modify
     */
    public int attack(SuperHero oHero){
        return Math.max(0, this.combat - oHero.getCombat());
    }
    public int getSpeed(){return this.speed;}
    public int getCombat(){return this.combat;}
    public int getStrength(){return this.strength;}
    public int getIntelligence(){return this.intelligence;}
    public int getPower(){return this.intelligence;}
    public void heroWin(){
        win++;
    }
    public void heroLose(){
            lose++;
        }
    public void FastWin() {win++; }
    public void FastLose() {lose++; }

        public void heroDraw(){
            draw++;
        }

        /**
     * Reduce the incoming amount of damage based upon this object's durability.
     * Cannot reduce the damage below zero.
     * DO NOT modify
     */
    public int defend(int damage) {return Math.max(0, durability - damage);}

    /**
     * Determines if the String of data meets the conditions for this class.
     * For the Fast.SuperHero parent class, all data meet the conditions. For child
     * classes of this class, the fields must be checked to determine if the
     * attributes match the requirements of that class.
     * Do NOT modify.
     */
    public static boolean meetsConditions(String[] fields){
        return true;
    }

    /**
     * The basic combat step in a non-static method. Both objects determine how much
     * base damage they deal to the other. Then, both objects determine how much of that
     * damage is reduced by their defenses.
     * DO NOT modify.
     * @return positive int if this object defeats the other, negative if the other object defeats this one, zero if it is a tie
     */
    public final int combat(SuperHero oHero){
        int damageToThem = this.attack(oHero);
        int damageToMe = oHero.attack(this);

        damageToThem = oHero.defend(damageToThem);
        damageToMe = this.defend(damageToMe);

        return damageToMe - damageToThem;
    }

    /**
     * Feel free to modify or override as necessary to test out your code.
     */
    public String toString(){
        return this.name + " " + this.getClass().getSimpleName();
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


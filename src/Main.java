public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.setDefenseType("Magical");

        System.out.println("Boss health: " + boss.getHealth() + ", damage: " + boss.getDamage()
                + ", defense type: " + boss.getDefenseType());

        Hero[] heroes = createHeroes();

        for (Hero hero : heroes) {
            System.out.println("Hero health: " + hero.getHealth() + ", damage: " + hero.getDamage()
                    + ", super power: " + hero.getSuperPower());
        }

    }

    public static Hero[] createHeroes() {
        Hero warrior = new Hero(300, 30, "Physical");
        Hero wizard = new Hero(230, 40, "Magical");
        Hero archer = new Hero(200, 30);

        Hero[] heroes = {warrior, wizard, archer};

        return heroes;
    }


}
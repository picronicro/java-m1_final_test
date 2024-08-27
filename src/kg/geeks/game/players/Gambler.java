package kg.geeks.game.players;

import java.util.Random;

public class Gambler extends Hero {

    public Gambler(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.GAMBLING);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Random r = new Random();
        int dice1 = r.nextInt(3) + 1;
        int dice2 = r.nextInt(3) + 1;

        if (dice1 == dice2) {
            int res = dice1 * dice2;
            this.attack(boss, res);

            System.out.println(this.getName() + " won extra " + res + " DMG jackpot!");
        } else {
            int res = dice1 + dice2;
            Hero hero = heroes[r.nextInt(heroes.length)];
            hero.setHealth(hero.getHealth() - res);

            System.out.println(this.getName() + " gambled " + hero.getName() + "'s " + res + " HP! What a loser.");
        }
    }

}

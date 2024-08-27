package kg.geeks.game.players;

public abstract class Hero extends GameEntity {
    private SuperAbility ability;

    public Hero(String name, int health, int damage, SuperAbility ability) {
        super(name, health, damage);
        this.ability = ability;
    }

    public SuperAbility getAbility() {
        return ability;
    }

    public void attack(Boss boss) {
        boss.setHealth(boss.getHealth() - this.getDamage());
    }

    // Custom attack method
    public void attack(Boss boss, int dmg) {
        boss.setHealth(boss.getHealth() - dmg);
    }

    public abstract void applySuperPower(Boss boss, Hero[] heroes);
}

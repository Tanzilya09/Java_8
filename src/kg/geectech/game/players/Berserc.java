package kg.geectech.game.players;

public class Berserc extends Hero{
    public Berserc(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int saveDamageAndRevert = boss.getDamage() / 4;
        boss.setHealth(boss.getHealth() - saveDamageAndRevert);
        System.out.println("Berserc поглотил:урона " +
                saveDamageAndRevert + " и нанес урона " + this.getDamage());

    }
}

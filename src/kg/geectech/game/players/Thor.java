package kg.geectech.game.players;

import kg.geectech.game.general.RPG_GAME;

public class Thor extends Hero{
    public Thor(int health, int damage, SuperAbility superAbility) {
        super(health, damage, superAbility);
    }

    @Override
        public void applySuperPower(Boss boss, Hero[] heroes) {
            RPG_GAME.statusStun = RPG_GAME.random.nextBoolean();
    }
}

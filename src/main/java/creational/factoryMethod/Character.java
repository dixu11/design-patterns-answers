package creational.factoryMethod;

public abstract class Character {

    private Weapon weapon;
    protected String name;

    public Character(String name) {
        this.name = name;
        weapon = createWeapon();
    }

    public abstract Weapon createWeapon();

    public void attack() {
            weapon.attack(name);
    }
}

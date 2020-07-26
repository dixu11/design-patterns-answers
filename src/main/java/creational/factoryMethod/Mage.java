package creational.factoryMethod;

public class Mage extends Character {
    public Mage(String name) {
        super(name);
    }

    @Override
    public Weapon createWeapon() {
        return new Wand();
    }
}

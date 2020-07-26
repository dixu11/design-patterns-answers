package creational.factoryMethod;

public class Fighter extends Character {
    public Fighter(String name) {
        super(name);
    }

    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

}

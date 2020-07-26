package creational.factoryMethod;

public class Sword extends Weapon {
    public Sword() {
        super("Miecz");
    }

    @Override
    public void attack(String ownerName) {
        System.out.println(ownerName +" atakuje za pomocą " + name);
    }
}

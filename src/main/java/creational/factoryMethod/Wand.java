package creational.factoryMethod;

public class Wand extends Weapon{
    public Wand() {
        super("Różdżka");
    }

    @Override
    public void attack(String ownerName) {
        System.out.println(ownerName +" strzela za pomocą " + name);
    }
}

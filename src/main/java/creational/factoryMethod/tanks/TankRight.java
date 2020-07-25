package creational.factoryMethod.tanks;

public class TankRight extends Tank {
    @Override
    public Barrel createBarrel() {
        return new BarrelRight();
    }
}

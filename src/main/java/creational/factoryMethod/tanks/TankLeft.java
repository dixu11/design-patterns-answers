package creational.factoryMethod.tanks;

public class TankLeft extends Tank {
    @Override
    public Barrel createBarrel() {
        return new BarrelLeft();
    }
}

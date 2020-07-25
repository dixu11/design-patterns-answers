package creational.factoryMethod.tanks;

public abstract class Tank {
    private Barrel barrel;

    public Tank(){
        barrel = createBarrel();
    }

    public abstract Barrel createBarrel();

    public void shot() {
        barrel.shot();
    }



}

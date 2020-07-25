package creational.factoryMethod.tanks;

public class Demo {
    public static void main(String[] args) {
        Tank tank1 = new TankLeft();
        Tank tank2 = new TankRight();
        tank1.shot();
        tank2.shot();

    }
}

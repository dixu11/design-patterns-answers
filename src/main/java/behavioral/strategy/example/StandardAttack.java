package behavioral.strategy.example;

public class StandardAttack implements AttackSkill {
    @Override
    public void attack() {
        System.out.println("Atak prostym czarem - ognisty pocisk");
    }
}

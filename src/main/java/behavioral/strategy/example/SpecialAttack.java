package behavioral.strategy.example;

public class SpecialAttack implements AttackSkill {
    @Override
    public void attack() {
        System.out.println("Wielka kula ognia!");
    }
}

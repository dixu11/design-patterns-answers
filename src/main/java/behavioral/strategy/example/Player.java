package behavioral.strategy.example;

public class Player {

    private int level = 1;
    private AttackSkill attackSkill;

    public Player() {
        attackSkill = new StandardAttack();
    }

    public void attack() {
       attackSkill.attack();
    }

    public void levelUp() {
        level++;
        addNewSkills();
    }

    public void addNewSkills() {
        if (level == 5) {
            attackSkill = new SpecialAttack();
        }
    }




}

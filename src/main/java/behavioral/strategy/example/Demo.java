package behavioral.strategy.example;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player();

        player.attack();
        player.levelUp();
        player.levelUp();
        player.levelUp();
        player.attack();
        player.levelUp();
        player.levelUp();
        player.levelUp();
        player.attack();
    }
}

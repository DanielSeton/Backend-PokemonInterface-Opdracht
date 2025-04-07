import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    private static final String type = "electric";

    private static final List<String> attacks = Arrays.asList("ThunderPunch", "ElectroBall", "Thunder", "VoltTackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void thunderPunch(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with ThunderPunch");
        switch (enemy.getType()){
            case "water" -> {
                System.out.println(enemy.getName() + " loses 50 HP!");
                enemy.setHp(enemy.getHp() - 50);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 20 HP!");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 40 HP!");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 20 HP!");
                enemy.setHp(enemy.getHp() - 20);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void electroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with ElectroBall");
        switch (enemy.getType()){
            case "water" -> {
                System.out.println(enemy.getName() + " loses 50 HP!");
                enemy.setHp(enemy.getHp() - 50);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 10 HP!");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 30 HP!");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 20 HP!");
                enemy.setHp(enemy.getHp() - 20);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void thunder(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Thunder");
        switch (enemy.getType()){
            case "water" -> {
                System.out.println(enemy.getName() + " loses 80 HP!");
                enemy.setHp(enemy.getHp() - 80);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " healed 40 HP due to the Thunder!");
                enemy.setHp(enemy.getHp() + 40);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 40 HP!");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 30 HP!");
                enemy.setHp(enemy.getHp() - 30);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
        System.out.println(name.getName() + " has " + name.getHp() + " hp left");
    }

    public void voltTackle(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with VoltTackle");
        switch (enemy.getType()){
            case "water" -> {
                System.out.println(enemy.getName() + " loses 70 HP!");
                enemy.setHp(enemy.getHp() - 70);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 10 HP!");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 40 HP!");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 20 HP!");
                enemy.setHp(enemy.getHp() - 20);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public static List<String> getAttacks() {
        return attacks;
    }
}

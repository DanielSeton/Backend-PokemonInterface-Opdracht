import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    private static final String type = "fire";

    private static final List<String> attacks = Arrays.asList("Inferno", "PyroBall", "FireLash", "FlameThrower");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void inferno(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Inferno");
        switch (enemy.getType()){
            case "water" -> {
                System.out.println(enemy.getName() + " loses 20 HP!");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 40 HP!");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 10 HP!");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 80 HP!");
                enemy.setHp(enemy.getHp() - 80);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void pyroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with PyroBall");
        switch (enemy.getType()){
            case "water" -> {
                System.out.println(enemy.getName() + " loses 10 HP!");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 30 HP!");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 10 HP!");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 60 HP!");
                enemy.setHp(enemy.getHp() - 60);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void fireLash(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with FireLash");
        switch (enemy.getType()){
            case "water" -> {
                System.out.println(enemy.getName() + " loses 20 HP!");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 30 HP!");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 10 HP!");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 60 HP!");
                enemy.setHp(enemy.getHp() - 60);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void flameThrower(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with FlameThrower");
        switch (enemy.getType()){
            case "water" -> {
                System.out.println(enemy.getName() + " loses 20 HP!");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 50 HP!");
                enemy.setHp(enemy.getHp() - 50);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 10 HP!");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 80 HP!");
                enemy.setHp(enemy.getHp() - 80);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public static List<String> getAttacks() {
        return attacks;
    }
}

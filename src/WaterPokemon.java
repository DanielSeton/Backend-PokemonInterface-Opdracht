import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private static final String type = "water";

    private static final List<String> attacks = Arrays.asList("Surf", "HydroPump", "HydroCanon", "RainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void surf(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Surf");
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
                System.out.println(enemy.getName() + " loses 70 HP!");
                enemy.setHp(enemy.getHp() - 70);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 20 HP!");
                enemy.setHp(enemy.getHp() - 20);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void hydroPump(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with HydroPump");
        switch (enemy.getType()){
            case "water" -> {
                System.out.println(enemy.getName() + " loses 20 HP!");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 40 HP!");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 70 HP!");
                enemy.setHp(enemy.getHp() - 70);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 20 HP!");
                enemy.setHp(enemy.getHp() - 20);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void hydroCanon(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with HydroCanon");
        switch (enemy.getType()){
            case "water" -> {
                System.out.println(enemy.getName() + " loses 30 HP!");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 50 HP!");
                enemy.setHp(enemy.getHp() - 50);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 90 HP!");
                enemy.setHp(enemy.getHp() - 90);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 40 HP!");
                enemy.setHp(enemy.getHp() - 40);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void rainDance(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " used Raindance on " + enemy.getName());
        switch (enemy.getType()){
            case "water" -> {
                System.out.println(enemy.getName() + " loses 10 HP!");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "electric" -> {
                System.out.println("It has no effect on " + enemy.getName());
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 20 HP!");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " healed 20 HP due to the rain!");
                enemy.setHp(enemy.getHp() + 20);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public static List<String> getAttacks() {
        return attacks;
    }
}

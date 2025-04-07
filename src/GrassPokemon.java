import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    private static final String type = "grass";

    private static final List<String> attacks = Arrays.asList("LeafStorm", "LeechSeed", "SolarBeam", "LeaveBlade");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void leafStorm(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with LeafStorm");
        switch (enemy.getType()){
            case "water" -> {
                System.out.println(enemy.getName() + " loses 50 HP!");
                enemy.setHp(enemy.getHp() - 50);
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
                System.out.println(enemy.getName() + " loses 20 HP!");
                enemy.setHp(enemy.getHp() - 20);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void leechSeed(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with LeechSeed");
        switch (enemy.getType()){
            case "water" -> {
                System.out.println(enemy.getName() + " loses 30 HP!\n" + name.getName() + " healed 30 HP!");
                enemy.setHp(enemy.getHp() - 30);
                name.setHp(name.getHp() + 30);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 20 HP!\n" + name.getName() + " healed 20 HP!");
                enemy.setHp(enemy.getHp() - 20);
                name.setHp(name.getHp() + 20);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 10 HP!\n" + name.getName() + " healed 10 HP!");
                enemy.setHp(enemy.getHp() - 10);
                name.setHp(name.getHp() + 10);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 10 HP!\n" + name.getName() + " healed 10 HP!");
                enemy.setHp(enemy.getHp() - 10);
                name.setHp(name.getHp() + 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
        System.out.println(name.getName() + " has " + name.getHp() + " hp left");
    }

    public void solarBeam(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with SolarBeam");
        switch (enemy.getType()){
            case "water" -> {
                System.out.println(enemy.getName() + " loses 80 HP!");
                enemy.setHp(enemy.getHp() - 80);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 50 HP!");
                enemy.setHp(enemy.getHp() - 50);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 20 HP!");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 30 HP!");
                enemy.setHp(enemy.getHp() - 30);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void leaveBlade(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with LeaveBlade");
        switch (enemy.getType()){
            case "water" -> {
                System.out.println(enemy.getName() + " loses 70 HP!");
                enemy.setHp(enemy.getHp() - 70);
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

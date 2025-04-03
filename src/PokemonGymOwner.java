import java.util.List;

public class PokemonGymOwner {
    private String name;
    private String town;

    public PokemonGymOwner(String name, String town) {
        this.name = name;
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}

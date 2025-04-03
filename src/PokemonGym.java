public interface PokemonGym {

    void enteredTheGym();

    void printPokemon();

    void fightRound();

    int randomAttacksByGymPokemon();

    String chooseAttackPlayer(Pokemon p);
}

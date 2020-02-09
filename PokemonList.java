import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;;

public class PokemonList {
    public ArrayList<Pokemons> pokemons;

    public PokemonList() {
        pokemons = new ArrayList<Pokemons>();
        pokemons.add(new Pokemons("fish", 20, 50, 2));
        pokemons.add(new Pokemons("rabbit", 30, 70, 3));
        //pokemons.add(new Pokemons("fox", 50, 60, 4));

        //PokemonList obj = new PokemonList(); 
  
        // boundIndex for select in sub list 
        //int boundIndex = 3;
        //System.out.println(obj.getRandomElement(pokemons, boundIndex));
    }
    public Pokemons getPokemons(int i) {
        return pokemons.get(i);
    }

}
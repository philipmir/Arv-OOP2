import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pikachu p1 = new Pikachu("David");
        Pikachu p2 = new Pikachu("Per");

        Balbasour b1 = new Balbasour("Susan");
        Balbasour b2 = new Balbasour("Lois");

        ArrayList<Pokemon> pokedex = new ArrayList<>();

        pokedex.add(p1);
        pokedex.add(p2);
        pokedex.add(b1);
        pokedex.add(b2);

        p1.attack();


        for(Pokemon p : pokedex)  {
            //System.out.println("name:" + p.getName());
            p.attack();

        }

        b1.talk();

        Pokemon currentPokemon = pokedex.get(2);

        // currentPokemon.talk(); //Funkar inte
        //((Balbasour) currentPokemon).talk();  // Tvingar att sätta Balbasour i currentPokemon

        // Pokemon p = new Pokemon("Laura");  // Går inte att skapa ny med abstract class








    }
}
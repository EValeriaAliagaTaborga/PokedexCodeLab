package bo.upb.programacion3.codelabpokedex.utils;

import java.util.ArrayList;
import java.util.List;

import bo.upb.programacion3.codelabpokedex.R;
import bo.upb.programacion3.codelabpokedex.model.repository.Pokemon;

public class PokemonUtils {

    /**
     * Get list of pokemons
     *
     * @return List of pokemons in the pokedex
     */
    public static List<Pokemon> getPokemons() {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon(1, "Pikachu", R.drawable.pikachu, "Electric"));
        pokemons.add(new Pokemon(2, "Bulbasaur", R.drawable.bulbasaur, "Grass"));
        pokemons.add(new Pokemon(3, "Charmander", R.drawable.charmander, "Fire"));
        pokemons.add(new Pokemon(4, "Squirtle", R.drawable.squirtle, "Water"));
        pokemons.add(new Pokemon(5, "Snorlax", R.drawable.snorlax, "Normal"));
        pokemons.add(new Pokemon(6, "ButterFree", R.drawable.butterfree, "Bug"));
        pokemons.add(new Pokemon(7, "Ekans", R.drawable.ekans, "Poison"));
        pokemons.add(new Pokemon(8, "Pidgey", R.drawable.pidgey, "Normal"));
        pokemons.add(new Pokemon(9, "Rattata", R.drawable.rattata, "Normal"));
        pokemons.add(new Pokemon(10, "Sandshrew", R.drawable.sandshrew, "Ground"));
        pokemons.add(new Pokemon(11, "Venonat", R.drawable.venonat, "Bug"));
        pokemons.add(new Pokemon(12, "Zubat", R.drawable.zubat, "Poison"));
        pokemons.add(new Pokemon(13,"Mimikyu",R.drawable.mimikyu,"Ghost"));
        pokemons.add(new Pokemon(14,"Stufful",R.drawable.stufful,"Fighting"));
        pokemons.add(new Pokemon(15,"Dustox",R.drawable.dustox,"Bug"));
        pokemons.add(new Pokemon(16,"Cacnea",R.drawable.cacnea,"Grass"));
        pokemons.add(new Pokemon(17,"Mime Jr",R.drawable.mimejr,"Psyquic"));
        pokemons.add(new Pokemon(18,"Growlie",R.drawable.growlie,"Fire"));
        pokemons.add(new Pokemon(19,"Ninetales",R.drawable.ninetales,"Fire"));
        pokemons.add(new Pokemon(20,"Luxray",R.drawable.luxray,"Electric"));
        pokemons.add(new Pokemon(21,"Eevee",R.drawable.eevee,"Normal"));
        pokemons.add(new Pokemon(22,"Chatot",R.drawable.chatot,"Flying"));
        pokemons.add(new Pokemon(23,"Charizard",R.drawable.charizard,"Fire"));
        return pokemons;
    }

    public static List<Pokemon> getAshFavs(){
        List<Pokemon> ashfavs = new ArrayList<>();
        ashfavs.add(new Pokemon(1, "Pikachu", R.drawable.pikachu, "Electric"));
        ashfavs.add(new Pokemon(20,"Luxray",R.drawable.luxray,"Electric"));
        ashfavs.add(new Pokemon(23,"Charizard",R.drawable.charizard,"Fire"));
        return ashfavs;
    }

    public static List<Pokemon> getMistyFavs(){
        List<Pokemon> mistyfavs = new ArrayList<>();
        mistyfavs.add(new Pokemon(21,"Eevee",R.drawable.eevee,"Normal"));
        mistyfavs.add(new Pokemon(22,"Chatot",R.drawable.chatot,"Flying"));
        mistyfavs.add(new Pokemon(4, "Squirtle", R.drawable.squirtle, "Water"));
        return mistyfavs;
    }

    public static List<Pokemon> getBrockFavs(){
        List<Pokemon> brockfavs = new ArrayList<>();
        brockfavs.add(new Pokemon(19,"Ninetales",R.drawable.ninetales,"Fire"));
        brockfavs.add(new Pokemon(5, "Snorlax", R.drawable.snorlax, "Normal"));
        brockfavs.add(new Pokemon(10, "Sandshrew", R.drawable.sandshrew, "Ground"));
        return brockfavs;
    }

    public static List<Pokemon> getJamesFavs(){
        List<Pokemon> jamesfavs = new ArrayList<>();
        jamesfavs.add(new Pokemon(18,"Growlie",R.drawable.growlie,"Fire"));
        jamesfavs.add(new Pokemon(17,"Mime Jr",R.drawable.mimejr,"Psyquic"));
        jamesfavs.add(new Pokemon(9, "Rattata", R.drawable.rattata, "Normal"));
        return jamesfavs;
    }

    public static List<Pokemon> getJessieFavs(){
        List<Pokemon> jessiefavs = new ArrayList<>();
        jessiefavs.add(new Pokemon(13,"Mimikyu",R.drawable.mimikyu,"Ghost"));
        jessiefavs.add(new Pokemon(14,"Stufful",R.drawable.stufful,"Fighting"));
        jessiefavs.add(new Pokemon(15,"Dustox",R.drawable.dustox,"Bug"));
        return jessiefavs;
    }
}

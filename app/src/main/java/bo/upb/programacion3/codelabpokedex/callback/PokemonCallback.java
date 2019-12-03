package bo.upb.programacion3.codelabpokedex.callback;

import bo.upb.programacion3.codelabpokedex.model.repository.Pokemon;

public interface PokemonCallback {
    void onPokemonClick(Pokemon pokemon);
}

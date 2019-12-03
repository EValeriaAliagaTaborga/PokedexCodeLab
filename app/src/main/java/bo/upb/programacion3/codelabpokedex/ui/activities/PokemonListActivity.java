package bo.upb.programacion3.codelabpokedex.ui.activities;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.gson.Gson;

import java.util.List;

import bo.upb.programacion3.codelabpokedex.utils.Constants;
import bo.upb.programacion3.codelabpokedex.R;
import bo.upb.programacion3.codelabpokedex.adapters.PokemonListViewAdapter;
import bo.upb.programacion3.codelabpokedex.model.repository.Pokemon;
import bo.upb.programacion3.codelabpokedex.utils.PokemonUtils;

public class PokemonListActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ListView listview;
    private String user;
    private Gson gson = new Gson();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_list);
        initViews();
        initToolbar();

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            user = extras.getString("user");
        }


        if(user.equals("Ash")){
            final List<Pokemon> pokemonList = PokemonUtils.getAshFavs();
            PokemonListViewAdapter adapter = new PokemonListViewAdapter(this, pokemonList);
            listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Pokemon pokemon = pokemonList.get(position);
                    Intent intent = new Intent(PokemonListActivity.this, PokemonDetailsActivity.class);
                    intent.putExtra(Constants.POKEMON_SELECTED, gson.toJson(pokemon));
                    startActivity(intent);
                }
            });
            listview.setAdapter(adapter);
        } else if(user.equals("Misty")){
            final List<Pokemon> pokemonList = PokemonUtils.getMistyFavs();
            PokemonListViewAdapter adapter = new PokemonListViewAdapter(this, pokemonList);
            listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Pokemon pokemon = pokemonList.get(position);
                    Intent intent = new Intent(PokemonListActivity.this, PokemonDetailsActivity.class);
                    intent.putExtra(Constants.POKEMON_SELECTED, gson.toJson(pokemon));
                    startActivity(intent);
                }
            });
            listview.setAdapter(adapter);
        } else if(user.equals("Brock")){
            final List<Pokemon> pokemonList = PokemonUtils.getBrockFavs();
            PokemonListViewAdapter adapter = new PokemonListViewAdapter(this, pokemonList);
            listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Pokemon pokemon = pokemonList.get(position);
                    Intent intent = new Intent(PokemonListActivity.this, PokemonDetailsActivity.class);
                    intent.putExtra(Constants.POKEMON_SELECTED, gson.toJson(pokemon));
                    startActivity(intent);
                }
            });
            listview.setAdapter(adapter);
        } else if(user.equals("James")){
            final List<Pokemon> pokemonList = PokemonUtils.getJamesFavs();
            PokemonListViewAdapter adapter = new PokemonListViewAdapter(this, pokemonList);
            listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Pokemon pokemon = pokemonList.get(position);
                    Intent intent = new Intent(PokemonListActivity.this, PokemonDetailsActivity.class);
                    intent.putExtra(Constants.POKEMON_SELECTED, gson.toJson(pokemon));
                    startActivity(intent);
                }
            });
            listview.setAdapter(adapter);
        } else if(user.equals("Jessie")){
            final List<Pokemon> pokemonList = PokemonUtils.getJessieFavs();
            PokemonListViewAdapter adapter = new PokemonListViewAdapter(this, pokemonList);
            listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Pokemon pokemon = pokemonList.get(position);
                    Intent intent = new Intent(PokemonListActivity.this, PokemonDetailsActivity.class);
                    intent.putExtra(Constants.POKEMON_SELECTED, gson.toJson(pokemon));
                    startActivity(intent);
                }
            });
            listview.setAdapter(adapter);
        }

    }

    private void initViews() {
        toolbar = findViewById(R.id.toolbar);
        listview = findViewById(R.id.listViewMyPokemons);
    }

    private void initToolbar() {
        toolbar.setTitle(R.string.pokemon_favorites_activity_title);
        toolbar.setTitleTextColor(ContextCompat.getColor(this, R.color.colorWhite));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
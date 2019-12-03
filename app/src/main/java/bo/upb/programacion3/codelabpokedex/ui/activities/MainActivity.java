package bo.upb.programacion3.codelabpokedex.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import bo.upb.programacion3.codelabpokedex.R;

public class MainActivity extends AppCompatActivity {

    // Elementos de la pantalla
    private Toolbar toolbar; // Usaremos un toolbar personalizado, para agregar el icono del Drawer a la izquierda
    private ActionBarDrawerToggle drawerToggle; // El objeto del botón del drawer
    private DrawerLayout drawerLayout; // Nuestro DrawerLayout
    private TextView nameDrawer;
    private ImageView profileimg;
    private String user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        if (this.toolbar != null) {
            // Aqui configuramos nuestro Toolbar, con el ícono del Drawer a la izquierda
            this.toolbar.setTitle(R.string.main_activity_title);
            this.toolbar.setTitleTextColor(ContextCompat.getColor(this, R.color.colorWhite));

            drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close);
            drawerToggle.setDrawerIndicatorEnabled(false);
            drawerToggle.setHomeAsUpIndicator(R.drawable.icon_hamburger);
            drawerToggle.setToolbarNavigationClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    drawerLayout.openDrawer(GravityCompat.START); // Podemos abrir y cerrar nuestro drawer programáticamente!!
                }
            });

            nameDrawer = (TextView)findViewById(R.id.nameDrawer);
            profileimg = (ImageView)findViewById(R.id.profileimg);

            Bundle extras = getIntent().getExtras();
            if(extras != null){
                user = extras.getString("name");
            }

            nameDrawer.setText(user);
            if(user.equals("Ash")){
                profileimg.setImageResource(R.drawable.ash_ketchum);
            } else if(user.equals("Misty")){
                profileimg.setImageResource(R.drawable.misty);
            } else if(user.equals("Brock")){
                profileimg.setImageResource(R.drawable.brock);
            } else if(user.equals("James")){
                profileimg.setImageResource(R.drawable.james);
            } else if(user.equals("Jessie")){
                profileimg.setImageResource(R.drawable.jessie);
            }

        }
    }

    // Esto ya saben!
    private void initViews() {
        this.toolbar = findViewById(R.id.toolbar);
        this.drawerLayout = findViewById(R.id.navigationDrawer);
    }


    public void goToMyPokemons(View view) {
        Intent intent = new Intent(this, PokemonRecyclerActivity.class);
        startActivity(intent);
    }

    public void goToMyFavoritePokemons(View view) {
        Intent intent = new Intent(this, PokemonListActivity.class);
        intent.putExtra("user", user);
        startActivity(intent);
    }
}

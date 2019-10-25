package id.ac.polinema.recyclerviewsangatsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.adapters.SuperHeroAdapter;
import id.ac.polinema.recyclerviewsangatsederhana.models.SuperHero;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvSuperHero;

    List<SuperHero> listSuperHero = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvSuperHero = findViewById(R.id.rvSuperHero);

        SuperHero hero = new SuperHero("Bangchan", R.drawable.bangchan);
        listSuperHero.add(hero);
        hero = new SuperHero("Changbin", R.drawable.changbin);
        listSuperHero.add(hero);
        hero = new SuperHero("Felix", R.drawable.felix);
        listSuperHero.add(hero);
        hero = new SuperHero("Han", R.drawable.han);
        listSuperHero.add(hero);
        

        SuperHeroAdapter superHeroAdapter = new SuperHeroAdapter((ArrayList<SuperHero>) listSuperHero);

        rvSuperHero.setAdapter(superHeroAdapter);
        rvSuperHero.setLayoutManager(new LinearLayoutManager(this));
    }
}
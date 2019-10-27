package id.ac.polinema.recyclerviewsangatsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

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
        hero = new SuperHero("Hyunjin", R.drawable.hyunjin);
        listSuperHero.add(hero);
        hero = new SuperHero("Felix", R.drawable.felix);
        listSuperHero.add(hero);
        hero = new SuperHero("IN", R.drawable.in);
        listSuperHero.add(hero);

        SuperHeroAdapter superHeroAdapter = new SuperHeroAdapter((ArrayList<SuperHero>) listSuperHero);

        rvSuperHero.setAdapter(superHeroAdapter);
        rvSuperHero.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void showRecyclerList(){
        rvSuperHero.setLayoutManager(new LinearLayoutManager(this));
        SuperHeroAdapter listHeroAdapter = new SuperHeroAdapter((ArrayList<SuperHero>) listSuperHero);
        rvSuperHero.setAdapter(listHeroAdapter);
    }

    private void showRecyclerGrid(){
        rvSuperHero.setLayoutManager(new GridLayoutManager(this, 2));
        SuperHeroAdapter listHeroAdapter = new SuperHeroAdapter((ArrayList<SuperHero>) listSuperHero);
        rvSuperHero.setAdapter(listHeroAdapter);
    }

    public void setMode(int selectedMode){
        switch (selectedMode){
            case R.id.action_list:
                showRecyclerList();
                break;
            case R.id.action_grid:
                showRecyclerGrid();
                break;
        }
    }
}
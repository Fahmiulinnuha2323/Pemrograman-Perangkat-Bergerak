package com.funqud.clubindonesia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvClub;
    private ArrayList<Club> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvClub = findViewById(R.id.rv_politeknik);
        rvClub.setHasFixedSize(true);

        list.addAll(ClubData.getListData());
        showRecyclerCardView();

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Club Liga 1 Indonesia");
        }
    }

    private void showRecyclerCardView() {
        rvClub.setLayoutManager(new LinearLayoutManager(this));
        CardViewClubAdapter cardViewHeroAdapter = new CardViewClubAdapter(this,list);
        rvClub.setAdapter(cardViewHeroAdapter);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.profile:
                Intent activity1 = new Intent(this, profile.class);
                startActivity(activity1);
                return true;
            default:
                return true;
        }
    }

}


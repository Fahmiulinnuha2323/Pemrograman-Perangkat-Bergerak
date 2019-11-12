package com.funqud.clubindonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailListClub extends AppCompatActivity {
    private int club_id;
    ImageView imgDetail;
    TextView tvName, tvDesc;

    private ArrayList<Club> listukm = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_club);

        club_id = getIntent().getIntExtra("club_id",0);
        tvName = findViewById(R.id.nama_club);
        tvDesc = findViewById(R.id.desc_detail);
        imgDetail = findViewById(R.id.img_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listukm.addAll(ClubData.getListData());
        setLayout();
    }

    private void setLayout() {
        this.setTitle(listukm.get(club_id).getName());
        tvName.setText(listukm.get(club_id).getName());
        tvDesc.setText(listukm.get(club_id).getDetail());
        Glide.with(this )
                .load(listukm.get(club_id).getPhoto())
                .apply(new RequestOptions().override(350, 350))
                .into(imgDetail);
    }

    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }
}

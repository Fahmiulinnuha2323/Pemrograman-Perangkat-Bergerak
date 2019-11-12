package com.funqud.clubindonesia;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewClubAdapter extends RecyclerView.Adapter<CardViewClubAdapter.CardViewViewHolder> {
    private ArrayList<Club> listClub;
    private Context context;

    public CardViewClubAdapter(Context context, ArrayList<Club>listClub){
        this.listClub = listClub;
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_club,viewGroup, false );
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {
        final Club club = listClub.get(position);
        Glide.with(holder.itemView.getContext())
                .load(club.getPhoto())
                .apply(new RequestOptions().override(200, 200))
                .into(holder.imgPhoto);

        holder.tvName.setText(club.getName());
        holder.tvDetail.setText(club.getDetail());

        holder.btnSelengkapnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Selengkapnya " +
                        listClub.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });

        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailClub = new Intent(context, DetailListClub.class);
                detailClub.putExtra("club_id", club.getId());
                context.startActivity(detailClub);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listClub.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        Button btnSelengkapnya, btn;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            btnSelengkapnya = itemView.findViewById(R.id.btn_set_selengkapnya);
            btn = itemView.findViewById(R.id.btn_set_selengkapnya);

        }
    }
}

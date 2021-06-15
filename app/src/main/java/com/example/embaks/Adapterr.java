package com.example.embaks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapterr extends RecyclerView.Adapter<Adapterr.CardViewT> {
    public Context mContext;
    public List<String> data;
    public int soruNumarasi =1;


    public Adapterr(Context mContext, List<String> data) {
        this.mContext = mContext;
        this.data = data;
    }

    public class CardViewT extends RecyclerView.ViewHolder{
        public RadioButton soruSayisi_rb;
        public CardView ustCardView;

        public CardViewT(@NonNull View itemView) {
            super(itemView);
            soruSayisi_rb=itemView.findViewById(R.id.sorusayisi_rb);
            ustCardView = itemView.findViewById(R.id.ustCardView);

        }

    }

    @NonNull
    @Override
    public CardViewT onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.sorularust,parent,false);
        return new CardViewT(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull CardViewT holder, int position) {
        final String sayi = data.get(position);

        holder.soruSayisi_rb.setText(sayi);
        changed(holder,position,data,mContext);
        holder.soruSayisi_rb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Deneme_sinav_ekrani mainActivity = new Deneme_sinav_ekrani();
                mainActivity.secenek(mContext,Integer.valueOf(sayi)-1,holder);

                changed(holder,position,data,mContext);

                notifyDataSetChanged();

            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void changed(CardViewT holder,int position,List<String> data,Context mContext2) {

        final String sayi = data.get(position);
        Deneme_sinav_ekrani mainActivity = new Deneme_sinav_ekrani();

        if (mainActivity.soruUstIsaretleme(Integer.valueOf(sayi)-1 , mContext, 0) == 0) {
            holder.soruSayisi_rb.setChecked(false);
        }
        else {
            holder.soruSayisi_rb.setChecked(true);
        }
    }
}



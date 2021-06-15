package com.example.embaks;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import static com.example.embaks.Card_Ozellikleri.EN_UST_BOLUM;
import static com.example.embaks.Card_Ozellikleri.UST_BASLIK;
import static com.example.embaks.Card_Ozellikleri.ALT_BOLUM;
import static com.example.embaks.Card_Ozellikleri.IKILI_BASLIK;

public class Konu_anlatim_adapter extends RecyclerView.Adapter{

        private List mList;

        public Konu_anlatim_adapter(List list) {
            this.mList = list;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view;

            switch (viewType) {
                case UST_BASLIK:
                    view = LayoutInflater.from(parent.getContext()).inflate(R.layout.alt_bolum, parent, false);
                    return new CityViewHolder(view);
                case ALT_BOLUM:
                    view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ust_bolum, parent, false);
                    return new EventViewHolder(view);
                case IKILI_BASLIK:
                    view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ikilibolum,parent,false);
                    return new IkiliViewHolder(view);
                case EN_UST_BOLUM:
                    view = LayoutInflater.from(parent.getContext()).inflate(R.layout.en_ust_bolum,parent,false);
                    return new UstViewHolder(view);

            }
            return null;
        }


        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            Card_Ozellikleri object = (Card_Ozellikleri) mList.get(position);
            if (object != null) {
                switch (object.getType()) {
                    case UST_BASLIK:
                        ((CityViewHolder) holder).mTitle.setText(object.getName());
                        break;
                    case ALT_BOLUM:
                        ((EventViewHolder) holder).mTitle.setText(object.getName());
                        ((EventViewHolder) holder).mDescription.setText(object.getDescription());
                        break;
                    case  IKILI_BASLIK:
                        ((IkiliViewHolder) holder).mTitle.setText(object.getName());
                        ((IkiliViewHolder) holder).mDescription.setText(object.getDescription());
                        break;
                    case  EN_UST_BOLUM:
                        ((UstViewHolder) holder).mTitle.setText(object.getName());
                        break;
                }
            }
        }
        @Override
        public int getItemCount() {
            if (mList == null)
                return 0;
            return mList.size();
        }

        @Override
        public int getItemViewType(int position) {
            if (mList != null) {
                Card_Ozellikleri object = (Card_Ozellikleri) mList.get(position);
                if (object != null) {
                    return object.getType();
                }
            }
            return 0;
        }

    public static class UstViewHolder extends RecyclerView.ViewHolder {
        private TextView mTitle;

        public UstViewHolder(View itemView) {
            super(itemView);
            mTitle = (TextView) itemView.findViewById(R.id.titleTextView);
        }
    }

        public static class CityViewHolder extends RecyclerView.ViewHolder {
            private TextView mTitle;

            public CityViewHolder(View itemView) {
                super(itemView);
                mTitle = (TextView) itemView.findViewById(R.id.titleTextView);
            }
        }

        public static class EventViewHolder extends RecyclerView.ViewHolder {
            private TextView mTitle;
            private TextView mDescription;

            public EventViewHolder(View itemView) {
                super(itemView);
                mTitle = (TextView) itemView.findViewById(R.id.titleTextView);
                mDescription = (TextView) itemView.findViewById(R.id.descriptionTextView);
            }
        }
        public static class IkiliViewHolder extends RecyclerView.ViewHolder {
            private TextView mTitle;
            private TextView mDescription;

            public IkiliViewHolder(View itemView) {
                super(itemView);
                mTitle = (TextView) itemView.findViewById(R.id.titleTextView);
                mDescription = (TextView) itemView.findViewById(R.id.descriptionTextView);
            }
        }
}

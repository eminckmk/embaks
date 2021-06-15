package com.example.embaks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Konu_anlatim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konu_anlatim);

        Toolbar toolbarTop = (Toolbar) findViewById(R.id.toolbar_konuanlatim);

        toolbarTop.setNavigationIcon(R.drawable.ic_geri);
        toolbarTop.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
        TextView mTitle = (TextView) toolbarTop.findViewById(R.id.toolbar_sinavtarihleri);
        mTitle.setText("Konu Özeti");


    }

    @Override
    protected void onStart() {
        super.onStart();

        String gelenmesaj = getIntent().getStringExtra("data");

        Konu_anlatim_adapter adapter = new Konu_anlatim_adapter(Veri_konuanlatim.getData(gelenmesaj));

        @SuppressLint("WrongConstant") LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, OrientationHelper.VERTICAL,false);
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.rv);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(adapter);

    }
}
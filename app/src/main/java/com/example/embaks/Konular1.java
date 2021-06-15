package com.example.embaks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Konular1 extends AppCompatActivity {

    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konular1);


        Toolbar toolbarTop = (Toolbar) findViewById(R.id.toolbar_anasayfa);

        toolbarTop.setNavigationIcon(R.drawable.ic_geri);
        toolbarTop.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
        TextView mTitle = (TextView) toolbarTop.findViewById(R.id.toolbar_sinavtarihleri);
        mTitle.setText("AKS");

        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
        button_4 = findViewById(R.id.button_4);

        int pdf=0;

        try{pdf = ((int) getIntent().getSerializableExtra("pdf"));}
        catch (Exception e){ pdf=0;}

        int finalPdf = pdf;

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Konular1.this,Konular11.class);
                intent.putExtra("pdf", finalPdf);
                startActivity(intent);
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Konular1.this,Konular12.class);
                intent.putExtra("pdf", finalPdf);
                startActivity(intent);
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Konular1.this,Konular13.class);
                intent.putExtra("pdf", finalPdf);
                startActivity(intent);
            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Konular1.this,Konular14.class);
                intent.putExtra("pdf", finalPdf);
                startActivity(intent);
            }
        });



    }
}
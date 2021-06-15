package com.example.embaks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Anasayfa extends AppCompatActivity {

    private Button button_konular;
    private Button button_cikmisSorular;
    private Button button_pdfOzetleri;
    private Button button_sinavBilgileri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anasayfa);

        button_konular=findViewById(R.id.button_konular);
        button_cikmisSorular=findViewById(R.id.button_2);
        button_pdfOzetleri=findViewById(R.id.button_3);
        button_sinavBilgileri=findViewById(R.id.button_4);

        Toolbar toolbarTop = (Toolbar) findViewById(R.id.toolbar_anasayfa);
        TextView mTitle = (TextView) toolbarTop.findViewById(R.id.toolbar_sinavtarihleri);
        mTitle.setText("Anasayfa");


        button_konular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Anasayfa.this, Konular1.class);
                startActivity(intent);

            }
        });

        button_cikmisSorular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Anasayfa.this, Sinav_Tarihleri.class);
                startActivity(intent);
            }
        });

        button_pdfOzetleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Anasayfa.this, Konular1.class);
                intent.putExtra("pdf",1);
                startActivity(intent);
            }
        });




    }
}
package com.example.embaks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Konular13 extends AppCompatActivity {
    private Button button31;
    private Button button32;
    private Button button33;
    private Button button34;
    private Button button35;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konular13);

        button31 = findViewById(R.id.button_31);
        button32 = findViewById(R.id.button_32);
        button33 = findViewById(R.id.button_33);
        button34 = findViewById(R.id.button_34);
        button35 = findViewById(R.id.button_35);


        androidx.appcompat.widget.Toolbar toolbarTop = (Toolbar) findViewById(R.id.toolbar_konular11);
        toolbarTop.setNavigationIcon(R.drawable.ic_geri);
        toolbarTop.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
        TextView mTitle = (TextView) toolbarTop.findViewById(R.id.toolbar_sinavtarihleri);
        mTitle.setText("AKS");

        int pdf =0;//pdf
        try{pdf = ((int) getIntent().getSerializableExtra("pdf"));}
        catch (Exception e){ pdf=0;}
        int finalPdf = pdf;

        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (finalPdf ==1){
                    Intent intent = new Intent(Konular13.this,Pdfokuyucu.class);
                    intent.putExtra("sinavNumarasi",31);
                    startActivity(intent);

                }
                else{
                    Intent intent = new Intent(Konular13.this,Konu_anlatim.class);
                    intent.putExtra("data","31");
                    startActivity(intent);
                }
            }
        });

        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (finalPdf ==1){
                    Intent intent = new Intent(Konular13.this,Pdfokuyucu.class);
                    intent.putExtra("sinavNumarasi",32);
                    startActivity(intent);

                }
                else{
                    Intent intent = new Intent(Konular13.this,Konu_anlatim.class);
                    intent.putExtra("data","32");
                    startActivity(intent);
                }
            }
        });

        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (finalPdf ==1){
                    Intent intent = new Intent(Konular13.this,Pdfokuyucu.class);
                    intent.putExtra("sinavNumarasi",33);
                    startActivity(intent);

                }
                else{
                    Intent intent = new Intent(Konular13.this,Konu_anlatim.class);
                    intent.putExtra("data","33");
                    startActivity(intent);
                }
            }
        });

        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (finalPdf ==1){
                    Intent intent = new Intent(Konular13.this,Pdfokuyucu.class);
                    intent.putExtra("sinavNumarasi",34);
                    startActivity(intent);

                }
                else{
                    Intent intent = new Intent(Konular13.this,Konu_anlatim.class);
                    intent.putExtra("data","34");
                    startActivity(intent);
                }
            }
        });

        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (finalPdf ==1){
                    Intent intent = new Intent(Konular13.this,Pdfokuyucu.class);
                    intent.putExtra("sinavNumarasi",35);
                    startActivity(intent);

                }
                else{
                    Intent intent = new Intent(Konular13.this,Konu_anlatim.class);
                    intent.putExtra("data","35");
                    startActivity(intent);
                }
            }
        });

    }
}
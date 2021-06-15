package com.example.embaks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Konular14 extends AppCompatActivity {

    Button button_41;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konular14);

        button_41 = findViewById(R.id.button_41);

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

        button_41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (finalPdf ==1){
                    Intent intent = new Intent(Konular14.this,Pdfokuyucu.class);
                    intent.putExtra("sinavNumarasi",41);
                    startActivity(intent);

                }
                else{
                    Intent intent = new Intent(Konular14.this,Konu_anlatim.class);
                    intent.putExtra("data","41");
                    startActivity(intent);
                }
            }
        });
    }
}
package com.example.embaks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Konular12 extends AppCompatActivity {

    private Button button21;
    private Button button22;
    private Button button23;
    private Button button24;
    private Button button25;
    private Button button26;
    private Button button27;
    private Button button28;
    private Button button29;
    private Button button210;
    private Button button211;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konular12);
        button21 = findViewById(R.id.button_21);
        button22 = findViewById(R.id.button_22);
        button23 = findViewById(R.id.button_23);
        button24 = findViewById(R.id.button_24);
        button25 = findViewById(R.id.button_25);
        button26 = findViewById(R.id.button_26);
        button27 = findViewById(R.id.button_27);
        button28 = findViewById(R.id.button_28);
        button29 = findViewById(R.id.button_29);
        button210 = findViewById(R.id.button_210);
        button211 = findViewById(R.id.button_211);

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

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (finalPdf ==1){
                    Intent intent = new Intent(Konular12.this,Pdfokuyucu.class);
                    intent.putExtra("sinavNumarasi",21);
                    startActivity(intent);

                }
                else{
                    Intent intent = new Intent(Konular12.this,Konu_anlatim.class);
                    intent.putExtra("data","21");
                    startActivity(intent);
                }
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (finalPdf ==1){
                    Intent intent = new Intent(Konular12.this,Pdfokuyucu.class);
                    intent.putExtra("sinavNumarasi",22);
                    startActivity(intent);

                }
                else{
                    Intent intent = new Intent(Konular12.this,Konu_anlatim.class);
                    intent.putExtra("data","22");
                    startActivity(intent);
                }
            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (finalPdf ==1){
                    Intent intent = new Intent(Konular12.this,Pdfokuyucu.class);
                    intent.putExtra("sinavNumarasi",23);
                    startActivity(intent);

                }
                else{
                    Intent intent = new Intent(Konular12.this,Konu_anlatim.class);
                    intent.putExtra("data","23");
                    startActivity(intent);
                }
            }
        });
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (finalPdf ==1){
                    Intent intent = new Intent(Konular12.this,Pdfokuyucu.class);
                    intent.putExtra("sinavNumarasi",24);
                    startActivity(intent);

                }
                else{
                    Intent intent = new Intent(Konular12.this,Konu_anlatim.class);
                    intent.putExtra("data","24");
                    startActivity(intent);
                }
            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (finalPdf ==1){
                    Intent intent = new Intent(Konular12.this,Pdfokuyucu.class);
                    intent.putExtra("sinavNumarasi",25);
                    startActivity(intent);

                }
                else{
                    Intent intent = new Intent(Konular12.this,Konu_anlatim.class);
                    intent.putExtra("data","25");
                    startActivity(intent);
                }
            }
        });
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (finalPdf ==1){
                    Intent intent = new Intent(Konular12.this,Pdfokuyucu.class);
                    intent.putExtra("sinavNumarasi",26);
                    startActivity(intent);

                }
                else{
                    Intent intent = new Intent(Konular12.this,Konu_anlatim.class);
                    intent.putExtra("data","26");
                    startActivity(intent);
                }
            }
        });
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (finalPdf ==1){
                    Intent intent = new Intent(Konular12.this,Pdfokuyucu.class);
                    intent.putExtra("sinavNumarasi",27);
                    startActivity(intent);

                }
                else{
                    Intent intent = new Intent(Konular12.this,Konu_anlatim.class);
                    intent.putExtra("data","27");
                    startActivity(intent);
                }
            }
        });
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (finalPdf ==1){
                    Intent intent = new Intent(Konular12.this,Pdfokuyucu.class);
                    intent.putExtra("sinavNumarasi",28);
                    startActivity(intent);

                }
                else{
                    Intent intent = new Intent(Konular12.this,Konu_anlatim.class);
                    intent.putExtra("data","28");
                    startActivity(intent);
                }
            }
        });
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (finalPdf ==1){
                    Intent intent = new Intent(Konular12.this,Pdfokuyucu.class);
                    intent.putExtra("sinavNumarasi",29);
                    startActivity(intent);

                }
                else{
                    Intent intent = new Intent(Konular12.this,Konu_anlatim.class);
                    intent.putExtra("data","29");
                    startActivity(intent);
                }
            }
        });
        button210.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (finalPdf ==1){
                    Intent intent = new Intent(Konular12.this,Pdfokuyucu.class);
                    intent.putExtra("sinavNumarasi",210);
                    startActivity(intent);

                }
                else{
                    Intent intent = new Intent(Konular12.this,Konu_anlatim.class);
                    intent.putExtra("data","210");
                    startActivity(intent);
                }
            }
        });
        button211.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (finalPdf ==1){
                    Intent intent = new Intent(Konular12.this,Pdfokuyucu.class);
                    intent.putExtra("sinavNumarasi",211);
                    startActivity(intent);

                }
                else{
                    Intent intent = new Intent(Konular12.this,Konu_anlatim.class);
                    intent.putExtra("data","211");
                    startActivity(intent);
                }
            }
        });

    }
}
package com.example.embaks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SonucGosterme extends AppCompatActivity {

    private TextView text_toplamDogruSayisi;
    private TextView text_toplamYanlisSayisi;
    private TextView text_toplamBosSayisi;
    private TextView text_toplamNet;
    private Button buttonSonucGoster;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonuc_gosterme);

        Toolbar toolbarTop = (Toolbar) findViewById(R.id.toolbar_sonuc);
        toolbarTop.setNavigationIcon(R.drawable.ic_geri);
        toolbarTop.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });
        TextView mTitle = (TextView) toolbarTop.findViewById(R.id.toolbar_sonuctitle);
        mTitle.setText("Tebrikler");

        text_toplamDogruSayisi= findViewById(R.id.text_toplamDogruSayisi);
        text_toplamYanlisSayisi= findViewById(R.id.text_toplamYanlisSayisi);
        text_toplamBosSayisi= findViewById(R.id.text_toplamBosSayisi);
        text_toplamNet= findViewById(R.id.text_toplamnet);
        buttonSonucGoster=findViewById(R.id.button_yanlisSorulariGoster);

        int sinavNo = ((int) getIntent().getSerializableExtra("sinavNo"));
        int toplamDogruSayisi = ((int) getIntent().getSerializableExtra("toplamdogrusayisi"));
        int toplamYanlisSayisi = ((int) getIntent().getSerializableExtra("toplamyanlissayisi"));
        int toplamBosSayisi = 100-(toplamDogruSayisi+toplamYanlisSayisi);

        SharedPreferences mSharedPref = getSharedPreferences("ilkson",MODE_PRIVATE);
        SharedPreferences.Editor editor2 = mSharedPref.edit();
        editor2.putInt("ilkson"+sinavNo,1);
        editor2.apply();


        if(toplamDogruSayisi<60.0){
            text_toplamNet.setText("Başarısız");
            text_toplamNet.setTextColor(ColorStateList.valueOf(Color.parseColor("#FA6F6F")));
        }
        else{
            text_toplamNet.setText("Başarılı!");
            text_toplamNet.setTextColor(ColorStateList.valueOf(Color.parseColor("#FF2FF637")));
        }


        text_toplamDogruSayisi.setText(toplamDogruSayisi+" Doğru");
        text_toplamYanlisSayisi.setText(toplamYanlisSayisi+" Yanlış");
        text_toplamBosSayisi.setText(toplamBosSayisi+" Boş");



        updateChart((double) toplamDogruSayisi,100);
        buttonSonucGoster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SonucGosterme.this,Sorucozum_ekrani.class);
                intent.putExtra("sinavNumarasi",sinavNo);
                intent.putExtra("sonuc",true);
                startActivity(intent);
            }
        });

    }


    private void updateChart(Double toplamNet, int toplamSoruSayisi){
        // Update the text in a center of the chart:
       // TextView numberOfCals = findViewById(R.id.number_of_calories);
       // numberOfCals.setText(String.valueOf(calsBurned) + " / " + calsConsumed);

        // Calculate the slice size and update the pie chart:
        ProgressBar pieChart = findViewById(R.id.stats_progressbar);
        double d = (double) toplamNet / (double) toplamSoruSayisi;
        int progress = (int) (d * 100);
        pieChart.setProgress(progress);
}}
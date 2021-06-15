package com.example.embaks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sinav_Tarihleri extends AppCompatActivity {

    int i =0;
    int sonKalanDenemeSinavi=0;
    int sonKalanSoruCozum=0;

    final CharSequence[] items = {"Deneme Sınavı", "Soru Çözüm", "Sınav PDF"};
    final CharSequence[] items2 = {"Yeni Sınav", "Sınav Devamı"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinav__tarihleri);

            Button sinav = findViewById(R.id.button_sinav);
            Button sinav1 = findViewById(R.id.button_sinav1);
            Button sinav2 = findViewById(R.id.button_sinav2);
            Button sinav3 = findViewById(R.id.button_sinav3);
            Button sinav4 = findViewById(R.id.button_sinav4);
            Button sinav5 = findViewById(R.id.button_sinav5);
            Button sinav6 = findViewById(R.id.button_sinav6);
            Button sinav7 = findViewById(R.id.button_sinav7);

            Toolbar toolbarTop = (Toolbar) findViewById(R.id.toolbar_sinavtarihleri);
            toolbarTop.setNavigationIcon(R.drawable.ic_geri);
            toolbarTop.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    finish();
                }
            });
            TextView mTitle = (TextView) toolbarTop.findViewById(R.id.toolbar_sinavtarihlerititle);
            mTitle.setText("Geçmiş Sınavlar");



            sinav.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    SharedPreferences mSharedPrefs = getSharedPreferences("ilkson",MODE_PRIVATE);
                    int ilkson = mSharedPrefs.getInt("ilkson"+1,1);
                    int ilkson2 = mSharedPrefs.getInt("ilkson"+11,1);
                    deneme_sinavSecim("2015 Ekim",ilkson,1);
                }
            });

            sinav1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    SharedPreferences mSharedPrefs = getSharedPreferences("ilkson",MODE_PRIVATE);
                    int ilkson = mSharedPrefs.getInt("ilkson"+2,1);
                    int ilkson2 = mSharedPrefs.getInt("ilkson"+12,1);
                    deneme_sinavSecim("2016 Mart",ilkson,2);

                }
            });

            sinav2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    SharedPreferences mSharedPrefs = getSharedPreferences("ilkson",MODE_PRIVATE);
                    int ilkson = mSharedPrefs.getInt("ilkson"+3,1);
                    int ilkson2 = mSharedPrefs.getInt("ilkson"+13,1);
                    deneme_sinavSecim("2016 Aralık",ilkson,3);
                }
            });

            sinav3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    SharedPreferences mSharedPrefs = getSharedPreferences("ilkson",MODE_PRIVATE);
                    int ilkson = mSharedPrefs.getInt("ilkson"+4,1);
                    int ilkson2 = mSharedPrefs.getInt("ilkson"+14,1);
                    deneme_sinavSecim("2016 Aralık",ilkson,4);
                }
            });

            sinav4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    SharedPreferences mSharedPrefs = getSharedPreferences("ilkson",MODE_PRIVATE);
                    int ilkson = mSharedPrefs.getInt("ilkson"+5,1);
                    int ilkson2 = mSharedPrefs.getInt("ilkson"+15,1);
                    deneme_sinavSecim("2016 Aralık",ilkson,5);
                }
            });

            sinav5.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    SharedPreferences mSharedPrefs = getSharedPreferences("ilkson",MODE_PRIVATE);
                    int ilkson = mSharedPrefs.getInt("ilkson"+6,1);
                    int ilkson2 = mSharedPrefs.getInt("ilkson"+16,1);
                    deneme_sinavSecim("2016 Aralık",ilkson,6);
                }
            });

            sinav6.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    SharedPreferences mSharedPrefs = getSharedPreferences("ilkson",MODE_PRIVATE);
                    int ilkson = mSharedPrefs.getInt("ilkson"+7,1);
                    int ilkson2 = mSharedPrefs.getInt("ilkson"+17,1);
                    deneme_sinavSecim("2016 Aralık",ilkson,7);
                }
            });
            sinav7.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    SharedPreferences mSharedPrefs = getSharedPreferences("ilkson",MODE_PRIVATE);
                    int ilkson = mSharedPrefs.getInt("ilkson"+8,1);
                    int ilkson2 = mSharedPrefs.getInt("ilkson"+18,1);
                    deneme_sinavSecim("2016 Aralık",ilkson,8);
                }
            });

    }


    public void deneme_sinavSecim(String ustBaslik,int ilkson,int sinavNumarasi){

        AlertDialog.Builder builder = DialogHelper.alertBuilder(Sinav_Tarihleri.this);

        builder.setTitle(ustBaslik);
        builder.setItems(items, new DialogInterface.OnClickListener()
        {
            public void onClick(DialogInterface dialog, int which)
            {
                if(items[which].equals("Deneme Sınavı")){

                    if(ilkson==1){

                        SharedPreferences mSharedPref = getSharedPreferences("ilkson",MODE_PRIVATE);
                        SharedPreferences.Editor editor2 = mSharedPref.edit();
                        editor2.putInt("ilkson"+sinavNumarasi,2);
                        editor2.commit();

                        SharedPreferences mSharedPrefs = getSharedPreferences("KişiselBilgiler",MODE_PRIVATE);
                        int sss= mSharedPrefs.getInt("sonkalandeneme",0);
                        Intent intent = new Intent(Sinav_Tarihleri.this,Deneme_sinav_ekrani.class);
                        intent.putExtra("testt",1);
                        intent.putExtra("eas",1);
                        intent.putExtra("sinavNumarasi",sinavNumarasi);
                        startActivity(intent);
                    }

                    else{

                    AlertDialog.Builder builder = DialogHelper.alertBuilder(Sinav_Tarihleri.this);
                    builder.setTitle(ustBaslik+" Deneme Sınavı");
                    builder.setItems(items2, new DialogInterface.OnClickListener()
                    {
                        public void onClick(DialogInterface dialog, int which)
                        {

                            if(items2[which].equals("Sınav Devamı")){
                                SharedPreferences mSharedPrefs = getSharedPreferences("KişiselBilgiler",MODE_PRIVATE);
                                int sss= mSharedPrefs.getInt("sonkalandeneme"+sinavNumarasi,0);

                                Intent intent = new Intent(Sinav_Tarihleri.this,Deneme_sinav_ekrani.class);
                                intent.putExtra("testt",0);
                                intent.putExtra("sinavNumarasi",sinavNumarasi);
                                intent.putExtra("eas",sss);
                                startActivity(intent);
                            }
                            else{
                                SharedPreferences mSharedPrefs = getSharedPreferences("KişiselBilgiler",MODE_PRIVATE);
                                //int sss= mSharedPrefs.getInt("sonkalann",0);
                                Intent intent = new Intent(Sinav_Tarihleri.this,Deneme_sinav_ekrani.class);
                                intent.putExtra("testt",1);
                                intent.putExtra("sinavNumarasi",sinavNumarasi);
                                intent.putExtra("eas",1);
                                startActivity(intent);
                            }
                        }
                    });
                    builder.setNegativeButton("Geri", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            deneme_sinavSecim(ustBaslik,0,sinavNumarasi);
                        }
                    });
                    builder.create();
                    builder.show();
                }}


                else if(items[which].equals("Soru Çözüm")){
                    if(ilkson ==1){



                        SharedPreferences mSharedPrefs = getSharedPreferences("KişiselBilgiler",MODE_PRIVATE);
                        int sss= mSharedPrefs.getInt("sonkalancozum",0);
                        Intent intent = new Intent(Sinav_Tarihleri.this,Sorucozum_ekrani.class);
                        intent.putExtra("testt",0);
                        intent.putExtra("eas",sss);
                        startActivity(intent);
                    }

                    else{
                        AlertDialog.Builder builder = DialogHelper.alertBuilder(Sinav_Tarihleri.this);
                        builder.setTitle(ustBaslik+" Soru Çözüm");
                        builder.setItems(items2, new DialogInterface.OnClickListener()
                        {
                            public void onClick(DialogInterface dialog, int which)
                            {

                                if(items2[which].equals("Sınav Devamı")){
                                    SharedPreferences mSharedPrefs = getSharedPreferences("SoruOzellikleri",MODE_PRIVATE);
                                    int sss= mSharedPrefs.getInt("sonkalancozum",0);

                                    Intent intent = new Intent(Sinav_Tarihleri.this,Sorucozum_ekrani.class);
                                //    intent.putExtra("testt",0);
                                    intent.putExtra("sinavNumarasi",sinavNumarasi);
                                    intent.putExtra("eass",1); // hata burda
                                    startActivity(intent);
                                }
                                else{
                                    SharedPreferences mSharedPrefs = getSharedPreferences("SoruOzellikleri",MODE_PRIVATE);
                                    Intent intent = new Intent(Sinav_Tarihleri.this,Sorucozum_ekrani.class);
                                    intent.putExtra("eass",0);
                                    intent.putExtra("sinavNumarasi",sinavNumarasi);
                                    startActivity(intent);
                                }
                            }
                        });

                        builder.setNegativeButton("Geri", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                deneme_sinavSecim(ustBaslik,0,sinavNumarasi);
                            }
                        });
                        builder.create();
                        builder.show();
                    }



                }

                else if(items[which].equals("Sınav PDF")) {
                    Intent intent = new Intent(Sinav_Tarihleri.this,Pdfokuyucu.class);
                    intent.putExtra("sinavNumarasi",sinavNumarasi);
                    startActivity(intent);
                }

            }
        });


        builder.setNegativeButton("Geri", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.create();
        builder.show();



    }


    }





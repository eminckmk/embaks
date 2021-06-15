package com.example.embaks;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Sorucozum_ekrani extends AppCompatActivity {

    private TextView text_soru;
    private LinearLayout lineer_soru,linear_cevap;
    private ImageView fotograf_soru;
    private Button button_ileri, button_geri;
    private Button button_sonucgoster;
    private int count =0;
    public List<SoruModel1> list;
    public List<SoruModel1> listyanlis= new ArrayList<>();
    public int sorusayisi = 0;
    public RadioButton a,b,c,d,e;
    public RadioGroup radioGroup;
    private String listkeyn;
    private boolean sonucgosterme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorucozum_ekrani);

        text_soru=findViewById(R.id.text_soru);
        lineer_soru = findViewById(R.id.lineer_soru);
        linear_cevap= findViewById(R.id.linear_cevaplar);
        button_ileri=findViewById(R.id.button_ileri);
        button_geri=findViewById(R.id.button_geri);
        button_sonucgoster=findViewById(R.id.button_soruCozumCikis);
        fotograf_soru=findViewById(R.id.fotograf_soru);
        radioGroup= findViewById(R.id.radiogrupsorucozum);
        a=findViewById(R.id.radioButtona2);
        b=findViewById(R.id.radioButtonb2);
        c=findViewById(R.id.radioButtonc2);
        d=findViewById(R.id.radioButtond2);
        e=findViewById(R.id.radioButtone2);

        Toolbar toolbarTop = (Toolbar) findViewById(R.id.toolbar_sorucozum);
        toolbarTop.setNavigationIcon(R.drawable.ic_geri);
        toolbarTop.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
        TextView mTitle = (TextView) toolbarTop.findViewById(R.id.toolbar_sorucozumtitle);
        mTitle.setText("2015 Ekim");

        int sinavNumarasi = ((int) getIntent().getSerializableExtra("sinavNumarasi"));;

        Dataa dataa = new Dataa();
        list=dataa.getData(sinavNumarasi);

        try{

            sonucgosterme=(boolean)getIntent().getSerializableExtra("sonuc");
            listkeyn ="listkey"+sinavNumarasi;
            list = PrefConfig.readListFromPref(this, listkeyn);

            for(int i=0;i<100;i++){
                if(list.get(i).getDogrulukKontrolu()!=null&&list.get(i).getDogrulukKontrolu().booleanValue()==false&&list.get(i).getSecilensecenek()!=null){

                    listyanlis.add(list.get(i));
                }
            }

            list=listyanlis;


        }catch (Exception e){
            Log.e( "onCreatecatch: ","catchde" );
            Log.e( "hata",e+" " );

        }





        if(sinavNumarasi==1||sinavNumarasi==2||sinavNumarasi==3){
            e.setVisibility(View.GONE);
        }
        else if(sinavNumarasi==1||sinavNumarasi==2||sinavNumarasi==3){
            e.setVisibility(View.VISIBLE);
        }

        for (int i =0; i <5;i++){

            radioGroup.getChildAt(i).setOnClickListener(new View.OnClickListener() {
                @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                @Override
                public void onClick(View v) {
                    checkAnswer(((RadioButton)v));
                }
            });
        }

        Log.e( "dizi uzunluğu",list.size()+" ");

        playAnim(text_soru,0,list.get(sorusayisi).getSoru());
        button_ileri.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {

                button_sonucgoster.setVisibility(View.INVISIBLE);
                sorusayisi++;
                count=0;

                playAnim(text_soru,0,list.get(sorusayisi).getSoru());


                if(false == list.get(sorusayisi).getFotografliSoru()){

                    text_soru.setVisibility(View.VISIBLE);
                    fotograf_soru.setVisibility(View.GONE);

                }
                else{

                    if(null == list.get(sorusayisi).getSoru()){
                        text_soru.setVisibility(View.GONE);
                        fotograf_soru.setVisibility(View.VISIBLE);
                        fotograf_soru.setImageResource(getResources().getIdentifier(list.get(sorusayisi).getImageSoru(),"drawable",getPackageName()));
                    }
                    else{
                        text_soru.setVisibility(View.VISIBLE);
                        fotograf_soru.setVisibility(View.VISIBLE);
                        fotograf_soru.setImageResource(getResources().getIdentifier(list.get(sorusayisi).getImageSoru(),"drawable",getPackageName()));
                    }
                }

                SharedPreferences mSharedPrefs = getSharedPreferences("SoruOzellikleri",MODE_PRIVATE);
                SharedPreferences.Editor editor = mSharedPrefs.edit();
                editor.putInt("sonkalancozum",sorusayisi);
                editor.commit();
            }
        });

        button_geri.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {

                count=0;
                button_sonucgoster.setVisibility(View.INVISIBLE);
                button_sonucgoster.setEnabled(false);
                sorusayisi--;

                playAnim(text_soru,0,list.get(sorusayisi).getSoru());



                if(false == list.get(sorusayisi).getFotografliSoru()){

                    text_soru.setVisibility(View.VISIBLE);
                    fotograf_soru.setVisibility(View.GONE);

                }
                else{

                    text_soru.setVisibility(View.GONE);
                    fotograf_soru.setVisibility(View.VISIBLE);
                    fotograf_soru.setImageResource(getResources().getIdentifier(list.get(sorusayisi).getImageSoru(),"drawable",getPackageName()));

                }
            }
        });
    }

    public void playAnim(View view, int value, String data){

        view.animate().alpha(value).scaleX(value).scaleY(value).setDuration(500).setStartDelay(100)
                .setInterpolator(new DecelerateInterpolator()).setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

                Deneme_sinav_ekrani deneme_sinav_ekrani = new Deneme_sinav_ekrani();
                deneme_sinav_ekrani.dogrucevapsecenek(list,sorusayisi);

                if(value==0 && count < 5){
                    String secenek="Boş Bırak";
                    if(count==0){

                        secenek = list.get(sorusayisi).getCevapA();

                    }
                    else if(count==1){

                        secenek = list.get(sorusayisi).getCevapB();

                    }
                    else if(count==2){

                        secenek = list.get(sorusayisi).getCevapC();

                    }
                    else if(count==3){

                        secenek = list.get(sorusayisi).getCevapD();

                    }
                    else if(count==4){

                        secenek = list.get(sorusayisi).getCevapE();

                    }

                    playAnim(radioGroup.getChildAt(count),0,secenek);
                    count++;
                }
            }

            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onAnimationEnd(Animator animation) {

                ilerigerisinirlandirici(sorusayisi);
                button_sonucgoster.setEnabled(false);
                ((TextView)view).setText(data);
                if(value==0){
                    try{
                        ((TextView)view).setText(data);
                    }
                    catch (ClassCastException ex){
                        ((RadioButton)view).setText(data);

                    }
                    view.setTag(data);

                    playAnim(view,1,data);
                    enableOption(true);
                }
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void checkAnswer(Button selectedOption){///button olabilir

        enableOption(false);


        if(sorusayisi+1 ==list.size()){

            button_sonucgoster.setVisibility(View.VISIBLE);
            button_sonucgoster.setEnabled(true);

            button_sonucgoster.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                     Intent intent = new Intent(Sorucozum_ekrani.this,Sinav_Tarihleri.class);
                     finish();
                     startActivity(intent);

                }
            });
        }

        else {
            button_sonucgoster.setVisibility(View.INVISIBLE);
            button_sonucgoster.setEnabled(false);
        }

        if(selectedOption.getText().equals(list.get(sorusayisi).getDogrucevap())){
            selectedOption.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF2FF637")));
        }
        else{
            selectedOption.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FA6F6F")));
            RadioButton dogruSecenek = (RadioButton) radioGroup.findViewWithTag(list.get(sorusayisi).getDogrucevap());
            dogruSecenek.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF2FF637")));
        }

    }

    @SuppressLint("ResourceAsColor")
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void enableOption(boolean enable){
        for (int i =0; i <5;i++){

            radioGroup.getChildAt(i).setEnabled(enable);

            if(enable){
                radioGroup.getChildAt(i).setBackgroundTintList(ColorStateList.valueOf(R.color.kullanilacak));
            }
        }
    }


    public void ilerigerisinirlandirici(int sorusayisi){

        if (sorusayisi==0&&sorusayisi+1==list.size()){
            button_ileri.setEnabled(false);
            button_geri.setEnabled(false);
        }

        else if (sorusayisi==0){
            button_geri.setEnabled(false);
            button_ileri.setEnabled(true);
            button_geri.setAlpha(1);
        }

        else if (sorusayisi+1==list.size()){
            button_ileri.setEnabled(false);
            button_geri.setEnabled(true);
        }

        else{ button_ileri.setEnabled(true);
            button_geri.setEnabled(true);}
    }

    }

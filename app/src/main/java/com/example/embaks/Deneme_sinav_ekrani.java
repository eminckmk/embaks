package com.example.embaks;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
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

import cn.pedant.SweetAlert.SweetAlertDialog;

public class Deneme_sinav_ekrani extends AppCompatActivity {


    private TextView text_soru;
    private LinearLayout lineer_soru;
    public ImageView fotograf_soru;
    private Button button_ileri, button_geri;
    private Button button_sonucgoster;
    private int count =0;
    public List<SoruModel1> list,list11,list12;
    public int sorusayisi = 0;
    private static RadioGroup radiogrup;
    private static RadioButton a,b,c,d,e;
    private RecyclerView rv_ustsorusayisi;
    ArrayList<String> veriler;
    Adapterr adapter;
    public int aktarilanveri=0;
    public TextView text_soruNumarasi;
    private Toolbar toolbar;
    private TextView toolbar_text;
    private int sinavNumarasi= 0;
    private String listkeyn;
    private int resImg;
    private Context context;
    private LinearLayout linear_soruenust;
    public int toplamDogruSayisi=0;
    public int toplamYanlisSayisi=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deneme_sinav_ekrani);

        text_soru=findViewById(R.id.text_soru);
        lineer_soru = findViewById(R.id.lineer_soru);
        button_ileri=findViewById(R.id.button_ileri);
        button_geri=findViewById(R.id.button_geri);
        button_sonucgoster=findViewById(R.id.button_soruCozumCikis);
        fotograf_soru=findViewById(R.id.fotograf_soru);
        radiogrup=findViewById(R.id.radiogrup);
        a=findViewById(R.id.radioButtona);
        b=findViewById(R.id.radioButtonb);
        c=findViewById(R.id.radioButtonc);
        d=findViewById(R.id.radioButtond);
        e=findViewById(R.id.radioButtone);
        text_soruNumarasi=findViewById(R.id.text_sorusayisi);
        toolbar = findViewById(R.id.toolbar_sinav);
        toolbar_text = findViewById(R.id.toolbar_sinavtarihleri);
       // linear_soruenust=findViewById(R.id.linear_soruenust);


        toolbar.setTitle("");
        toolbar_text.setText("2015 Ekim");
        setSupportActionBar(toolbar);


        sinavNumarasi = ((int) getIntent().getSerializableExtra("sinavNumarasi"));
        sorusayisi= ((int) getIntent().getSerializableExtra("eas"))-1;

        if(sinavNumarasi==1||sinavNumarasi==2||sinavNumarasi==3){
            e.setVisibility(View.GONE);
        }
        else if(sinavNumarasi==1||sinavNumarasi==2||sinavNumarasi==3){
            e.setVisibility(View.VISIBLE);
        }

        rv_ustsorusayisi=findViewById(R.id.rv_ustsorusayisi);
        rv_ustsorusayisi.setHasFixedSize(true);
        rv_ustsorusayisi.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));

        veriler = new ArrayList<>();
        int k;


        adapter = new Adapterr(this,veriler);
        rv_ustsorusayisi.setAdapter(adapter);
        Dataa dataa = new Dataa();


        aktarilanveri = ((int) getIntent().getSerializableExtra("testt"));

        listkeyn ="listkey"+sinavNumarasi;
        list = PrefConfig.readListFromPref(this, listkeyn);


        if(list==null||aktarilanveri==1){
            list = new ArrayList<>(dataa.getData(sinavNumarasi));}


        rv_ustsorusayisi.setClickable(true);


        for(k=0;k<list.size();k++){
            veriler.add(String.valueOf(k+1));
        }

        for (int i =0; i <5;i++){

            radiogrup.getChildAt(i).setOnClickListener(new View.OnClickListener() {
                @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                @Override
                public void onClick(View v) {

                    checkAnswer(((RadioButton)v));
                }
            });
        }


        playAnim(text_soru,0,list.get(sorusayisi).getSoru(),list,sorusayisi,radiogrup,a,b,c,d,e,button_ileri,button_geri,0,fotograf_soru,context);
        button_ileri.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Log.e( "onClick: imgdegeri",String.valueOf(resImg) );

                userSelect(0,sorusayisi,list,a,b,c,d,e);
                rv_ustsorusayisi.smoothScrollToPosition(sorusayisi+1);
                adapter.notifyDataSetChanged();

                button_sonucgoster.setVisibility(View.INVISIBLE);
                button_sonucgoster.setEnabled(false);
                sorusayisi++;

                text_soruNumarasi.setText(String.valueOf(sorusayisi));

                count=0;
                playAnim(text_soru,0,list.get(sorusayisi).getSoru(),list,sorusayisi,radiogrup,a,b,c,d,e,button_ileri,button_geri,0,fotograf_soru,context);

                //selectControl(list,sorusayisi,a,b,c,d);
                ilerigerisinirlandirici(sorusayisi,list,button_ileri,button_geri);



                SharedPreferences mSharedPrefs = getSharedPreferences("KişiselBilgiler",MODE_PRIVATE);
                SharedPreferences.Editor editor = mSharedPrefs.edit();
                editor.putInt("sonkalandeneme"+sinavNumarasi,sorusayisi+1);
                PrefConfig.writeListInPref(getApplicationContext(),list, listkeyn);

                editor.commit();


            }
        });

        button_geri.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {

                rv_ustsorusayisi.smoothScrollToPosition(sorusayisi-1);
                count=0;
                userSelect(0,sorusayisi,list,a,b,c,d,e);

                button_sonucgoster.setVisibility(View.INVISIBLE);
                button_sonucgoster.setEnabled(false);
                button_ileri.setEnabled(true);
                button_ileri.setAlpha(0.7f);
                sorusayisi--;


                text_soruNumarasi.setText(String.valueOf(sorusayisi));


                playAnim(text_soru,0,list.get(sorusayisi).getSoru(),list,sorusayisi,radiogrup,a,b,c,d,e,button_ileri,button_geri,0,fotograf_soru,context);


                ilerigerisinirlandirici(sorusayisi,list,button_ileri,button_geri);



                SharedPreferences mSharedPrefs = getSharedPreferences("KişiselBilgiler",MODE_PRIVATE);
                SharedPreferences.Editor editor = mSharedPrefs.edit();
                editor.putInt("sonkalandeneme"+sinavNumarasi,sorusayisi+1);
                PrefConfig.writeListInPref(getApplicationContext(),list, listkeyn);

                editor.commit();

            }
        });



    }

    public void playAnim(View view, int value, String data, List<SoruModel1> list, int sorusayisi, RadioGroup radioGroup, RadioButton a, RadioButton b, RadioButton c, RadioButton d,RadioButton e,Button button_ileri,Button button_geri,int id,ImageView fotograf_soru,Context context){

        view.animate().alpha(value).scaleX(value).scaleY(value).setDuration(600).setStartDelay(75)
                .setInterpolator(new DecelerateInterpolator()).setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                dogrucevapsecenek(list,sorusayisi);

                try {
                    adapter.notifyDataSetChanged();
                    if(value==0 && count < 6){
                        String secenek="Boş Bırak";
                        if(count==0){

                            secenek = list.get(sorusayisi).getCevapA();

                        }
                        else if(count==1){

                            secenek = list.get(sorusayisi).getCevapB();
                            if(true == list.get(sorusayisi).getFotografliSoru()){

                                playAnim(fotograf_soru,0,String.valueOf(getResources().getIdentifier(list.get(sorusayisi).getImageSoru(),"drawable",getPackageName())),list,sorusayisi,radioGroup,a,b,c,d,e,button_ileri,button_geri,0,fotograf_soru,context);

                            }
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


                        playAnim(radioGroup.getChildAt(count),0,secenek,list,sorusayisi,radioGroup,a,b,c,d,e,button_ileri,button_geri,0,fotograf_soru,context);
                        count++;
                    }
                }

                catch (Exception ea){

                    if(value==0 && count < 6){
                        String secenek="Boş Bırak";
                        if(count==0){

                            secenek = list.get(sorusayisi).getCevapA();
                            if(true == list.get(sorusayisi).getFotografliSoru()){

                                playAnim(fotograf_soru,0,String.valueOf(context.getResources().getIdentifier(list.get(sorusayisi).getImageSoru(),"drawable",context.getPackageName())),list,sorusayisi,radioGroup,a,b,c,d,e,button_ileri,button_geri,0,fotograf_soru,context);

                            }

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




                        playAnim(radioGroup.getChildAt(count),0,secenek,list,sorusayisi,radioGroup,a,b,c,d,e,button_ileri,button_geri,0,fotograf_soru,context);
                        count++;




                    }}
            }

            @Override
            public void onAnimationEnd(Animator animation) {

                fotografliSoruKontorlu(list,sorusayisi,fotograf_soru);
                ilerigerisinirlandirici(sorusayisi,list,button_ileri,button_geri);
                radioGroup.clearCheck();
                selectControl(list,sorusayisi,a,b,c,d,e);

               // ((TextView)view).setText(data);
                if(value==0){
                    try{
                        ((TextView)view).setText(data);
                    }
                    catch (ClassCastException ex){
                      //  ((RadioButton)view).setText(data);
                        ((ImageView)view).setImageResource( Integer.valueOf(data));

                        Log.e( "onAnimat: burdayımemin","burayım emin" );
                    }
                    view.setTag(data);
                    playAnim(view,1,data,list,sorusayisi,radioGroup,a,b,c,d,e,button_ileri,button_geri,0,fotograf_soru,context);


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
    private void checkAnswer(RadioButton selectedOption){///button olabilir



        if(sorusayisi+1 ==list.size()){

            button_sonucgoster.setVisibility(View.VISIBLE);
            button_sonucgoster.setEnabled(true);

            button_sonucgoster.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //editor.putBoolean("sonucs",);
                    // Intent intent = new Intent(MainActivity.this,Sonucekrani.class);
                    // startActivity(intent);

                }
            });
        }

        else {

            button_sonucgoster.setVisibility(View.INVISIBLE);
            button_sonucgoster.setEnabled(false);
        }


        if(selectedOption.getText().equals(list.get(sorusayisi).getDogrucevap())){
            //  score++;
            //selectedOption.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#4CAF50")));
            list.get(sorusayisi).setDogrulukKontrolu(true);

           /* dogrulukListesi.add("Doğru");
            editor.putStringSet("dogrulukListesi",dogrulukListesi);
            editor.commit();*/


            int j =0;
            if(j<sorusayisi){
                j=sorusayisi;
            }


            for(int i=0;i<j;i++){
                //   Log.e( "   "+String.valueOf(i)+"  ", list.get(i).getDogrulukKontrolu().toString());
            }


        }


        else{
            list.get(sorusayisi).setDogrulukKontrolu(false);


          /*  dogrulukListesi.add("Yanlış");
            editor.putStringSet("dogrulukListesi",dogrulukListesi);
            editor.commit();*/

            int j =0;
            if(j<sorusayisi){
                j=sorusayisi;
            }

            for(int i=0;i<j;i++){
                //   Log.e( "   "+String.valueOf(i)+"  ", list.get(i).getDogrulukKontrolu().toString());
            }


        }


    }



    private void userSelect(int nextOrprevious, int sorusayisi, List<SoruModel1> list, RadioButton a, RadioButton b, RadioButton c, RadioButton d,RadioButton e){
        //userSelect((sorusayisi-sorusayisi1),sorusayisi1,list1,a,b,c,d);
        //userSelect(0,test,list1,a,b,c,d);

        if(a.isChecked()){
            list.get(sorusayisi - nextOrprevious).setSecilensecenek(list.get(sorusayisi - nextOrprevious).getCevapA());
            Log.e( "userSelect: .",list.get(sorusayisi-nextOrprevious).getSecilensecenek());
        }
        else if(b.isChecked()){
            list.get(sorusayisi - nextOrprevious).setSecilensecenek(list.get(sorusayisi - nextOrprevious).getCevapB());
            Log.e( "userSelect: .",list.get(sorusayisi-nextOrprevious).getSecilensecenek());
        }
        else if(c.isChecked()){
            list.get(sorusayisi - nextOrprevious).setSecilensecenek(list.get(sorusayisi - nextOrprevious).getCevapC());
            Log.e( "userSelect: .",list.get(sorusayisi-nextOrprevious).getSecilensecenek());
        }
        else if(d.isChecked()){
            list.get(sorusayisi - nextOrprevious).setSecilensecenek(list.get(sorusayisi - nextOrprevious).getCevapD());
            Log.e( "userSelect: .",list.get(sorusayisi-nextOrprevious).getSecilensecenek());
        }
        else if(e.isChecked()){
            list.get(sorusayisi - nextOrprevious).setSecilensecenek(list.get(sorusayisi - nextOrprevious).getCevapE());
            Log.e( "userSelect: .",list.get(sorusayisi-nextOrprevious).getSecilensecenek());
        }
        else{
            list.get(sorusayisi-nextOrprevious).setSecilensecenek(null);
            Log.e( "userSelect: .","bos");
        }
    }

    private void selectControl(List<SoruModel1> list, int sorusayisi, RadioButton a, RadioButton b, RadioButton c, RadioButton d, RadioButton e){

        String secilensecenek = (String) list.get(sorusayisi).getSecilensecenek();
        String cevapA =(String) list.get(sorusayisi).getCevapA();
        String cevapB =(String) list.get(sorusayisi).getCevapB();
        String cevapC =(String) list.get(sorusayisi).getCevapC();
        String cevapD =(String) list.get(sorusayisi).getCevapD();
        String cevapE =(String) list.get(sorusayisi).getCevapE();

        if(cevapA.equals(secilensecenek)){
            a.setChecked(true);
        }
        else if (cevapB.equals(secilensecenek)){
            b.setChecked(true);
        }
        else if (cevapC.equals(secilensecenek)){
            c.setChecked(true);
        }
        else if (cevapD.equals(secilensecenek)){
            d.setChecked(true);
        }
        else if (cevapE.equals(secilensecenek)){
            e.setChecked(true);
        }


    }


    public void secenek(Context mcontext, int sorusayisi1, Adapterr.CardViewT holder){

        Deneme_sinav_ekrani maniActivity = (Deneme_sinav_ekrani) mcontext;

        TextView testtt;
        testtt = (TextView) maniActivity.findViewById(R.id.text_soru);

        RadioGroup radioGroup;
        radioGroup= (RadioGroup) maniActivity.findViewById(R.id.radiogrup);

        Button button_ileri;
        button_ileri = (Button) maniActivity.findViewById(R.id.button_ileri);

        Button button_geri;
        button_geri = (Button) maniActivity.findViewById(R.id.button_geri);

        List<SoruModel1> list1;
        list1=(List<SoruModel1>) maniActivity.list;

        RadioButton a;
        a = (RadioButton) maniActivity.findViewById(R.id.radioButtona);
        RadioButton b;
        b = (RadioButton) maniActivity.findViewById(R.id.radioButtonb);
        RadioButton c;
        c = (RadioButton) maniActivity.findViewById(R.id.radioButtonc);
        RadioButton d;
        d = (RadioButton) maniActivity.findViewById(R.id.radioButtond);
        RadioButton e;
        e = (RadioButton) maniActivity.findViewById(R.id.radioButtone);
        RadioButton bos;
        bos = (RadioButton) maniActivity.findViewById(R.id.bos);

        ImageView fotografli_soru;
        fotografli_soru=(ImageView) maniActivity.findViewById(R.id.fotograf_soru);

        int test=maniActivity.sorusayisi;

        int id = maniActivity.resImg;

        userSelect(0,test,list1,a,b,c,d,e);

        maniActivity.sorusayisi=sorusayisi1;

        TextView text_soruNumarasi;
        text_soruNumarasi=(TextView) maniActivity.findViewById(R.id.text_sorusayisi);
        text_soruNumarasi.setText(String.valueOf(sorusayisi1));


        playAnim(testtt,0,list1.get(sorusayisi1).getSoru(),list1,sorusayisi1,radioGroup,a,b,c,d,e,button_ileri,button_geri,id,fotografli_soru,mcontext);


    }

    public void ilerigerisinirlandirici(int sorusayisi, List<SoruModel1> list, Button button_ileri, Button button_geri){

        if (sorusayisi==0){
            button_geri.setEnabled(false);
            button_ileri.setEnabled(true);
            button_geri.setAlpha(1);
        }

        else if (sorusayisi+1==list.size()){
            button_ileri.setEnabled(false);
            button_geri.setEnabled(true);
        }

        else{
            button_ileri.setEnabled(true);
            button_geri.setEnabled(true);
        }

    }

    public int soruUstIsaretleme(int sorusayisi, Context mContext,int i){

        try{

            Deneme_sinav_ekrani maniActivity = (Deneme_sinav_ekrani) mContext;
            List<SoruModel1> list1;
            list1=(List<SoruModel1>) maniActivity.list;

            if(list1.get(sorusayisi).getSecilensecenek()==null){ i=0;}
            else i=1;

        }catch (Exception e) {

            Deneme_sinav_ekrani maniActivity = (Deneme_sinav_ekrani) mContext;
            List<SoruModel1> list2;
            list2 = list;

        }
        return i;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_error);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case android.R.id.home:
                new SweetAlertDialog(Deneme_sinav_ekrani.this)
                        .setTitleText("Soru Açıklama")
                        .setContentText(list.get(sorusayisi).getDogrucevap())
                        .setConfirmText("Geri Dön")
                        .show();
                return true;

            case R.id.item_kaydetvecik:
                Log.e( "onOptionsItemSelected: ","itemkaydetveçik" );
                SharedPreferences mSharedPrefs = getSharedPreferences("KişiselBilgiler",MODE_PRIVATE);
                SharedPreferences.Editor editor = mSharedPrefs.edit();
                editor.putInt("sonkalandeneme"+sinavNumarasi,sorusayisi+1);
                PrefConfig.writeListInPref(getApplicationContext(),list, listkeyn);

                editor.commit();
                Intent intent = new Intent(Deneme_sinav_ekrani.this,Sinav_Tarihleri.class);
                startActivity(intent);
                return true;

            case R.id.item_sinavibitir:
                for(int i =0;i<100;i++){
                    if(list.get(i).getSecilensecenek()==list.get(i).getDogrucevap()){
                        list.get(i).getDogrulukKontrolu().compareTo(true);
                        toplamDogruSayisi++;
                    }
                    else if(list.get(i).getSecilensecenek()!=list.get(i).getDogrucevap()&&list.get(i).getSecilensecenek()!=null){
                        list.get(i).getDogrulukKontrolu().compareTo(false);
                        toplamYanlisSayisi++;
                    }
                }

                Intent intent2 = new Intent(Deneme_sinav_ekrani.this,SonucGosterme.class);
                intent2.putExtra("toplamdogrusayisi",toplamDogruSayisi);
                intent2.putExtra("toplamyanlissayisi",toplamYanlisSayisi);
                intent2.putExtra("sinavNo",sinavNumarasi);
                finish();
                startActivity(intent2);
                return true;

            default:
                return super.onOptionsItemSelected(item);


    }
}
    public void fotografliSoruKontorlu(List<SoruModel1> list,int sorusayisi,ImageView fotograf_soru){
        if(false == list.get(sorusayisi).getFotografliSoru()){

            fotograf_soru.setVisibility(View.GONE);

        }
        else{

            fotograf_soru.setVisibility(View.VISIBLE);
            //      fotograf_soru.setImageResource(getResources().getIdentifier(list.get(sorusayisi).getImageSoru(),"drawable",getPackageName()));
                         /*   try {
                                playAnim(fotograf_soru, 0, null, list, sorusayisi, radioGroup, a, b, c, d, e, button_ileri, button_geri, 0, fotograf_soru, context);
                            }catch (Exception eas){
                                Log.e( "onAnrt:hatamısss", eas+" ");
                            }*/
        }
    }

    public void dogrucevapsecenek(List<SoruModel1> list,int sorusayisi){

            if (list.get(sorusayisi).getDogrucevap()=="a"){
                list.get(sorusayisi).setDogrucevap(list.get(sorusayisi).getCevapA());
            }
           else  if (list.get(sorusayisi).getDogrucevap()=="b"){
            list.get(sorusayisi).setDogrucevap(list.get(sorusayisi).getCevapB());
            }
            else if (list.get(sorusayisi).getDogrucevap()=="c"){
                list.get(sorusayisi).setDogrucevap(list.get(sorusayisi).getCevapC());
            }
            else if (list.get(sorusayisi).getDogrucevap()=="d"){
                list.get(sorusayisi).setDogrucevap(list.get(sorusayisi).getCevapD());
            }
            else if (list.get(sorusayisi).getDogrucevap()=="e"){
                list.get(sorusayisi).setDogrucevap(list.get(sorusayisi).getCevapE());
            }



    }



}


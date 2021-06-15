package com.example.embaks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;

public class Pdfokuyucu extends AppCompatActivity {

    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfokuyucu);

        Toolbar toolbarTop = (Toolbar) findViewById(R.id.toolbarpdf);
        toolbarTop.setNavigationIcon(R.drawable.ic_geri);
        toolbarTop.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

        int sinavNumarasi = ((int) getIntent().getSerializableExtra("sinavNumarasi"));
        pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset(sinavNumarasi+".pdf")
                .defaultPage(0)
                .enableAnnotationRendering(true)
                .scrollHandle(null)
                .load();
        /*
        .defaultPage(pageNumber)
                .onPageChange(this)
                .enableAnnotationRendering(true)
                .onLoad(this)
                .scrollHandle(new DefaultScrollHandle(this))
                .load();
         */
    }
}

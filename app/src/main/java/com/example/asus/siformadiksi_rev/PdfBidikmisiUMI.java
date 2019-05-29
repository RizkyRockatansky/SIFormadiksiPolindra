package com.example.asus.siformadiksi_rev;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfBidikmisiUMI extends AppCompatActivity {

    PDFView pdfBMUMi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_bidikmisi_umi);

        pdfBMUMi=(PDFView) findViewById(R.id.pdfBMUMi);
        pdfBMUMi.fromAsset("JalurMandiri.pdf").load();

    }
}

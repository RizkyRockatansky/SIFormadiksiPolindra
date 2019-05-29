package com.example.asus.siformadiksi_rev;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfBidikmisiUMII extends AppCompatActivity {
    PDFView PdfBidikmisiUM2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_bidikmisi_umii);
        PdfBidikmisiUM2=(PDFView) findViewById(R.id.pdfBMUM2);
        PdfBidikmisiUM2.fromAsset("pengumuman-bidikmisi-UM-II.pdf").load();
    }
}

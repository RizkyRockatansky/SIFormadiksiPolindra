package com.example.asus.siformadiksi_rev;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfBidikmisiTambahan extends AppCompatActivity {

    PDFView PdfBidikmisiTambahan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_bidikmisi_tambahan);
        PdfBidikmisiTambahan=(PDFView) findViewById(R.id.pdfBMTambahan);
        PdfBidikmisiTambahan.fromAsset("SK-Penerima-Bidikmisi-Tambahan-2018.pdf").load();
    }
}

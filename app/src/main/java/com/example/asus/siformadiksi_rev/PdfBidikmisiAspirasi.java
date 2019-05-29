package com.example.asus.siformadiksi_rev;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfBidikmisiAspirasi extends AppCompatActivity {
    PDFView PdfBidikmisiAspirasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_bidikmisi_aspirasi);
        PdfBidikmisiAspirasi=(PDFView) findViewById(R.id.pdfBMAlokasi);
        PdfBidikmisiAspirasi.fromAsset("Surat-Keputusan-Bidikmisi-Aspirasi-2018.pdf").load();
    }
}

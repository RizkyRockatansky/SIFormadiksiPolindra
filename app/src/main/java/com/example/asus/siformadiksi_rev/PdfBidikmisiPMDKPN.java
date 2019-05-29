package com.example.asus.siformadiksi_rev;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfBidikmisiPMDKPN extends AppCompatActivity {
    PDFView pdfBMPMDK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_bidikmisi_pmdkpn);
        pdfBMPMDK=(PDFView) findViewById(R.id.pdfBMPMDK);
        pdfBMPMDK.fromAsset("BidikmisiPMDKPN.pdf").load();
    }
}

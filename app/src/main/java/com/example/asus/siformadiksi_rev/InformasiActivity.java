package com.example.asus.siformadiksi_rev;

import android.content.Intent;
import android.icu.text.IDNA;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.net.URL;
import android.view.View;

public class InformasiActivity extends AppCompatActivity {
    Button btn_BidikmisiAlokasi,btn_BidikmisiTambahan,btn_JalurMandiri2,btn_BidikmisiPMDK,btn_JalurMandiri1,btn_Penerimaan2019;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi);

        btn_BidikmisiAlokasi =(Button) findViewById(R.id.BidikmisiAlokasi);
        btn_BidikmisiTambahan= (Button) findViewById(R.id.BidikmisiTambahan);
        btn_JalurMandiri1 = (Button)findViewById(R.id.JalurMandiri1);
        btn_JalurMandiri2 = (Button)findViewById(R.id.JalurMandiri2);
        btn_BidikmisiPMDK = (Button)findViewById(R.id.BidikmisiPMDK);
        btn_Penerimaan2019=(Button)findViewById(R.id.penerimaan2019);


        btn_Penerimaan2019.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.polindra.ac.id/news/berita/2019/01/15/281/penerimaan-beasiswa-bidikmisi-tahun-2019.html"));

                startActivity(intent);

            }
        });



        btn_BidikmisiAlokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(InformasiActivity.this,PdfBidikmisiAspirasi.class);
                startActivity(intent1);

            }
        });
        btn_BidikmisiTambahan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(InformasiActivity.this,PdfBidikmisiTambahan.class);
                startActivity(intent2);

            }
        });
        btn_JalurMandiri1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent3=new Intent(InformasiActivity.this,PdfBidikmisiUMI.class);
                startActivity(intent3);
            }
        });
        btn_JalurMandiri2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(InformasiActivity.this,PdfBidikmisiUMII.class);
                startActivity(intent4);

            }
        });
        btn_BidikmisiPMDK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(InformasiActivity.this,PdfBidikmisiPMDKPN.class);
                startActivity(intent5);

            }
        });
    }
}

package com.example.asus.siformadiksi_rev;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MenuActivity extends AppCompatActivity {
    Button btn_Akun, btn_informasi, btn_ListAnggota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn_Akun = (Button) findViewById(R.id.akun);
        btn_informasi = (Button) findViewById(R.id.Informasi);
        btn_ListAnggota = (Button) findViewById(R.id.ListView);

        btn_Akun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,MainActivity.class);
                startActivity(intent);            }
        });
        btn_informasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MenuActivity.this,InformasiActivity.class);
                startActivity(intent1);
            }
        });
        btn_ListAnggota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MenuActivity.this,ListAnggotaActivity.class);
                startActivity(intent2);
            }
        });
    }


    }






package com.example.chickslice2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Homepage extends AppCompatActivity {
private ImageButton btnscan,profile,btnAyamBroiler,btnriwayat,home,pencarian,btnAyamKampung,btnBebek,btnItik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_homepage);

        profile=findViewById(R.id.profile);
        btnscan=findViewById(R.id.btnscan);
        btnriwayat=findViewById(R.id.btnriwayat);
        home=findViewById(R.id.home);
        btnAyamBroiler=findViewById(R.id.btnAyamBroiler);
        pencarian=findViewById(R.id.pencarian);
        btnAyamKampung=findViewById(R.id.btnAyamKampung);
        btnBebek=findViewById(R.id.btnBebek);
        btnItik=findViewById(R.id.btnItik);


        btnAyamKampung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Katalog2.class));
            }
        });
        btnBebek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Katalog3.class));
            }
        });
        btnItik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Katalog4.class));
            }
        });
        pencarian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Search_Bar.class));
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Homepage.class));
            }
        });
        btnAyamBroiler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Katalog.class));
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Profile.class));
            }
        });

        btnscan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Scan.class));
        }
    });

        btnriwayat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Riwayat.class));
            }
        });
    }
}
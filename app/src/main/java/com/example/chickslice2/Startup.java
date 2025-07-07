package com.example.chickslice2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class Startup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup); // gunakan layout yang kamu buat

        // Splash screen selama 2 detik lalu pindah ke Login
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(Startup.this, Login.class);
            startActivity(intent);
            finish(); // agar tidak bisa kembali ke startup saat tekan tombol back
        }, 2000); // 2000 ms = 2 detik
    }
}

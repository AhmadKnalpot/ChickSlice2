package com.example.chickslice2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Profile extends AppCompatActivity {
private ImageButton btnback,btn_logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        btnback=findViewById(R.id.btnback);
        btn_logout=findViewById(R.id.btn_logout);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Homepage.class));
            }
        });
        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // (Opsional) Hapus data login di SharedPreferences di sini jika kamu menyimpan login
                // SharedPreferences prefs = getSharedPreferences("user_session", MODE_PRIVATE);
                // prefs.edit().clear().apply();

                // Arahkan ke LoginActivity
                Intent intent = new Intent(Profile.this, Login.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK); // hapus semua aktivitas sebelumnya
                startActivity(intent);
                finish();
            }
        });
    }
}
package com.example.chickslice2;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Search_Bar extends AppCompatActivity {

    private EditText searchInput;
    private ImageView iconSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchbar); // Ganti dengan nama file XML kamu jika berbeda

        // Inisialisasi view
        searchInput = findViewById(R.id.search_input);
        iconSearch = findViewById(R.id.icon_search);

        // Aksi ketika mengetik
        searchInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Tidak digunakan
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Lakukan filter pencarian di sini
                String query = s.toString();
                Toast.makeText(Search_Bar.this, "Mencari: " + query, Toast.LENGTH_SHORT).show();
                // TODO: Tambahkan logika filter atau pencarian data
            }

            @Override
            public void afterTextChanged(Editable s) {
                // Tidak digunakan
            }
        });

        // Aksi jika ikon search diklik
        iconSearch.setOnClickListener(v -> {
            String query = searchInput.getText().toString().trim();
            if (!query.isEmpty()) {
                // Proses pencarian
                Toast.makeText(Search_Bar.this, "Cari produk: " + query, Toast.LENGTH_SHORT).show();
                // TODO: Panggil API / filter list
            } else {
                Toast.makeText(Search_Bar.this, "Ketik nama produk terlebih dahulu", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

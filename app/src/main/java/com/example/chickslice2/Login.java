    package com.example.chickslice2;

    import android.content.Intent;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.Toast;

    import androidx.activity.EdgeToEdge;
    import androidx.appcompat.app.AppCompatActivity;
    import androidx.core.graphics.Insets;
    import androidx.core.view.ViewCompat;
    import androidx.core.view.WindowInsetsCompat;

    import com.android.volley.Request;
    import com.android.volley.RequestQueue;
    import com.android.volley.Response;
    import com.android.volley.VolleyError;
    import com.android.volley.toolbox.StringRequest;
    import com.android.volley.toolbox.Volley;

    public class Login extends AppCompatActivity {
        private EditText etUsername,etPassword;
        private Button btnLogin,btnRegister;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);

            etUsername=findViewById(R.id.etUsername);
            etPassword=findViewById(R.id.etPassword);
            btnRegister=findViewById(R.id.btnRegister);
            btnLogin=findViewById(R.id.btnLogin);

            btnLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String username=etUsername.getText().toString();
                    String password=etPassword.getText().toString();

                    if(!(username.isEmpty() || password.isEmpty())){
                        RequestQueue requestQueue= Volley.newRequestQueue(getApplicationContext());

                        StringRequest stringRequest=new StringRequest(Request.Method.GET, Db_Contract.urlLogin + "?username=" + username + "&password=" + password, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {

                                if(response.contains("Selamat Datang")){
                                    Toast.makeText(getApplicationContext(),"Login Berhasil",Toast.LENGTH_SHORT).show();

                                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                                }else {
                                    Toast.makeText(getApplicationContext(),"Login Gagal",Toast.LENGTH_SHORT).show();
                                }
                            }
                        }, new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),error.toString(),Toast.LENGTH_SHORT ).show();
                            }
                        });
                        requestQueue.add(stringRequest);
                    }else{
                        Toast.makeText(getApplicationContext(),"Ada Data yang Masih Kosong",Toast.LENGTH_SHORT).show();
                    }
                }
            });
            btnRegister.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(getApplicationContext(),Register.class));
                }
            });
        }
    }
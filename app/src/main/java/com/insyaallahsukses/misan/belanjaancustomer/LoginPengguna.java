package com.insyaallahsukses.misan.belanjaancustomer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginPengguna extends AppCompatActivity {

    Button btn_daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_pengguna);
        btn_daftar = (Button) findViewById(R.id.btn_daftar);
        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent daftar_pengguna = new Intent(LoginPengguna.this, DaftarPengguna.class);
                startActivity(daftar_pengguna);
                finish();
            }
        });
    }
}

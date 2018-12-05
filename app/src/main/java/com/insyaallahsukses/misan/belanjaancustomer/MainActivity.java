package com.insyaallahsukses.misan.belanjaancustomer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_daftar_pengguna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_daftar_pengguna = (Button) findViewById(R.id.btn_daftar_pengguna);
        btn_daftar_pengguna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent daftar_pengguna = new Intent(MainActivity.this, DaftarPengguna.class);
                startActivity(daftar_pengguna);
                finish();
            }
        });
    }
}

package com.example.atvddlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class Activity2 extends AppCompatActivity {
    TextView nome;
    TextView email;
    TextView numero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        nome = (TextView)findViewById(R.id.textView8);
        email = (TextView)findViewById(R.id.textView10);
        numero = (TextView)findViewById(R.id.textView9);

        String nomeValue = (String) getIntent().getExtras().get("nome");
        String emailValue = (String) getIntent().getExtras().get("email");
        String numeroValue = (String) getIntent().getExtras().get("numero");

        nome.setText(nomeValue);
        email.setText(emailValue);
        numero.setText(numeroValue);

    }
}
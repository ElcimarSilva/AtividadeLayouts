package com.example.atvddlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText Nome;
    private EditText email;
    private EditText numero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nome = findViewById(R.id.editTextTextPersonName);
        numero = findViewById(R.id.editTextTextEmailAddress);
        email = findViewById(R.id.editTextPhone);
        Button enviar = (Button) findViewById((R.id.button2));
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomeValue = Nome.getText().toString();
                String emailValue = email.getText().toString();
                String numeroValue = numero.getText().toString();
                Intent intent = new Intent (MainActivity.this, Activity2.class);

                intent.putExtra("nome", nomeValue);
                intent.putExtra("email", emailValue);
                intent.putExtra("numero", numeroValue);
                startActivity(intent);
                finish();
            }
        });

        }
    }

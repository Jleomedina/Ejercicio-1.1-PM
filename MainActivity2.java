package com.example.tarea1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        double resultado = getIntent().getDoubleExtra("RESULTADO", 0.0);

        TextView txtResultado = findViewById(R.id.txtResultado);
        txtResultado.setText("Resultado: " + resultado);

        Button btnVolver = findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Volver a la pantalla principal
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
                finish(); // Cierra la actividad actual para que no se pueda volver atrás
            }
        });
    }
}

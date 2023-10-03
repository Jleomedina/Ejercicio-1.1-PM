package com.example.tarea1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextNum1 = findViewById(R.id.editTextNum1);
        final EditText editTextNum2 = findViewById(R.id.editTextNum2);

        Button btnSumar = findViewById(R.id.btnSumar);
        Button btnRestar = findViewById(R.id.btnRestar);
        Button btnMultiplicar = findViewById(R.id.btnMultiplicar);
        Button btnDividir = findViewById(R.id.btnDividir);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(editTextNum1.getText().toString());
                double num2 = Double.parseDouble(editTextNum2.getText().toString());
                double resultado = num1 + num2;
                abrirSegundaActividad(resultado);
            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(editTextNum1.getText().toString());
                double num2 = Double.parseDouble(editTextNum2.getText().toString());
                double resultado = num1 - num2;
                abrirSegundaActividad(resultado);
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(editTextNum1.getText().toString());
                double num2 = Double.parseDouble(editTextNum2.getText().toString());
                double resultado = num1 * num2;
                abrirSegundaActividad(resultado);
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(editTextNum1.getText().toString());
                double num2 = Double.parseDouble(editTextNum2.getText().toString());
                double resultado = num1 / num2;
                abrirSegundaActividad(resultado);
            }
        });
    }

    private void abrirSegundaActividad(double resultado) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("RESULTADO", resultado);
        startActivity(intent);
    }
}

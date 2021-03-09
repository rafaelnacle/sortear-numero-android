package com.example.sortearnumero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortear(View v) {
        EditText minimo = findViewById(R.id.min);
        EditText maximo = findViewById(R.id.max);
        TextView resultado = findViewById(R.id.resultado);

        String minString = String.valueOf(minimo.getText());
        String maxString = String.valueOf(maximo.getText());

        int min = Integer.parseInt(minString);
        int max = Integer.parseInt(maxString);

        if (max > min) {
            Random rand = new Random();
            int gerar = rand.nextInt((max - min) + 1) + min;
            String gerarNumero = String.valueOf(gerar);
            resultado.setText(gerarNumero);
        }
    }
}
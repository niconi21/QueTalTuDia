package com.example.quetaltudia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnEnviar;
    RadioGroup rg_respuestas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEnviar = (Button) findViewById(R.id.btn_enviar);
        rg_respuestas = (RadioGroup) findViewById(R.id.rg_opciones);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int radioButtonID = rg_respuestas.getCheckedRadioButtonId();
                View radioButton = rg_respuestas.findViewById(radioButtonID);
                int index = rg_respuestas.indexOfChild(radioButton);

                Intent intent = new Intent(MainActivity.this, MensajeActivity.class);
                intent.putExtra("opcion", index);
                startActivity(intent);
            }
        });
    }
}
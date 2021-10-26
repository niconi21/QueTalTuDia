package com.example.quetaltudia;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.TextView;
import android.widget.Toast;


public class MensajeActivity extends AppCompatActivity {
    private TextView txtRespuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje);
        Bundle b = this.getIntent().getExtras();
        int opcion = b.getInt("opcion");
        actualizarMensaje(opcion);
    }

    private void actualizarMensaje(int opcion){
        txtRespuesta = (TextView) findViewById(R.id.txt_respuesta);
        switch (opcion){
            case 0:
                this.txtRespuesta.setText(R.string.resp_excelente);
                break;
            case 1:
                this.txtRespuesta.setText(R.string.resp_buena);
                break;
            case 2:
                this.txtRespuesta.setText(R.string.resp_malo);
                break;
            case 3:
                this.txtRespuesta.setText(R.string.resp_pesimo);
                break;
            default:
                this.txtRespuesta.setText(R.string.sin_respuesta);

        }

    }

}
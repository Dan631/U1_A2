package com.daniel.u1_a2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.time.LocalDateTime;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Otorgamos texto al boton por medio de findViewById
        final TextView tv = findViewById(R.id.btn1);
        final Button btn1 = findViewById(R.id.btn1);
//        Modificamos el texto del Boton
        tv.setText("Boton");
//        Inicializamos findViewById para el textview y poder visualizar el texto deseado
        final TextView t1 = findViewById(R.id.tx_1);
//        Iniciamos la actividad del boton
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Indicamos el texto que aparecera al presionar el boton
                t1.setText(LocalDateTime.now().toString());
            }
        });
    }
}

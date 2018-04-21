package com.tallerdeandroid.ecogarden_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;
    private CardView cardViewTrucosConcejos;
    private CardView cardViewTareasBasicas;
    private CardView cardViewDisenoJardines;
    private CardView cardViewCalendario;
    private CardView cardViewConstruirJardin;
    private CardView cardViewFichasPlantas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = (TextView) findViewById(R.id.textViewPresentacion);
        cardViewTrucosConcejos = (CardView) findViewById(R.id.cardView_trucos_concejos);
        cardViewTareasBasicas = (CardView) findViewById(R.id.cardView_tareas_basicas);
        cardViewDisenoJardines = (CardView) findViewById(R.id.cardView_diseno);
        cardViewCalendario = (CardView) findViewById(R.id.cardView_calendario);
        cardViewConstruirJardin = (CardView) findViewById(R.id.cardView_construir_jardin);
        cardViewFichasPlantas = (CardView) findViewById(R.id.cardView_fichas_plantas);



        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null){
            String dato = bundle.getString("DATO");
            if (!dato.isEmpty()){
                textView.setText("Bienvenido, "+dato+ ".\n¿Como te podemos ayudar?");
            }else{
                textView.setText("Hola! Anonimo.\n¿Como te podemos ayudar?");
            }
        }

        cardViewTrucosConcejos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, Trucos_concejos.class);
                startActivity(intent);
            }
        });

        cardViewTareasBasicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, Tareas_basicas.class);
                startActivity(intent);
            }
        });

        cardViewDisenoJardines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, Diseno_jardines.class);
                startActivity(intent);
            }
        });

        cardViewCalendario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, Calendario_jardines.class);
                startActivity(intent);
            }
        });

        cardViewConstruirJardin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, Construir_jardin.class);
                startActivity(intent);
            }
        });

        cardViewFichasPlantas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, Fichas_plantas.class);
                startActivity(intent);
            }
        });


    }
}

package com.tallerdeandroid.ecogarden_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Tareas_basicas extends AppCompatActivity {

    private ImageButton buttonHomeTree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tareas_basicas);

        buttonHomeTree = (ImageButton) findViewById(R.id.button_home_tree);

        buttonHomeTree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tareas_basicas.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}

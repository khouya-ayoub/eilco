package com.exemple.td3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ChoixActivity extends AppCompatActivity {

    private Context context = this;

    private Button btn_exo_1;
    private Button btn_exo_2;
    private Button btn_exo_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix);

        btn_exo_1 = findViewById(R.id.btn_exo1);
        btn_exo_2 = findViewById(R.id.btn_exo2);
        btn_exo_3 = findViewById(R.id.btn_exo3);

        btn_exo_1.setOnClickListener(v -> {
            Intent intent = new Intent(context, ExoUnActivity.class);
            startActivity(intent);
        });

        btn_exo_2.setOnClickListener(v -> {
            Intent intent = new Intent(context, ExoDeuxActivity.class);
            startActivity(intent);
        });

        btn_exo_3.setOnClickListener(v -> {
            Intent intent = new Intent(context, ExoTroisActivity.class);
            startActivity(intent);
        });

    }
}
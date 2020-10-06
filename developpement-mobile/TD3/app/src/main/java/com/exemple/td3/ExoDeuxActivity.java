package com.exemple.td3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ExoDeuxActivity extends AppCompatActivity {

    private Button btn_exo_2;

    private TextView txv_1;
    private TextView txv_2;

    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exo_deux);

        btn_exo_2 = findViewById(R.id.btn_exo2_lance);

        txv_1 = findViewById(R.id.txv_1_exo2);
        txv_2 = findViewById(R.id.txv_2_exo2);


        btn_exo_2.setOnClickListener(v -> {
            int de_1 = lanceAleatoire();
            int de_2 = lanceAleatoire();

            txv_1.setText(String.valueOf(de_1));
            txv_2.setText(String.valueOf(de_2));

            Toast.makeText(context, "Deux dés lancés", Toast.LENGTH_SHORT).show();
        });
    }

    private int lanceAleatoire() {
        return (int) (Math.random() * 6) + 1;
    }
}
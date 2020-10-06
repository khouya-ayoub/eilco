package com.exemple.td3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ExoTroisActivity extends AppCompatActivity {

    private Context context = this;

    private EditText editText_exo_3;
    private TextView textView_exo_3;

    private Button btn_exo_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exo_trois);

        btn_exo_3 = findViewById(R.id.btn_exo3_lance);

        textView_exo_3 = findViewById(R.id.txv_1_exo3);

        editText_exo_3 = findViewById(R.id.edx_1_exo3);

        btn_exo_3.setOnClickListener(v -> {
            int nb_faces = Integer.parseInt(String.valueOf(editText_exo_3.getText()));
            textView_exo_3.setText(String.valueOf(lanceAleatoire(nb_faces)));
        });

    }

    private int lanceAleatoire(int nb) {
        return (int) (Math.random() * nb) + 1;
    }
}
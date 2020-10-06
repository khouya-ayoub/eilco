package com.exemple.td3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ExoUnActivity extends AppCompatActivity {

    // Déclaration des l'objet Button et TextView dans la vue
    TextView afficher_resultat;
    Button lancer_de;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exo_un);

        afficher_resultat = findViewById(R.id.afficher_resultat);
        lancer_de = findViewById(R.id.lancer_de);

        // Ajoute de l'interface de on click listner
        lancer_de.setOnClickListener(v -> {
            Toast.makeText(ExoUnActivity.this, "Dé lancé", Toast.LENGTH_SHORT).show();
            int resultat = lanceAleatoire();
            this.afficher_resultat.setText(String.valueOf(resultat));
        });

    }

    // Fonction lancement aleatoire de dé reteourne un nombre alteatoire entre 1 et 6
    private int lanceAleatoire() {
        return (int) (Math.random() * 6) + 1;
    }


}
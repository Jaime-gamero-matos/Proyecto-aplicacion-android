package com.rememberingPS2.proyecto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class sanAndreasActivity extends AppCompatActivity {
    Button botonGta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_san_andreas);
        botonGta = findViewById(R.id.btnGta);
        botonGta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent cambioDePantallaMenuGta = new Intent(sanAndreasActivity.this, gta_menu.class);
                startActivity(cambioDePantallaMenuGta);

            }
        });
    }
}
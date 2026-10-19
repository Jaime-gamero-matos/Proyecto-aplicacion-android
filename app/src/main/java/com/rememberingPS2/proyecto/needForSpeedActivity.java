package com.rememberingPS2.proyecto;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class needForSpeedActivity extends AppCompatActivity {

    RadioButton bmw;
    RadioButton lancer;
    RadioButton viper;

    RadioGroup rdGroupCoches;
    CheckBox checkOcultarMenu;
    ConstraintLayout vistaNFS;
    CardView menuSeleccionCoche;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_need_for_speed);
        vistaNFS = findViewById(R.id.vistaNfs);
        bmw = findViewById(R.id.rbBmw);
        lancer = findViewById(R.id.rbLancer);
        viper = findViewById(R.id.rbViper);
        checkOcultarMenu = findViewById(R.id.cbOcultarMenu);
        menuSeleccionCoche = findViewById(R.id.cardSeleccion);
        rdGroupCoches = findViewById(R.id.rgCoches);

        checkOcultarMenu.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    menuSeleccionCoche.setVisibility(CardView.GONE);
                } else {
                    menuSeleccionCoche.setVisibility(CardView.VISIBLE);
                }
            }
        });

        rdGroupCoches.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull RadioGroup group, int checkedId) {

                if (checkedId == R.id.rbBmw) {
                    vistaNFS.setBackgroundResource(R.drawable.bmw);
                } else if (checkedId == R.id.rbLancer) {
                    vistaNFS.setBackgroundResource(R.drawable.lancer);
                } else if (checkedId == R.id.rbViper) {
                    vistaNFS.setBackgroundResource(R.drawable.viper);
                }

            }
        });



    }
}
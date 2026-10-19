package com.rememberingPS2.proyecto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.List;

public class adaptadorSpinnerSeleccionPersonaje extends ArrayAdapter<String> {
    Context contexto;
    int miLayout;
    List<String> personajes;

    public adaptadorSpinnerSeleccionPersonaje(@NonNull Context context, int resource, @NonNull List<String> objects) {
        super(context, resource, objects);
        this.contexto = context;
        this.miLayout = resource;
        this.personajes = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String personajeActual = personajes.get(position);
        View v = LayoutInflater.from(contexto).inflate(miLayout, parent,false);
        ConstraintLayout layout = (ConstraintLayout) v.findViewById(R.id.tekkenLayout);

        return v;
    }

}

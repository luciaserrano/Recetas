package com.example.tablayout_cocina.SegundoEjercicio;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tablayout_cocina.R;

public class RecetaDelDia_F extends Fragment {
    Button boton;
    TextView texto1,texto2,texto3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.receta_del_dia_fragments,container,false);
        boton = root.findViewById(R.id.boton_receta);
        texto1 = root.findViewById(R.id.texto1R);
        texto2 = root.findViewById(R.id.texto2R);
        texto3 = root.findViewById(R.id.texto3R);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto1.setTextColor(Color.LTGRAY);
                texto2.setTextColor(Color.LTGRAY);
                texto3.setTextColor(Color.LTGRAY);
                boton.setBackgroundColor(Color.GRAY);
                boton.setTextColor(Color.BLACK);
            }
        });
    }
}

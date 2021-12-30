package com.example.tablayout_cocina.PrimerEjercicio;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tablayout_cocina.PrimerEjercicio.Receta;
import com.example.tablayout_cocina.R;

public class Receta_Entrada extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla1_layout);
        Bundle b = getIntent().getExtras();
        if(b!=null){
            Receta receta = b.getParcelable("objeto"); //etiqueta que sirve para pasarlo al bundle, guardado aquí
            ImageView image1 = findViewById(R.id.imagen1);
            TextView texto1 = findViewById(R.id.texto1);
            TextView texto2 = findViewById(R.id.texto2);
            ImageView image2 = findViewById(R.id.imagen2);
            TextView texto3 = findViewById(R.id.texto3);
            TextView texto4 = findViewById(R.id.texto4);
            ImageView image3 = findViewById(R.id.imagen3);
            TextView texto5 = findViewById(R.id.texto5);
            TextView texto6 = findViewById(R.id.texto6);
            TextView texto7 = findViewById(R.id.texto7);
            TextView texto8 = findViewById(R.id.texto8);
            TextView texto9 = findViewById(R.id.texto9);


            texto1.setText(receta.getTexto1());
            texto2.setText(receta.getTexto2());
            texto3.setText(receta.getTexto3());
            texto4.setText(receta.getTexto4());
            texto5.setText(receta.getTexto5());
            texto6.setText(receta.getTexto6());
            texto7.setText(receta.getTexto7());
            texto8.setText(receta.getTexto8());
            texto9.setText(receta.getTexto9());

            //Obtener los drawables
            int contenido = getResources().getIdentifier(receta.getImagen1(), "drawable", getPackageName());
            image1.setImageResource(contenido);
            int url1 = getResources().getIdentifier(receta.getImagen2(), "drawable", getPackageName());
            image2.setImageResource(url1);
            int url2 = getResources().getIdentifier(receta.getImagen3(), "drawable", getPackageName());
            image3.setImageResource(url2);
        }
    }
}

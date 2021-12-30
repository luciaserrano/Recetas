package com.example.tablayout_cocina.PrimerEjercicio;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tablayout_cocina.PrimerEjercicio.Receta;
import com.example.tablayout_cocina.PrimerEjercicio.Receta_Entrada;
import com.example.tablayout_cocina.R;

import java.util.ArrayList;

public class RecetaAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final ArrayList<Receta> datos;
    private Context context;

    public RecetaAdapter(ArrayList<Receta> datos, Context context) {
        this.datos = datos;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.pantalla1_layout_holder,parent,false);
        return new RecetaHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        RecetaHolder holderR = (RecetaHolder) holder;
        final Receta receta = datos.get(position);
        String imagenR = receta.getImagenP();
        String textoR = receta.getTextoP();
        holderR.setTexto(imagenR,textoR);

        holderR.imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, Receta_Entrada.class);
                i.putExtra("objeto",receta); // Para pasarles todos los archivos guardados en objeto, en la clase Receta_Entrada
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }
    class RecetaHolder extends RecyclerView.ViewHolder{
        private final ImageView imagen;
        private final TextView texto;

        RecetaHolder(View view){
            super(view);
            texto = view.findViewById(R.id.texto_P);
            imagen = view.findViewById(R.id.image_P);
        }

        void setTexto (String img, String t){
            int imgR = context.getResources().getIdentifier(img,"drawable",context.getPackageName()); //Coger el recurso de la imagen
            imagen.setImageResource(imgR);
            texto.setText(t);
        }
    }
}

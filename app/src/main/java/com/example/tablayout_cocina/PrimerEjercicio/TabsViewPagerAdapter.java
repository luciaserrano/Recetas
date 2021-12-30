package com.example.tablayout_cocina.PrimerEjercicio;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.tablayout_cocina.PrimerEjercicio.FragmentReceta;
import com.example.tablayout_cocina.PrimerEjercicio.Receta;

import java.util.ArrayList;

public class TabsViewPagerAdapter extends FragmentStateAdapter {
    private  final ArrayList<Receta> recetaLista;

    public TabsViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle, ArrayList<Receta> recetaLista) {
        super(fragmentManager, lifecycle);
        this.recetaLista = recetaLista;
    }

    //Para que cada receta vaya en una posicion del tab
    @NonNull
    @Override
    public Fragment createFragment(int position) {

        ArrayList<Receta> minilista0;
        ArrayList<Receta> minilista1;
        ArrayList<Receta> minilista2;
        ArrayList<Receta> minilista3;
        switch (position) {
            case 0:
                minilista0 = new ArrayList();
                for (int i = 0; i < recetaLista.size(); i++) {
                    Receta receta = recetaLista.get(i);
                    if (receta.getTipo() == 0) {
                        minilista0.add(receta);
                    }
                }
                FragmentReceta fragment = FragmentReceta.newInstance(minilista0);
                return fragment;

            case 1:
                minilista1 = new ArrayList();
                for (int i = 0; i < recetaLista.size(); i++) {
                    Receta receta = recetaLista.get(i);
                    if(receta.getTipo()==1){
                        minilista1.add(receta);
                    }
                }
                FragmentReceta fragment1 = FragmentReceta.newInstance(minilista1);
                return fragment1;
            case 2:
                minilista2 = new ArrayList();
                for (int i = 0; i < recetaLista.size(); i++) {
                    Receta receta = recetaLista.get(i);
                    if(receta.getTipo()==2){
                        minilista2.add(receta);
                    }
                }
                FragmentReceta fragment2 = FragmentReceta.newInstance(minilista2);
                return fragment2;
            case 3:
                minilista3 = new ArrayList();
                for (int i = 0; i < recetaLista.size(); i++) {
                    Receta receta = recetaLista.get(i);
                    if(receta.getTipo()==3){
                        minilista3.add(receta);
                    }
                }
                FragmentReceta fragment3 = FragmentReceta.newInstance(minilista3);
                return fragment3;


        }
        Receta receta = recetaLista.get(position);
        FragmentReceta fragment = FragmentReceta.newInstance(recetaLista);
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 4; //Para que solo se creen 4 tab
    }
}

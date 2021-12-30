package com.example.tablayout_cocina.PrimerEjercicio;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tablayout_cocina.R;

import java.util.ArrayList;

public class FragmentReceta extends Fragment {
    RecyclerView recycler;

    private static final String PASAR = "pasar";

    private ArrayList<Receta> recetaArrayList;

    public static FragmentReceta newInstance(ArrayList<Receta> receta) { //Datos al Fragment
        Bundle args = new Bundle();
        args.putParcelableArrayList(PASAR, receta);//Objeto parcelable

        FragmentReceta fl = new FragmentReceta();
        fl.setArguments(args);
        return fl;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.lista,container,false);
        recycler = root.findViewById(R.id.recycler);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(),1);
        recycler.setLayoutManager(layoutManager);
        RecetaAdapter adapter = new RecetaAdapter(recetaArrayList,getActivity());
        recycler.setAdapter(adapter);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null){
            if (arguments.containsKey(PASAR)) {
                recetaArrayList = arguments.getParcelableArrayList(PASAR);
            }
        }
    }
}

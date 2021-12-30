package com.example.tablayout_cocina.SegundoEjercicio;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class TabsViewPagerAdapter2 extends FragmentStateAdapter {
    public TabsViewPagerAdapter2(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position==0){
            return  new RecetaDelDia_F();
        } else if(position==1){
            return  new Contacto_F();
        } else if(position==2){
            return  new PaginaWeb_F();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}

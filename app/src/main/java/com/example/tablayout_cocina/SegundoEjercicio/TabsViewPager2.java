package com.example.tablayout_cocina.SegundoEjercicio;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;

import com.example.tablayout_cocina.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class TabsViewPager2 extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabs_pager_2);

        TabsViewPagerAdapter2 adapter2 = new TabsViewPagerAdapter2(this);
        ViewPager2 viewPager2 = findViewById(R.id.viewpager2);
        viewPager2.setAdapter(adapter2);

        //configuracion toolbar
        Toolbar toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        setTitle("Más Información");

        //BOton de atrás
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        TabLayout tabLayout2= findViewById(R.id.tablayout2);
        TabLayoutMediator mediator2 = new TabLayoutMediator(tabLayout2, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                if(position==0){
                    tab.setText("Receta del día");
                } else if(position==1){
                    tab.setText("Contacto");
                } else if(position==2){
                    tab.setText("Página Web");
                }
            }
        });
        mediator2.attach();


    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //codigo para la pulsacion del botón atrás
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}

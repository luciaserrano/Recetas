package com.example.tablayout_cocina.SegundoEjercicio;

import android.content.Intent;
import android.net.Uri;
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

public class Contacto_F extends Fragment {
    Button b_tel,enviar;
    TextView nombre,apellidos,correo,tel;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.contacto_fragment, container, false);
        b_tel = root.findViewById(R.id.b_phone);
        enviar = root.findViewById(R.id.enviar);
        nombre = root.findViewById(R.id.nombre);
        apellidos = root.findViewById(R.id.apellidos);
        correo = root.findViewById(R.id.correo);
        tel = root.findViewById(R.id.tel);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        b_tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:697246008"));
                startActivity(intent);
            }
        });

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nm = nombre.getText().toString();
                String apll = apellidos.getText().toString();
                String email = correo.getText().toString();
                String telef = tel.getText().toString();
                if(nm.isEmpty()){
                    nombre.setError("Campo vacio");
                }else if(apll.isEmpty()){
                    apellidos.setError("Campo vacio");
                } else if(email.isEmpty()){
                    correo.setError("Campo vacio");
                } else if(telef.isEmpty()) {
                    tel.setError("Campo vacio");
                } else {
                    String[] addresses = {"lucia.serrano@escuelaestech.es"}; //email del receptor
                    String text = "Nombre: " +nm+  "\nApellidos: " +apll+ "\nTeléfono: " +telef;
                    Intent intent = new Intent(Intent.ACTION_SENDTO);
                    intent.setData(Uri.parse("mailto:")); //Si no se pone no abrirá email
                    intent.putExtra(Intent.EXTRA_EMAIL, addresses); // Suceso para que la informacion vaya al email receptor.
                    intent.putExtra(Intent.EXTRA_TEXT, text);   // Suceso para que todo el String de texto se visualice en el apartado texto de email
                    startActivity(intent);

                }

            }
        });
    }
}

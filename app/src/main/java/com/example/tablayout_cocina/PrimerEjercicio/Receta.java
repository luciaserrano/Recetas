package com.example.tablayout_cocina.PrimerEjercicio;

import android.os.Parcel;
import android.os.Parcelable;

public class Receta implements Parcelable {
    private  String imagenP,textoP,imagen1,texto1,texto2,texto3,texto4,texto5,imagen2,texto6,texto7,imagen3,texto8,texto9;
    int tipo;

    public Receta(String imagenP, String textoP, String imagen1, String texto1, String texto2, String texto3, String texto4, String texto5, String imagen2, String texto6, String texto7, String imagen3, String texto8, String texto9, int tipo) {
        this.imagenP = imagenP;
        this.textoP = textoP;
        this.imagen1 = imagen1;
        this.texto1 = texto1;
        this.texto2 = texto2;
        this.texto3 = texto3;
        this.texto4 = texto4;
        this.texto5 = texto5;
        this.imagen2 = imagen2;
        this.texto6 = texto6;
        this.texto7 = texto7;
        this.imagen3 = imagen3;
        this.texto8 = texto8;
        this.texto9 = texto9;
        this.tipo = tipo;
    }

    protected Receta(Parcel in) {
        tipo = in.readInt();
        imagenP = in.readString();
        textoP = in.readString();
        imagen1 = in.readString();
        texto1 = in.readString();
        texto2 = in.readString();
        texto3 = in.readString();
        texto4 = in.readString();
        texto5 = in.readString();
        imagen2 = in.readString();
        texto6 = in.readString();
        texto7 = in.readString();
        imagen3 = in.readString();
        texto8 = in.readString();
        texto9 = in.readString();
    }

    public static final Creator<Receta> CREATOR = new Creator<Receta>() {
        @Override
        public Receta createFromParcel(Parcel in) {
            return new Receta(in);
        }

        @Override
        public Receta[] newArray(int size) {
            return new Receta[size];
        }
    };

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getImagenP() {
        return imagenP;
    }

    public void setImagenP(String imagenP) {
        this.imagenP = imagenP;
    }

    public String getTextoP() {
        return textoP;
    }

    public void setTextoP(String textoP) {
        this.textoP = textoP;
    }

    public String getImagen1() {
        return imagen1;
    }

    public void setImagen1(String imagen1) {
        this.imagen1 = imagen1;
    }

    public String getTexto1() {
        return texto1;
    }

    public void setTexto1(String texto1) {
        this.texto1 = texto1;
    }

    public String getTexto2() {
        return texto2;
    }

    public void setTexto2(String texto2) {
        this.texto2 = texto2;
    }

    public String getTexto3() {
        return texto3;
    }

    public void setTexto3(String texto3) {
        this.texto3 = texto3;
    }

    public String getTexto4() {
        return texto4;
    }

    public void setTexto4(String texto4) {
        this.texto4 = texto4;
    }

    public String getTexto5() {
        return texto5;
    }

    public void setTexto5(String texto5) {
        this.texto5 = texto5;
    }

    public String getImagen2() {
        return imagen2;
    }

    public void setImagen2(String imagen2) {
        this.imagen2 = imagen2;
    }

    public String getTexto6() {
        return texto6;
    }

    public void setTexto6(String texto6) {
        this.texto6 = texto6;
    }

    public String getTexto7() {
        return texto7;
    }

    public void setTexto7(String texto7) {
        this.texto7 = texto7;
    }

    public String getImagen3() {
        return imagen3;
    }

    public void setImagen3(String imagen3) {
        this.imagen3 = imagen3;
    }

    public String getTexto8() {
        return texto8;
    }

    public void setTexto8(String texto8) {
        this.texto8 = texto8;
    }

    public String getTexto9() {
        return texto9;
    }

    public void setTexto9(String texto9) {
        this.texto9 = texto9;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(tipo);
        dest.writeString(imagenP);
        dest.writeString(textoP);
        dest.writeString(imagen1);
        dest.writeString(texto1);
        dest.writeString(texto2);
        dest.writeString(texto3);
        dest.writeString(texto4);
        dest.writeString(texto5);
        dest.writeString(imagen2);
        dest.writeString(texto6);
        dest.writeString(texto7);
        dest.writeString(imagen3);
        dest.writeString(texto8);
        dest.writeString(texto9);
    }
}

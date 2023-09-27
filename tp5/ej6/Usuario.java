package ej6;

import java.util.ArrayList;

public class Usuario {
    private ArrayList<String> categorias_preferentes = new ArrayList<>();
    private ArrayList<String> temas_preferentes = new ArrayList<>();
    private Noticia noticia; // noticia de interes que el usuario recibe por su suscripcion al foro

    public Usuario(ArrayList<String> categorias_preferentes, ArrayList<String> temas_preferentes, Noticia noticia) {
        this.categorias_preferentes = categorias_preferentes;
        this.temas_preferentes = temas_preferentes;
        this.noticia = noticia;
    }

    public ArrayList<String> getCategorias_preferentes() {
        return categorias_preferentes;
    }

    public ArrayList<String> getTemas_preferentes() {
        return temas_preferentes;
    }

    public void recibeNoticia(Noticia n) {
        noticia = n;
    }
}

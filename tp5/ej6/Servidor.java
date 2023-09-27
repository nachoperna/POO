package ej6;

import java.util.ArrayList;

public class Servidor {
    private ArrayList<Noticia> noticias = new ArrayList<>();
    private ArrayList<Usuario> suscripciones = new ArrayList<>();

    public Servidor() {

    }

    public void addNoticia(Noticia n) {
        for (Usuario usuario : suscripciones) { // para todos los usuarios suscriptos al servidor de noticias
            if (usuario.getCategorias_preferentes().contains(n.getClasificacion())) { // si la categoria de la noticia
                                                                                      // esta dentro de los intereses
                                                                                      // del usuario
                for (int i = 0; i < usuario.getTemas_preferentes().size(); i++) {
                    // error: cuerpo es de tipo Object
                    if (n.getCuerpo().contains(usuario.getTemas_preferentes().get(i))) { // si el cuerpo de la noticia
                                                                                         // contiene temas de la
                                                                                         // preferencia del usuario
                        usuario.recibeNoticia(n);
                    }
                }
            }
        }
        noticias.add(n);
    }

    public void addSuscriptor(Usuario usuario) {
        suscripciones.add(usuario);
    }

    public ArrayList<Noticia> busqueda(Comparable<Noticia> comp) {
        ArrayList<Noticia> aux = new ArrayList<>();
        for (Noticia noticia : noticias) {
            if (comp.compareTo(noticia) > 0) {
                aux.add(noticia);
            }
        }
        return aux;
    }
}

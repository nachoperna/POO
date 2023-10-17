package ej1;

import java.util.List;

public class ListaVinculada implements SimpleList {
    private class Nodo {
        Object value;
        Nodo sig = null;

        public Nodo(Object value) {
            this.value = value;
        }
    }

    private Nodo primero;
    private Nodo ultimo;

    public ListaVinculada() {
        primero = null;
        ultimo = null;
    }

    @Override
    public int size() {
        int i = 0;
        Nodo aux = primero;
        while (aux != null) {
            i++;
            aux = aux.sig;
        }
        return i;
    }

    @Override
    public boolean isEmpty() {
        return primero == null;
    }

    @Override
    public boolean contains(Object element) {
        Nodo aux = primero;
        while (aux != null) {
            if (aux.value.equals(element)) {
                return true;
            }
            aux = aux.sig;
        }
        return false;
    }

    @Override
    public void add(Object element) {
        Nodo aux = new Nodo(element);
        ultimo.sig = aux;
        ultimo = aux;
    }

    @Override
    public Object add(int index, Object element) {
        Nodo aux = new Nodo(element); // nuevo nodo a insertar
        Nodo aux2 = primero;
        if (index == 0) {
            aux2 = primero.sig;
            primero = aux2;
        } else {
            int i = 0;
            while ((i != index) && (aux2.sig != null)) {
                i++;
                aux2 = aux2.sig;
            }
            if (i == index) {
                if (aux2.sig == ultimo) {
                    aux.sig = aux;
                    ultimo = aux;
                } else {
                    aux.sig = aux2.sig; // nuevo nodo guarda los elementos posteriores corriendo el que estaba en index
                    aux2 = aux;
                }
            } else {
                return null;
            }
        }
        return element;
    }

    @Override
    public Object set(int index, Object element) {
        Nodo aux = new Nodo(element); // nuevo nodo a insertar
        Nodo aux2 = primero;
        if (index == 0) {
            aux.sig = primero.sig;
            return primero;
        } else {
            int i = 0;
            while ((i != index) && (aux2 != null)) {
                i++;
                aux2 = aux2.sig;
            }
            if (i == index) {
                if (aux2.sig == ultimo) {
                    aux.sig = ultimo.sig;
                    ultimo = aux;
                } else {
                    aux.sig = aux2.sig.sig; // nuevo nodo guarda los elementos posteriores a index
                    Nodo aux4 = aux2.sig;
                    aux2.sig = aux;
                    return aux4;
                }
            }
        }
        return null;
    }

    @Override
    public boolean remove(Object element) {
        Nodo aux = primero;
        if (primero.value.equals(element)) {
            aux = primero.sig;
            primero = aux;
        } else {
            while ((aux.sig != null) && (!aux.sig.value.equals(element))) {
                aux = aux.sig;
            }
            if (aux.sig != null) {
                Nodo aux2 = aux.sig.sig;
                if (aux.sig == ultimo) {
                    aux.sig = null;
                    ultimo = aux;
                } else {
                    aux.sig = aux2;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public Object remove(int index) {
        Nodo aux = primero;
        if (index == 0) {
            aux = aux.sig;
            return primero;
        } else {
            int i = 0;
            while ((aux.sig != null) && (i != index)) {
                i++;
                aux = aux.sig;
            }
            if (i == index) {
                Nodo aux2 = aux.sig.sig;
                Nodo eliminado = aux.sig;
                if (aux.sig == ultimo) {
                    aux.sig = null;
                    ultimo = aux;
                } else {
                    aux.sig = aux2;
                }
                aux.sig = aux2;
                return eliminado;
            }
        }
        return null;
    }

    @Override
    public void addAll(List otherList) {
        for (Object element : otherList) {
            this.add(element);
        }
    }

    @Override
    public void clear() {
        primero = null;
        ultimo = null;
    }

    @Override
    public Object get(int index) {
        Nodo aux = primero;
        int i = 0;
        while ((i != index) && (aux != null)) {
            i++;
            aux = aux.sig;
        }
        if (i == index) {
            return aux;
        }
        return null;
    }

    @Override
    public int indexOf(Object element) {
        Nodo aux = primero;
        int i = 0;
        while ((aux != null) && (!aux.value.equals(element))) {
            i++;
            aux = aux.sig;
        }
        if (aux != null) {
            return i;
        }
        return -1;
    }

}

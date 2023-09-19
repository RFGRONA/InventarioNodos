package eedd.inventarionodos;

public class Nodo {

    Producto producto;
    Nodo siguiente; //puntero enlace 

    public Nodo(Producto pro) {
        this.producto = pro;
        this.siguiente = null;
    }
}

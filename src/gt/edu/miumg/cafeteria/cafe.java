package gt.edu.miumg.cafeteria;

import java.util.ArrayList;
import java.util.List;

public abstract class cafe {
    private String nombre;
    private String tamaño;
    private double precio;
    private List<Ingrediente> ingredientes;

    public cafe(String nombre, String tamaño, double precio) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
        this.ingredientes = new ArrayList<>();
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public double getPrecio() {
        return precio;
    }

    public abstract void preparar();
    public abstract void servir();
}

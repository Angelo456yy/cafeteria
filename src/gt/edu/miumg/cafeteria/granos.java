package gt.edu.miumg.cafeteria;

public class granos implements Ingrediente {
    private String tipo;
    private double cantidad;

    public granos(String tipo, double cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return "Granos de " + tipo;
    }

    @Override
    public double obtenerCantidad() {
        return cantidad;
    }
}
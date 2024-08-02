package gt.edu.miumg.cafeteria;

public class EspressoItaliano extends cafe {
    private int intensidad;

    public EspressoItaliano(String nombre, String tamaño, double precio, int intensidad) {
        super(nombre, tamaño, precio);
        this.intensidad = intensidad;
    }

    public int getIntensidad() {
        return intensidad;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Espresso Italiano con intensidad " + intensidad);
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo Espresso Italiano " + getNombre());
    }
}
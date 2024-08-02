package gt.edu.miumg.cafeteria;

public class CafeColombiano extends cafe {
    private String tipoGrano;

    public CafeColombiano(String nombre, String tamaño, double precio, String tipoGrano) {
        super(nombre, tamaño, precio);
        this.tipoGrano = tipoGrano;
    }

    public String getTipoGrano() {
        return tipoGrano;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Cafe Colombiano con grano " + tipoGrano);
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo Cafe Colombiano " + getNombre());
    }
}
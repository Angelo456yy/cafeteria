package gt.edu.miumg.cafeteria;

public class Equipo {
    private String tipo;
    private String estado;

    public Equipo(String tipo, String estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void encender() {
        System.out.println(tipo + " está encendido");
    }

    public void apagar() {
        System.out.println(tipo + " está apagado");
    }

    public void reparar() {
        System.out.println(tipo + " está siendo reparado");
    }
}
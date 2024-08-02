package gt.edu.miumg.cafeteria;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private String nombre;
    private String direccion;
    private List<Empleado> empleados;
    private List<Ingrediente> ingredientes;
    private List<Equipo> equipos;
    private List<cafe> especialidades;

    public Sucursal(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.empleados = new ArrayList<>();
        this.ingredientes = new ArrayList<>();
        this.equipos = new ArrayList<>();
        this.especialidades = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void agregarIngrediente(Ingrediente i) {
        ingredientes.add(i);
    }

    public void agregarEquipo(Equipo e) {
        equipos.add(e);
    }

    public void agregarEspecialidad(cafe c) {
        especialidades.add(c);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public List<cafe> getEspecialidades() {
        return especialidades;
    }
}

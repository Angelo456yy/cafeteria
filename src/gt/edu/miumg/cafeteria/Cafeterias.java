package gt.edu.miumg.cafeteria;

public class Cafeterias {
    public static void main(String[] args) {
        // Crear sucursales
        Sucursal bogota = new Sucursal("Sucursal Bogotá", "Calle Falsa 123");
        Sucursal roma = new Sucursal("Sucursal Roma", "Via Imaginaria 456");

        // Crear especialidades de café
        cafe cafeColombiano = new CafeColombiano("Cafe Colombiano", "Grande", 2.50, "Arabica");
        cafe espressoItaliano = new EspressoItaliano("Espresso Italiano", "Pequeño", 1.50, 5);

        // Agregar especialidades a las sucursales
        bogota.agregarEspecialidad(cafeColombiano);
        roma.agregarEspecialidad(espressoItaliano);

        // Crear empleados
        Empleado juan = new Empleado("Juan Perez", "Barista", 1000);
        Empleado mario = new Empleado("Mario Rossi", "Barista", 1200);

        // Agregar empleados a las sucursales
        bogota.agregarEmpleado(juan);
        roma.agregarEmpleado(mario);

        // Crear ingredientes
        Ingrediente granosArabica = new granos("Arabica", 500);
        Ingrediente agua = new Agua(1000);
        Ingrediente lecheDeslactosada = new Leche("Deslactosada", 300);

        // Agregar ingredientes a las sucursales
        bogota.agregarIngrediente(granosArabica);
        bogota.agregarIngrediente(agua);
        bogota.agregarIngrediente(lecheDeslactosada);

        // Crear equipos
        Equipo maquinaCafe = new Equipo("Máquina de Café", "Operativa");

        // Agregar equipos a las sucursales
        bogota.agregarEquipo(maquinaCafe);

        // Preparar y servir café
        cafeColombiano.agregarIngrediente(granosArabica);
        cafeColombiano.agregarIngrediente(agua);
        cafeColombiano.agregarIngrediente(lecheDeslactosada);

        cafeColombiano.preparar();
        cafeColombiano.servir();
    }
}
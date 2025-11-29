public class Cafe {
    // Atributos
    private String nombre;
    private String region;
    private float precioPorKilo;
    private float cantidadEnKilos;

    // Constructor
    public Cafe(String nombre, String region, float precioPorKilo, float cantidadEnKilos) {
        this.nombre = nombre;
        this.region = region;
        this.precioPorKilo = precioPorKilo;
        this.cantidadEnKilos = cantidadEnKilos;
    }

    // Método para mostrar información del café
    public void mostrarInformacion() {
        System.out.println("=== Información del Café ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Región: " + region);
        System.out.println("Precio por kilo: $" + precioPorKilo + " COP");
        System.out.println("Cantidad disponible: " + cantidadEnKilos + " kg");
        System.out.println();
    }

    // Método para calcular el precio total
    public float calcularPrecioTotal() {
        return precioPorKilo * cantidadEnKilos;
    }

    // Método para actualizar la cantidad disponible
    public void actualizarCantidad(float nuevaCantidad) {
        this.cantidadEnKilos = nuevaCantidad;
        System.out.println("Cantidad actualizada a: " + nuevaCantidad + " kg");
    }

    // Método para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método para obtener la región
    public String getRegion() {
        return region;
    }

    // Método para obtener el precio por kilo
    public float getPrecioPorKilo() {
        return precioPorKilo;
    }

    // Método para obtener la cantidad en kilos
    public float getCantidadEnKilos() {
        return cantidadEnKilos;
    }

    // Método para aplicar descuento al precio por kilo
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) {
            System.out.println("Error: El porcentaje debe estar entre 0 y 100.");
            return;
        }
        float descuento = (float) (precioPorKilo * porcentaje / 100);
        precioPorKilo = precioPorKilo - descuento;
        System.out.println("Descuento aplicado: " + porcentaje + "%");
        System.out.println("Nuevo precio por kilo: $" + precioPorKilo + " COP");
    }
}

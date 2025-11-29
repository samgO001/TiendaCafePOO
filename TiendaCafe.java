public class TiendaCafe {
    public static void main(String[] args) {
        // Crear instancias de la clase Cafe con datos de diferentes regiones de Colombia
        Cafe cafe1 = new Cafe("Café de Nariño", "Nariño", 18500, 50);
        Cafe cafe2 = new Cafe("Café de Antioquia", "Antioquia", 17000, 75);
        Cafe cafe3 = new Cafe("Café del Huila", "Huila", 16500, 60);

        System.out.println("========================================");
        System.out.println("    TIENDA DE CAFÉ COLOMBIANO - POO");
        System.out.println("========================================\n");

        // Mostrar información de cada café
        System.out.println("1. INFORMACIÓN DE CAFÉS DISPONIBLES:");
        System.out.println("-------------------------------------");
        cafe1.mostrarInformacion();
        cafe2.mostrarInformacion();
        cafe3.mostrarInformacion();

        // Calcular y mostrar el precio total de cada café
        System.out.println("2. PRECIO TOTAL POR CAFÉ:");
        System.out.println("-------------------------------------");
        System.out.println(cafe1.getNombre() + " - Precio Total: $" + cafe1.calcularPrecioTotal() + " COP");
        System.out.println(cafe2.getNombre() + " - Precio Total: $" + cafe2.calcularPrecioTotal() + " COP");
        System.out.println(cafe3.getNombre() + " - Precio Total: $" + cafe3.calcularPrecioTotal() + " COP");
        System.out.println();

        // Actualizar la cantidad de uno de los cafés
        System.out.println("3. ACTUALIZACIÓN DE CANTIDAD:");
        System.out.println("-------------------------------------");
        System.out.println("Actualizando cantidad de " + cafe1.getNombre() + "...");
        cafe1.actualizarCantidad(35);
        System.out.println();

        // Mostrar la información actualizada
        System.out.println("4. INFORMACIÓN ACTUALIZADA:");
        System.out.println("-------------------------------------");
        cafe1.mostrarInformacion();
        System.out.println("Nuevo precio total de " + cafe1.getNombre() + ": $" + cafe1.calcularPrecioTotal() + " COP");
    }
}

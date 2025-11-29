package src.main.java.app;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Clase que representa un café de especialidad.
 * Atributos: origen, temperatura, tamaño, precio, intensidad, fechaTostado.
 */
public class CafeEspecialidad {
    
    // Atributos private
    private String origen;
    private double temperatura;
    private int tamanio; // en ml
    private BigDecimal precio;
    private int intensidad; // 1-10
    private LocalDate fechaTostado;
    
    /**
     * Constructor vacío - Constructor por defecto.
     * Inicializa con valores por defecto razonables.
     */
    public CafeEspecialidad() {
        this.origen = "Desconocido";
        this.temperatura = 85.0;
        this.tamanio = 250;
        this.precio = BigDecimal.valueOf(5000);
        this.intensidad = 5;
        this.fechaTostado = LocalDate.of(2024, 1, 1);
    }
    
    /**
     * Constructor con parámetros.
     * Recibe los 6 atributos y los asigna usando los setters para reutilizar validaciones.
     */
    public CafeEspecialidad(String origen, double temperatura, int tamanio, 
                            BigDecimal precio, int intensidad, LocalDate fechaTostado) {
        setOrigen(origen);
        setTemperatura(temperatura);
        setTamanio(tamanio);
        setPrecio(precio);
        setIntensidad(intensidad);
        setFechaTostado(fechaTostado);
    }
    
    // Getters y Setters con validaciones
    
    public String getOrigen() {
        return origen;
    }
    
    public void setOrigen(String origen) {
        if (origen == null || origen.trim().isEmpty()) {
            throw new IllegalArgumentException("El origen no puede ser nulo o vacío");
        }
        this.origen = origen;
    }
    
    public double getTemperatura() {
        return temperatura;
    }
    
    public void setTemperatura(double temperatura) {
        if (temperatura < 40 || temperatura > 100) {
            throw new IllegalArgumentException("La temperatura debe estar entre 40°C y 100°C");
        }
        this.temperatura = temperatura;
    }
    
    public int getTamanio() {
        return tamanio;
    }
    
    public void setTamanio(int tamanio) {
        if (tamanio <= 0 || tamanio > 1000) {
            throw new IllegalArgumentException("El tamaño debe estar entre 1 y 1000 ml");
        }
        this.tamanio = tamanio;
    }
    
    public BigDecimal getPrecio() {
        return precio;
    }
    
    public void setPrecio(BigDecimal precio) {
        if (precio == null || precio.compareTo(BigDecimal.ZERO) <= 0 || 
            precio.compareTo(BigDecimal.valueOf(10000)) >= 0) {
            throw new IllegalArgumentException("El precio debe estar entre 0 y 10,000");
        }
        this.precio = precio;
    }
    
    public int getIntensidad() {
        return intensidad;
    }
    
    public void setIntensidad(int intensidad) {
        if (intensidad < 1 || intensidad > 10) {
            throw new IllegalArgumentException("La intensidad debe estar entre 1 y 10");
        }
        this.intensidad = intensidad;
    }
    
    public LocalDate getFechaTostado() {
        return fechaTostado;
    }
    
    public void setFechaTostado(LocalDate fechaTostado) {
        if (fechaTostado == null || fechaTostado.isAfter(LocalDate.now()) || 
            fechaTostado.isBefore(LocalDate.of(2010, 1, 1))) {
            throw new IllegalArgumentException("La fecha de tostado debe estar entre 2010 y hoy");
        }
        this.fechaTostado = fechaTostado;
    }
    
    /**
     * Devuelve una representación en string legible del café.
     */
    @Override
    public String toString() {
        return "CafeEspecialidad{" +
                "origen='" + origen + '\'' +
                ", temperatura=" + temperatura + "°C" +
                ", tamanio=" + tamanio + "ml" +
                ", precio=" + precio +
                ", intensidad=" + intensidad + "/10" +
                ", fechaTostado=" + fechaTostado +
                '}';
    }
}

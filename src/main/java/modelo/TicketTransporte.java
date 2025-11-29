package modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Clase que representa un ticket de transporte urbano.
 * Atributos: línea, origen, destino, precio, fecha, horaSalida.
 */
public class TicketTransporte {
    
    // Atributos private
    private String linea;
    private String origen;
    private String destino;
    private BigDecimal precio;
    private LocalDate fecha;
    private LocalTime horaSalida;
    
    /**
     * Constructor vacío - Constructor por defecto.
     * Inicializa con valores por defecto razonables.
     */
    public TicketTransporte() {
        this.linea = "Línea desconocida";
        this.origen = "Estación central";
        this.destino = "Destino desconocido";
        this.precio = BigDecimal.valueOf(2500);
        this.fecha = LocalDate.now();
        this.horaSalida = LocalTime.of(8, 0);
    }
    
    /**
     * Constructor con parámetros.
     * Recibe los 6 atributos y los asigna usando los setters para reutilizar validaciones.
     */
    public TicketTransporte(String linea, String origen, String destino, 
                           BigDecimal precio, LocalDate fecha, LocalTime horaSalida) {
        setLinea(linea);
        setOrigen(origen);
        setDestino(destino);
        setPrecio(precio);
        setFecha(fecha);
        setHoraSalida(horaSalida);
    }
    
    // Getters y Setters con validaciones
    
    public String getLinea() {
        return linea;
    }
    
    public void setLinea(String linea) {
        if (linea == null || linea.trim().isEmpty()) {
            throw new IllegalArgumentException("La línea no puede ser nula o vacía");
        }
        this.linea = linea;
    }
    
    public String getOrigen() {
        return origen;
    }
    
    public void setOrigen(String origen) {
        if (origen == null || origen.trim().isEmpty()) {
            throw new IllegalArgumentException("El origen no puede ser nulo o vacío");
        }
        this.origen = origen;
    }
    
    public String getDestino() {
        return destino;
    }
    
    public void setDestino(String destino) {
        if (destino == null || destino.trim().isEmpty()) {
            throw new IllegalArgumentException("El destino no puede ser nulo o vacío");
        }
        this.destino = destino;
    }
    
    public BigDecimal getPrecio() {
        return precio;
    }
    
    public void setPrecio(BigDecimal precio) {
        if (precio == null || precio.compareTo(BigDecimal.ZERO) <= 0 || 
            precio.compareTo(BigDecimal.valueOf(50000)) >= 0) {
            throw new IllegalArgumentException("El precio debe estar entre 0 y 50,000");
        }
        this.precio = precio;
    }
    
    public LocalDate getFecha() {
        return fecha;
    }
    
    public void setFecha(LocalDate fecha) {
        if (fecha == null || fecha.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha no puede ser nula o futura");
        }
        this.fecha = fecha;
    }
    
    public LocalTime getHoraSalida() {
        return horaSalida;
    }
    
    public void setHoraSalida(LocalTime horaSalida) {
        if (horaSalida == null) {
            throw new IllegalArgumentException("La hora de salida no puede ser nula");
        }
        this.horaSalida = horaSalida;
    }
    
    /**
     * Devuelve una representación en string legible del ticket.
     */
    @Override
    public String toString() {
        return "TicketTransporte{" +
                "linea='" + linea + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", precio=" + precio +
                ", fecha=" + fecha +
                ", horaSalida=" + horaSalida +
                '}';
    }
}

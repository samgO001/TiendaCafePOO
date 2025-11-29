package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un perfil de red social.
 * Atributos: alias, numeroSeguidores, numeroSiguiendo, fotoPerfil, biografia, fechaRegistro.
 */
public class PerfilRedSocial {
    
    // Atributos private
    private String alias;
    private long numeroSeguidores;
    private long numeroSiguiendo;
    private String fotoPerfil; // URL o ruta de la foto
    private String biografia;
    private LocalDate fechaRegistro;
    
    /**
     * Constructor vacío - Constructor por defecto.
     * Inicializa con valores por defecto razonables.
     */
    public PerfilRedSocial() {
        this.alias = "usuario_default";
        this.numeroSeguidores = 0;
        this.numeroSiguiendo = 0;
        this.fotoPerfil = "https://example.com/default_photo.jpg";
        this.biografia = "Sin biografía";
        this.fechaRegistro = LocalDate.now();
    }
    
    /**
     * Constructor con parámetros.
     * Recibe los 6 atributos y los asigna usando los setters para reutilizar validaciones.
     */
    public PerfilRedSocial(String alias, long numeroSeguidores, long numeroSiguiendo,
                          String fotoPerfil, String biografia, LocalDate fechaRegistro) {
        setAlias(alias);
        setNumeroSeguidores(numeroSeguidores);
        setNumeroSiguiendo(numeroSiguiendo);
        setFotoPerfil(fotoPerfil);
        setBiografia(biografia);
        setFechaRegistro(fechaRegistro);
    }
    
    // Getters y Setters con validaciones
    
    public String getAlias() {
        return alias;
    }
    
    public void setAlias(String alias) {
        if (alias == null || alias.trim().isEmpty() || alias.length() < 3) {
            throw new IllegalArgumentException("El alias no puede ser nulo, vacío o menor a 3 caracteres");
        }
        this.alias = alias;
    }
    
    public long getNumeroSeguidores() {
        return numeroSeguidores;
    }
    
    public void setNumeroSeguidores(long numeroSeguidores) {
        if (numeroSeguidores < 0) {
            throw new IllegalArgumentException("El número de seguidores no puede ser negativo");
        }
        this.numeroSeguidores = numeroSeguidores;
    }
    
    public long getNumeroSiguiendo() {
        return numeroSiguiendo;
    }
    
    public void setNumeroSiguiendo(long numeroSiguiendo) {
        if (numeroSiguiendo < 0) {
            throw new IllegalArgumentException("El número de siguiendo no puede ser negativo");
        }
        this.numeroSiguiendo = numeroSiguiendo;
    }
    
    public String getFotoPerfil() {
        return fotoPerfil;
    }
    
    public void setFotoPerfil(String fotoPerfil) {
        if (fotoPerfil == null || fotoPerfil.trim().isEmpty()) {
            throw new IllegalArgumentException("La foto de perfil no puede ser nula o vacía");
        }
        this.fotoPerfil = fotoPerfil;
    }
    
    public String getBiografia() {
        return biografia;
    }
    
    public void setBiografia(String biografia) {
        if (biografia == null || biografia.trim().isEmpty()) {
            throw new IllegalArgumentException("La biografía no puede ser nula o vacía");
        }
        if (biografia.length() > 500) {
            throw new IllegalArgumentException("La biografía no puede exceder 500 caracteres");
        }
        this.biografia = biografia;
    }
    
    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }
    
    public void setFechaRegistro(LocalDate fechaRegistro) {
        if (fechaRegistro == null || fechaRegistro.isAfter(LocalDate.now()) ||
            fechaRegistro.isBefore(LocalDate.of(2005, 1, 1))) {
            throw new IllegalArgumentException("La fecha de registro debe estar entre 2005 y hoy");
        }
        this.fechaRegistro = fechaRegistro;
    }
    
    /**
     * Devuelve una representación en string legible del perfil.
     */
    @Override
    public String toString() {
        return "PerfilRedSocial{" +
                "alias='" + alias + '\'' +
                ", numeroSeguidores=" + numeroSeguidores +
                ", numeroSiguiendo=" + numeroSiguiendo +
                ", fotoPerfil='" + fotoPerfil + '\'' +
                ", biografia='" + biografia + '\'' +
                ", fechaRegistro=" + fechaRegistro +
                '}';
    }
}

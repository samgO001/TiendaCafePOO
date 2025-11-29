import modelo.CafeEspecialidad;
import modelo.TicketTransporte;
import modelo.PerfilRedSocial;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Clase Main para demostrar la creación e impresión de objetos
 * de las tres clases modelo.
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════════════════════╗");
        System.out.println("║        DEMOSTRACIÓN DE CLASES POO - ENTORNO ESPECIALIZADO       ║");
        System.out.println("╚══════════════════════════════════════════════════════════════════╝\n");
        
        // ============================================================
        // 1. CAFÉ DE ESPECIALIDAD
        // ============================================================
        System.out.println("▶ 1. CAFÉ DE ESPECIALIDAD");
        System.out.println("─────────────────────────────────────────────────────────────────\n");
        
        // Constructor vacío
        CafeEspecialidad cafe1 = new CafeEspecialidad();
        System.out.println("Constructor vacío (valores por defecto):");
        System.out.println(cafe1);
        System.out.println();
        
        // Constructor con parámetros
        CafeEspecialidad cafe2 = new CafeEspecialidad(
            "Etiopía Sidamo",
            90.5,
            350,
            BigDecimal.valueOf(7500),
            8,
            LocalDate.of(2024, 10, 15)
        );
        System.out.println("Constructor con parámetros:");
        System.out.println(cafe2);
        System.out.println();
        
        // ============================================================
        // 2. TICKET DE TRANSPORTE
        // ============================================================
        System.out.println("▶ 2. TICKET DE TRANSPORTE");
        System.out.println("─────────────────────────────────────────────────────────────────\n");
        
        // Constructor vacío
        TicketTransporte ticket1 = new TicketTransporte();
        System.out.println("Constructor vacío (valores por defecto):");
        System.out.println(ticket1);
        System.out.println();
        
        // Constructor con parámetros
        TicketTransporte ticket2 = new TicketTransporte(
            "Línea 12 - Centro",
            "Estación Norte",
            "Centro Comercial",
            BigDecimal.valueOf(3200),
            LocalDate.of(2025, 11, 20),
            LocalTime.of(14, 30)
        );
        System.out.println("Constructor con parámetros:");
        System.out.println(ticket2);
        System.out.println();
        
        // ============================================================
        // 3. PERFIL DE RED SOCIAL
        // ============================================================
        System.out.println("▶ 3. PERFIL DE RED SOCIAL");
        System.out.println("─────────────────────────────────────────────────────────────────\n");
        
        // Constructor vacío
        PerfilRedSocial perfil1 = new PerfilRedSocial();
        System.out.println("Constructor vacío (valores por defecto):");
        System.out.println(perfil1);
        System.out.println();
        
        // Constructor con parámetros
        PerfilRedSocial perfil2 = new PerfilRedSocial(
            "java_developer_2024",
            15420,
            843,
            "https://cdn.example.com/profiles/java_dev.jpg",
            "Apasionado por la programación orientada a objetos y el café especializado.",
            LocalDate.of(2020, 3, 10)
        );
        System.out.println("Constructor con parámetros:");
        System.out.println(perfil2);
        System.out.println();
        
        // ============================================================
        // PRUEBAS ADICIONALES DE GETTERS Y SETTERS
        // ============================================================
        System.out.println("▶ PRUEBAS ADICIONALES - GETTERS Y SETTERS");
        System.out.println("─────────────────────────────────────────────────────────────────\n");
        
        System.out.println("Modificando el café2 con setter de intensidad:");
        cafe2.setIntensidad(9);
        System.out.println("Nueva intensidad: " + cafe2.getIntensidad() + "/10");
        System.out.println(cafe2);
        System.out.println();
        
        System.out.println("Modificando el ticket2 con setter de precio:");
        ticket2.setPrecio(BigDecimal.valueOf(3500));
        System.out.println("Nuevo precio: " + ticket2.getPrecio());
        System.out.println(ticket2);
        System.out.println();
        
        System.out.println("Modificando el perfil2 con setter de seguidores:");
        perfil2.setNumeroSeguidores(16000);
        System.out.println("Nuevos seguidores: " + perfil2.getNumeroSeguidores());
        System.out.println(perfil2);
        System.out.println();
        
        System.out.println("╔══════════════════════════════════════════════════════════════════╗");
        System.out.println("║                    FIN DE LA DEMOSTRACIÓN                        ║");
        System.out.println("╚══════════════════════════════════════════════════════════════════╝");
    }
}

# EntornoPOO - Proyecto Programación Orientada a Objetos

## Descripción General

Proyecto Maven que implementa tres clases POO en diferentes dominios, siguiendo principios de encapsulamiento, validación y buenas prácticas de desarrollo.

## Dominios Implementados

### 1. **CafeEspecialidad**
Representa un café de especialidad con los siguientes atributos:
- `origen` (String): País o región de origen del café
- `temperatura` (double): Temperatura de servicio en °C (40-100)
- `tamanio` (int): Tamaño en mililitros (1-1000 ml)
- `precio` (BigDecimal): Precio del café (0-10,000)
- `intensidad` (int): Nivel de intensidad (1-10)
- `fechaTostado` (LocalDate): Fecha del tostado (2010 en adelante, no futura)

### 2. **TicketTransporte**
Representa un ticket de transporte urbano con los siguientes atributos:
- `linea` (String): Identificador de la línea de transporte
- `origen` (String): Estación o punto de partida
- `destino` (String): Estación o punto de llegada
- `precio` (BigDecimal): Precio del pasaje (0-50,000)
- `fecha` (LocalDate): Fecha del viaje (no futura)
- `horaSalida` (LocalTime): Hora de salida del transporte

### 3. **PerfilRedSocial**
Representa un perfil de red social con los siguientes atributos:
- `alias` (String): Nombre de usuario único (mínimo 3 caracteres)
- `numeroSeguidores` (long): Cantidad de seguidores (no negativo)
- `numeroSiguiendo` (long): Cantidad de perfiles siguiendo (no negativo)
- `fotoPerfil` (String): URL o ruta de la foto de perfil
- `biografia` (String): Descripción del perfil (máximo 500 caracteres)
- `fechaRegistro` (LocalDate): Fecha de registro (2005 en adelante, no futura)

## Estructura del Proyecto

```
TiendaCafePOO/
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── Main.java                           # Clase ejecutable con demostración
│   │       └── modelo/
│   │           ├── CafeEspecialidad.java          # Clase modelo
│   │           ├── TicketTransporte.java          # Clase modelo
│   │           └── PerfilRedSocial.java           # Clase modelo
│   └── test/
│       └── java/                                  # Pruebas unitarias (JUnit)
├── pom.xml                                        # Configuración Maven
└── README.md                                      # Este archivo
```

## Especificaciones Implementadas

### Para Cada Clase:

✅ **Atributos**: Mínimo 6 atributos de tipos variados
- String
- Primitivos numéricos (int, double, long)
- Objetos propios (BigDecimal, LocalDate, LocalTime)

✅ **Encapsulamiento**: Todos los atributos `private`

✅ **Constructores**:
- Constructor vacío con valores por defecto razonables
- Constructor con parámetros que asigna usando setters

✅ **Getters y Setters**: Un par por atributo con validaciones

✅ **Validaciones**:
- Validación de valores nulos o vacíos
- Validación de rangos numéricos
- Validación de fechas (no futuras, límites específicos)

✅ **toString()**: Método Override que devuelve representación legible

## Cómo Compilar y Ejecutar

### Usando Maven:

```bash
# Compilar el proyecto
mvn clean compile

# Ejecutar la clase Main
mvn exec:java -Dexec.mainClass="Main"

# Crear archivo JAR ejecutable
mvn clean package
java -jar target/EntornoPOO-1.0.0.jar

# Ejecutar pruebas
mvn test
```

### Compilación manual (javac):

```bash
# Compilar
javac -d bin src/main/java/modelo/*.java src/main/java/Main.java

# Ejecutar
java -cp bin Main
```

## Ejemplo de Uso

```java
// Crear instancias con constructor vacío
CafeEspecialidad cafe1 = new CafeEspecialidad();

// Crear instancias con parámetros
CafeEspecialidad cafe2 = new CafeEspecialidad(
    "Etiopía Sidamo",
    90.5,
    350,
    BigDecimal.valueOf(7500),
    8,
    LocalDate.of(2024, 10, 15)
);

// Usar getters y setters
System.out.println(cafe2.getOrigen());  // "Etiopía Sidamo"
cafe2.setIntensidad(9);
System.out.println(cafe2);
```

## Validaciones Ejemplares

### CafeEspecialidad
| Atributo | Validación |
|----------|-----------|
| origen | No nulo, no vacío |
| temperatura | Entre 40°C y 100°C |
| tamanio | Entre 1 y 1000 ml |
| precio | Mayor que 0, menor que 10,000 |
| intensidad | Entre 1 y 10 |
| fechaTostado | No futura, no anterior a 2010 |

### TicketTransporte
| Atributo | Validación |
|----------|-----------|
| linea | No nulo, no vacío |
| origen | No nulo, no vacío |
| destino | No nulo, no vacío |
| precio | Mayor que 0, menor que 50,000 |
| fecha | No futura |
| horaSalida | No nulo |

### PerfilRedSocial
| Atributo | Validación |
|----------|-----------|
| alias | Mínimo 3 caracteres, no vacío |
| numeroSeguidores | No negativo |
| numeroSiguiendo | No negativo |
| fotoPerfil | No nulo, no vacío |
| biografia | No nula, máximo 500 caracteres |
| fechaRegistro | No futura, no anterior a 2005 |

## Requisitos

- **Java**: JDK 11 o superior
- **Maven**: 3.6.0 o superior (opcional, para usar Maven)

## Autor

Creado como ejercicio de Programación Orientada a Objetos (POO).

## Licencia

Este proyecto es de carácter educativo.

# RESUMEN DEL PROYECTO - ENTORNOPOO

## Proyecto Completado Exitosamente

Se ha implementado un proyecto completo de Programación Orientada a Objetos (POO) en Java con tres dominios diferentes, siguiendo todas las especificaciones requeridas.

---

## Entregables

### 1. Repositorio Git Subido
- URL: `https://github.com/samgO001/TiendaCafePOO.git`
- Branch: `main`
- Estado: Sincronizado con los cambios más recientes

### 2. Estructura Maven
```
src/
├── main/java/
│   ├── Main.java                              ← Clase ejecutable
│   └── modelo/
│       ├── CafeEspecialidad.java              ← Clase 1
│       ├── TicketTransporte.java              ← Clase 2
│       └── PerfilRedSocial.java               ← Clase 3
└── test/java/                                 ← Para pruebas unitarias

pom.xml                                        Configuración Maven
```

### 3. Las Tres Clases POO

#### Clase 1: CafeEspecialidad
Representa un café de especialidad.

Atributos (6):
- `origen`: String - País/región de origen
- `temperatura`: double - En °C
- `tamanio`: int - En mililitros
- `precio`: BigDecimal - Valor monetario
- `intensidad`: int - Escala 1-10
- `fechaTostado`: LocalDate - Fecha del tostado

Características:
- Constructor vacío con valores por defecto
- Constructor con 6 parámetros
- Getters y Setters con validaciones
- Validación de rangos (temperatura, intensidad, precio, fecha)
- Método toString() sobrescrito

---

#### Clase 2: TicketTransporte
Representa un ticket de transporte urbano.

Atributos (6):
- `linea`: String - Identificador de línea
- `origen`: String - Estación de partida
- `destino`: String - Estación de llegada
- `precio`: BigDecimal - Costo del pasaje
- `fecha`: LocalDate - Día del viaje
- `horaSalida`: LocalTime - Hora de salida

Características:
- Constructor vacío con valores por defecto
- Constructor con 6 parámetros
- Getters y Setters con validaciones
- Validación de fechas y precios
- Método toString() sobrescrito

---

#### Clase 3: PerfilRedSocial
Representa un perfil de red social.

Atributos (6):
- `alias`: String - Nombre de usuario único
- `numeroSeguidores`: long - Cantidad de seguidores
- `numeroSiguiendo`: long - Cantidad que sigue
- `fotoPerfil`: String - URL de la foto
- `biografia`: String - Descripción del perfil
- `fechaRegistro`: LocalDate - Fecha de registro

Características:
- Constructor vacío con valores por defecto
- Constructor con 6 parámetros
- Getters y Setters con validaciones
- Validación de longitudes de strings
- Método toString() sobrescrito

---

## Especificaciones Cumplidas

### Encapsulamiento
- Todos los atributos son `private`
- Acceso controlado mediante getters/setters `public`

### Constructores
- Constructor vacío: Inicializa con valores por defecto razonables
- Constructor con parámetros: Recibe todos los atributos (6) y usa setters para validar

### Getters y Setters
- Un par por atributo
- Validaciones específicas en cada setter

### Validaciones Implementadas

| Clase | Atributo | Validación |
|-------|----------|-----------|
| CafeEspecialidad | origen | No nulo, no vacío |
| | temperatura | 40°C - 100°C |
| | tamanio | 1 - 1000 ml |
| | precio | > 0, < 10,000 |
| | intensidad | 1 - 10 |
| | fechaTostado | 2010 en adelante, no futura |
| TicketTransporte | linea, origen, destino | No nulo, no vacío |
| | precio | > 0, < 50,000 |
| | fecha | No futura |
| | horaSalida | No nulo |
| PerfilRedSocial | alias | ≥ 3 caracteres |
| | numeroSeguidores/Siguiendo | ≥ 0 |
| | fotoPerfil | No nulo, no vacío |
| | biografia | ≤ 500 caracteres, no nula |
| | fechaRegistro | 2005 en adelante, no futura |

### Método toString()
- Override de `Object.toString()`
- Devuelve representación legible de todos los atributos

### Tipos de Datos Variados
- String: Campos de texto
- Primitivos numéricos: int, double, long
- BigDecimal: Para precisión monetaria
- LocalDate: Manejo de fechas
- LocalTime: Manejo de horas

---

## Clase Main

Archivo: `src/main/java/Main.java`

Contenido:
- 2 instancias de CafeEspecialidad (una con cada constructor)
- 2 instancias de TicketTransporte (una con cada constructor)
- 2 instancias de PerfilRedSocial (una con cada constructor)
- Pruebas de getters y setters
- Salida formateada y legible con separadores visuales

Salida esperada: Se imprime información de todas las instancias con sus atributos.

---

## Documentación

### Archivos Incluidos:

1. README.md
   - Descripción del proyecto
   - Especificaciones de cada clase
   - Instrucciones de compilación
   - Tabla de validaciones

2. DIAGRAMA_UML.txt
   - Diagrama UML ASCII de todas las clases
   - Muestra atributos y métodos
   - Notas de diseño y validaciones

3. INSTRUCCIONES.md
   - Paso a paso para compilar
   - Comandos para ejecutar
   - Solución de problemas
   - Requisitos previos

4. pom.xml
   - Configuración Maven
   - Dependencias (JUnit)
   - Plugins de compilación y JAR

---

## Cómo Compilar y Ejecutar

### Opción 1: Compilación Manual (Sin Maven)
```powershell
# En el directorio del proyecto
javac -d bin -sourcepath src/main/java src/main/java/Main.java src/main/java/app/*.java
java -cp bin src.main.java.Main
```

### Opción 2: Con Maven (si está instalado)
```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="src.main.java.Main"
```

---

## Commits Git Realizados

1. Commit Principal: Implementar proyecto POO con tres dominios
   - Crea estructura Maven
   - Implementa las 3 clases
   - Crea clase Main con demos
   - Agrega pom.xml y README.md

2. Commit UML: Agregar diagrama UML ASCII

3. Commit Instrucciones: Agregar instrucciones de compilación

4. Commit Correcciones: Reorganizar packages y corregir errores

---

## Conceptos POO Demostrados

- Encapsulamiento: Atributos private, acceso público mediante métodos
- Abstracción: Clases que representan conceptos del mundo real
- Herencia: Estructura base para futuras extensiones
- Polimorfismo: Override de toString()
- Validación: Lógica de negocio en setters
- Tipos Variados: String, primitivos, objetos Java
- Documentación: Comentarios JavaDoc en todo el código

---

## Características Adicionales

- Archivo `.gitignore` para excluir carpeta `bin/`
- Código bien documentado con comentarios
- Validaciones exhaustivas en todos los setters
- Manejo de excepciones `IllegalArgumentException`
- Uso de tipos modernos (LocalDate, LocalTime, BigDecimal)
- Formato visual en salida del programa
- Estructura escalable para agregar más clases

---

## Resumen Final

| Proyecto Maven | Creado |
| 3 Clases POO | Implementadas |
| Atributos (6 por clase) | Completados |
| Constructores (vacío + parámetros) | Implementados |
| Getters/Setters con validaciones | Completos |
| toString() override | Implementado |
| Clase Main con demos | Creada |
| Documentación | Completa |
| Repositorio Git | Sincronizado |
| Compilación exitosa | Verificada |
| Ejecución correcta | Probada |

---

Proyecto completado y subido exitosamente al repositorio GitHub.

**Proyecto completado y subido exitosamente al repositorio GitHub.**

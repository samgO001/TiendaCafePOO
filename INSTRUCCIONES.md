# Instrucciones de Compilación y Ejecución

## Requisitos Previos
- **Java JDK 11 o superior** instalado
- **Git** instalado (opcional, para clonar el repositorio)

## Opción 1: Compilación Manual (javac)

### En Windows (PowerShell):

```powershell
# Navegar a la carpeta del proyecto
cd c:\Users\alexc\TiendaCafePOO

# Crear carpeta para los archivos compilados
New-Item -Type Directory -Path bin -Force

# Compilar todos los archivos Java
javac -d bin -sourcepath src/main/java src/main/java/Main.java src/main/java/modelo/*.java

# Ejecutar el programa
java -cp bin Main
```

### En Linux/Mac:

```bash
# Navegar a la carpeta del proyecto
cd ~/TiendaCafePOO

# Compilar todos los archivos Java
javac -d bin -sourcepath src/main/java src/main/java/Main.java src/main/java/modelo/*.java

# Ejecutar el programa
java -cp bin Main
```

## Opción 2: Compilación y Ejecución con Maven (si Maven está instalado)

```bash
# Compilar el proyecto
mvn clean compile

# Ejecutar la clase Main
mvn exec:java -Dexec.mainClass="Main"

# Crear archivo JAR ejecutable
mvn clean package

# Ejecutar el JAR
java -jar target/EntornoPOO-1.0.0.jar
```

## Verificación de Instalación

### Verificar Java:
```powershell
java -version
```

Debe mostrar Java 11 o superior.

### Verificar Maven (si lo instalaste):
```powershell
mvn --version
```

## Estructura del Proyecto Después de Compilar

```
TiendaCafePOO/
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── Main.java
│   │       └── modelo/
│   │           ├── CafeEspecialidad.java
│   │           ├── TicketTransporte.java
│   │           └── PerfilRedSocial.java
│   └── test/
├── bin/                          ← Archivos compilados (.class)
├── pom.xml
├── README.md
├── DIAGRAMA_UML.txt
└── .gitignore
```

## Salida Esperada

Al ejecutar el programa, verás:

1. Demostración de CafeEspecialidad:
   - Una instancia con constructor vacío
   - Una instancia con parámetros personalizados

2. Demostración de TicketTransporte:
   - Una instancia con constructor vacío
   - Una instancia con parámetros personalizados

3. Demostración de PerfilRedSocial:
   - Una instancia con constructor vacío
   - Una instancia con parámetros personalizados

4. Pruebas de setters mostrando modificaciones de atributos

## Solución de Problemas

### Error: "javac: No se encontró el comando"
- **Solución**: Java no está instalado o no está en el PATH. Instala JDK desde java.com

### Error: "No se puede encontrar el archivo Main.java"
- **Solución**: Asegúrate de estar en el directorio correcto (TiendaCafePOO)

### Error al compilar: "paquete modelo no existe"
- **Solución**: Asegúrate de que la estructura de carpetas es correcta y usa exactamente:
  ```
  javac -d bin -sourcepath src/main/java src/main/java/Main.java src/main/java/modelo/*.java
  ```

## Notas Adicionales

- Los archivos compilados (.class) están en la carpeta `bin/`
- El archivo `.gitignore` excluye `bin/` del repositorio
- Se pueden ejecutar directamente sin necesidad de Maven

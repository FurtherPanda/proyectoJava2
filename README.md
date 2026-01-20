# Proyecto Java: Cálculo de Promedio y Calificación de Alumnos

## 📋 Descripción
Este proyecto implementa una clase en Java para calcular el promedio y la calificación final de un alumno basado en 5 calificaciones. Forma parte de un ejercicio académico que demuestra el uso de clases, métodos, arrays y estructuras de control en Java.

## 🏗️ Estructura del Proyecto


## 📊 Clase `Alumno`

### Atributos
- `nombre` (String): Nombre del estudiante
- `calificaciones` (double[]): Array con 5 calificaciones numéricas

### Métodos

#### 1. `calcularPromedio()`
- **Función**: Calcula el promedio de las 5 calificaciones
- **Retorno**: `double` con el valor del promedio
- **Lógica**: Suma todas las calificaciones y divide entre 5

#### 2. `obtenerCalificacionFinal(double promedio)`
- **Función**: Determina la calificación literal basada en el promedio
- **Parámetro**: `promedio` - valor numérico del promedio
- **Retorno**: `char` con la calificación (A-F)

#### 3. `imprimirResultados()`
- **Función**: Muestra en consola todos los resultados formateados
- **Salida**: Nombre, cada calificación, promedio y calificación final

## 📈 Tabla de Calificaciones

| Rango de Promedio | Calificación | Descripción      |
|-------------------|--------------|------------------|
| 91 - 100          | A            | Excelente        |
| 81 - 90           | B            | Bueno            |
| 71 - 80           | C            | Regular          |
| 61 - 70           | D            | Suficiente       |
| 51 - 60           | E            | Mínimo aprobado  |
| 0 - 50            | F            | Reprobado        |

## 🚀 Compilación y Ejecución

### Requisitos
- Java JDK 8 o superior
- Terminal o línea de comandos

### Pasos para ejecutar:

```bash
# 1. Navegar a la carpeta del proyecto
cd PromedioAlumno

# 2. Compilar el programa
javac src/Alumno.java

# 3. Ejecutar el programa
java -cp src Alumno

Alternativa
cd src
javac Alumno.java
java Alumno

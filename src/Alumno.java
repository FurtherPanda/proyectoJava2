public class Alumno {
    private String nombre;
    private double[] calificaciones;
    
    public Alumno(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }
    
    public double calcularPromedio() {
        double suma = 0.0;
        
        for(int i = 0; i < this.calificaciones.length; i++) {
            suma += this.calificaciones[i];
        }
        
        return suma / this.calificaciones.length;
    }
    
    public char obtenerCalificacionFinal(double promedio) {
        if (promedio <= 50.0) {
            return 'F';
        } else if (promedio <= 60.0) {
            return 'E';
        } else if (promedio <= 70.0) {
            return 'D';
        } else if (promedio <= 80.0) {
            return 'C';
        } else if (promedio <= 90.0) {
            return 'B';
        } else {
            return 'A';
        }
    }
    
    public void imprimirResultados() {
        double promedio = calcularPromedio();
        char calificacionFinal = obtenerCalificacionFinal(promedio);
        
        System.out.println("Nombre del estudiante: " + this.nombre);
        
        for(int i = 0; i < this.calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + this.calificaciones[i]);
        }
        
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacionFinal);
    }
    
    public static void main(String[] args) {
        double[] calificaciones = {85.0, 90.0, 78.0, 88.0, 92.0};
        Alumno alumno = new Alumno("Juan Pérez", calificaciones);
        alumno.imprimirResultados();
    }
}
package Listas;

public class alumno {
    String nombre;
    int edad;

    public alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre + ", edad = " + edad;
    }
    
    
}

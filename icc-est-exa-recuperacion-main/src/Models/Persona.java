package Models;

import java.util.Objects;

/**
 * Clase Persona que representa una entidad Persona con atributos para nombre y edad.
 */
public class Persona {
    private String nombre; 
    private int edad;      

    public Persona(String nombre, int edad) {
        this.nombre = nombre; 
        this.edad = edad;     
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona {nombre='" + nombre + "', edad=" + edad + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false; 
        Persona persona = (Persona) obj;
        return edad == persona.edad && Objects.equals(nombre, persona.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }
}

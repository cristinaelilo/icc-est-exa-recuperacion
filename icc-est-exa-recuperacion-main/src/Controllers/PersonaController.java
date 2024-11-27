package Controllers;

import Models.Persona;

public class PersonaController {
    // Método para ordenar por edad en orden descendente Selección
    public void ordenarPorEdadDescendente(Persona[] personas) {
        for (int i = 0; i < personas.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < personas.length; j++) {
                if (personas[j].getEdad() > personas[maxIndex].getEdad()) {
                    maxIndex = j;
                }
            }
            // Intercambiar personas
            Persona temp = personas[i];
            personas[i] = personas[maxIndex];
            personas[maxIndex] = temp;
        }
    }

    // Método para buscar una persona por edad búsqueda binaria
    public int buscarPorEdad(Persona[] personas, int edad) {
        int inicio = 0, fin = personas.length - 1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (personas[medio].getEdad() == edad) {
                return medio;
            } else if (personas[medio].getEdad() < edad) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }
        return -1;
    }

    // Método para ordenar por nom en orden ascendente Inserción
    public void ordenarPorNombreAscendente(Persona[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Persona clave = personas[i];
            int j = i - 1;
            while (j >= 0 && personas[j].getNombre().compareTo(clave.getNombre()) > 0) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = clave;
        }
    }

    // Método para buscar una persona por nom búsqueda binaria
    public int buscarPorNombre(Persona[] personas, String nombre) {
        int inicio = 0, fin = personas.length - 1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            int comparacion = personas[medio].getNombre().compareTo(nombre);
            if (comparacion == 0) {
                return medio;
            } else if (comparacion > 0) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }
        return -1; 
    }
}

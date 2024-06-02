package org.example;
import java.util.Collection;
import java.util.Iterator;
// Importamos los paquetes.
// Hecho por Rafael Lopez Gonzalez

public class Main {

    public class Asignatura {
        public long id = 0;
        private String nombre = "";
        private int horas = 0;
        public int creditos = 0;
        private boolean disponible = false;

        public Asignatura(long id, String nombre, int horas, int creditos, boolean disponible) {
            extracted(id, nombre, horas, creditos, disponible);  // Datos que componen la clase asignatura.
        }

        public void extracted(long id, String nombre, int horas, int creditos, boolean disponible) { // Extraccion del metodo
            this.id = id;
            this.nombre = nombre;
            this.horas = horas;
            this.creditos = creditos;
            this.disponible = disponible;
        }
    }

    public class Matricula {  // Clase Matricula
        // Datos que componen la clase Matricula.
        public long id = 0;
        private String nombre = "";
        private String apellidos = "";
        private String dni = "";
        private int curso = 0;
        private Collection asignaturas;

        public Matricula() {
        }

        public Matricula(long id, String nombre, String apellidos, String dni, int curso, Collection asignaturas) {
            extracted(id, nombre, apellidos, dni, curso, asignaturas); // Datos que componen la clase Matricula.
        }

        public void extracted(long id, String nombre, String apellidos, String dni, int curso, Collection asignaturas) { // Extraccion del metodo
            this.id = id;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.dni = dni;
            this.curso = curso;
            this.asignaturas = asignaturas;
        }

        public float costeMatricula() { // Funcion coste matricula.

            float coste = 0;
            int creditos = 0;

            return extracted(creditos);
        }

        public float extracted(int creditos) {
            float coste;
            for (Iterator iter = asignaturas.iterator(); iter.hasNext(); ) {
                Asignatura elemento = (Asignatura) iter.next();
                creditos = creditos + elemento.creditos;
                // Datos para calcular el coste de la matricula
            }

            coste = creditos * 15;
            return coste; // Cuanto cuesta la matricula
        }
    }
}
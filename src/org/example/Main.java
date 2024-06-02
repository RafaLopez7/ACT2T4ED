package org.example;
import java.util.Collection;
import java.util.Iterator;


public class Main {

    public class Asignatura {
        public long id = 0;
        private String nombre = "";
        private int horas = 0;
        public int creditos = 0;
        private boolean disponible = false;

        public Asignatura(long id, String nombre, int horas, int creditos, boolean disponible) {
            extracted(id, nombre, horas, creditos, disponible);
        }

        public void extracted(long id, String nombre, int horas, int creditos, boolean disponible) {
            this.id = id;
            this.nombre = nombre;
            this.horas = horas;
            this.creditos = creditos;
            this.disponible = disponible;
        }
    }

    public class Matricula {
        public long id = 0;
        private String nombre = "";
        private String apellidos = "";
        private String dni = "";
        private int curso = 0;
        private Collection asignaturas;

        public Matricula() {
        }

        public Matricula(long id, String nombre, String apellidos, String dni, int curso, Collection asignaturas) {
            extracted(id, nombre, apellidos, dni, curso, asignaturas);
        }

        public void extracted(long id, String nombre, String apellidos, String dni, int curso, Collection asignaturas) {
            this.id = id;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.dni = dni;
            this.curso = curso;
            this.asignaturas = asignaturas;
        }

        public float costeMatricula() {

            float coste = 0;
            int creditos = 0;

            return extracted(creditos);
        }

        public float extracted(int creditos) {
            float coste;
            for (Iterator iter = asignaturas.iterator(); iter.hasNext(); ) {
                Asignatura elemento = (Asignatura) iter.next();
                creditos = creditos + elemento.creditos;

            }

            coste = creditos * 15;
            return coste; 
        }
    }
}
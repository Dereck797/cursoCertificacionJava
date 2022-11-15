package CursoJavaIndra.practica6;

public class Persona {

    private final String nombre;
    private final String apellido;
    private final Long edad;
    private final String profesion;
    private final Boolean primeraLinea;
    private final Boolean comorbilidades;

    public Persona(Builder builder) {
        this.nombre = builder.nombres;
        this.apellido = builder.apellidos;
        this.edad = builder.edad;
        this.profesion = builder.profesion;
        this.primeraLinea = builder.primeraLinea;
        this.comorbilidades = builder.comorbilidades;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Long getEdad() {
        return edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public Boolean getPrimeraLinea() {
        return primeraLinea;
    }

    public Boolean getComorbilidades() {
        return comorbilidades;
    }

    public static class Builder {

        private final String nombres;
        private final String apellidos;
        private Long edad;
        private String profesion;

        private Boolean primeraLinea;

        private Boolean comorbilidades;

        public Builder(String nombres, String apellidos) {
            this.nombres = nombres;
            this.apellidos = apellidos;
        }

        public Builder edad(Long edad) {
            this.edad = edad;
            return this;
        }

        public Builder profesion(String direccion) {
            this.profesion = direccion;
            return this;
        }

        public Builder primeraLinea(Boolean primeraLinea) {
            this.primeraLinea = primeraLinea;
            return this;
        }

        public Builder comorbilidades(Boolean comorbilidades) {
            this.comorbilidades = comorbilidades;
            return this;
        }


        public Persona build() {
            return new Persona(this);
        }

    }



}

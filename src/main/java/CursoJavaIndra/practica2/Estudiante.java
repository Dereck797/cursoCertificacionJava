package CursoJavaIndra.practica2;

public class Estudiante {

    private String nombres;

    private String apellidos;

    private String genero;

    private Long edad;

    private String ciudadDeNacimiento;

    public Estudiante(String nombres, String apellidos, String genero, Long edad, String ciudadDeNacimiento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
        this.edad = edad;
        this.ciudadDeNacimiento = ciudadDeNacimiento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Long getEdad() {
        return edad;
    }

    public void setEdad(Long edad) {
        this.edad = edad;
    }

    public String getCiudadDeNacimiento() {
        return ciudadDeNacimiento;
    }

    public void setCiudadDeNacimiento(String ciudadDeNacimiento) {
        this.ciudadDeNacimiento = ciudadDeNacimiento;
    }
}

package CursoJavaIndra;

import java.util.List;

public class Estudiante {

    private String nombres;

    private String apellidos;

    private String genero;

    private Long edad;

    private String ciudadDeNacimiento;

    private List<Double> notas;

    public Estudiante(String nombres, String apellidos, String genero, Long edad, String ciudadDeNacimiento, List<Double> notas) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
        this.edad = edad;
        this.ciudadDeNacimiento = ciudadDeNacimiento;
        this.notas = notas;
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

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }
}

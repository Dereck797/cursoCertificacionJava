package CursoJavaIndra;

public enum PowerEstado {

    ECENDIDO("Estado encendido", 1l),
    APAGADO("Estado apagado", 1l),
    SUSPENDIDO("Estado suspendido", 1l);

    private String descripcion;
    private Long codigo;

    PowerEstado(String descripcion, Long codigo) {
        this.descripcion = descripcion;
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
}

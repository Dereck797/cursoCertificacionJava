package CursoJavaIndra.example1;

public class RocaTriturada implements CalculoVentas {

    private String nombre;
    private Double precioVenta;
    private Double costo;
    private Double peso;

    public RocaTriturada(Double precioVenta, Double costo, Double peso){
        this.precioVenta=precioVenta;
        this.costo=costo;
        this.peso=peso;
    }

    @Override
    public String getNombre() {
        return null;
    }

    @Override
    public Double calcularPrecioVenta() {
        return null;
    }

    @Override
    public Double calcularCosto() {
        return this.precioVenta * this.peso;
    }

    @Override
    public Double calcularGanancia() {
        return this.costo * this.peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}

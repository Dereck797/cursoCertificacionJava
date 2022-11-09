package CursoJavaIndra.example1;

public class Pintura implements CalculoVentas {

    private String color;
    private String marca;
    private Double precioVenta;
    private Double costo;
    private Double galones;

    public Pintura(Double precioVenta, Double costo, Double galones) {
        this.color = color;
        this.marca = marca;
        this.precioVenta = precioVenta;
        this.costo = costo;
        this.galones = galones;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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

    public Double getGalones() {
        return galones;
    }

    public void setGalones(Double galones) {
        this.galones = galones;
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
        return this.precioVenta * this.galones * CalculoVentas.IVA;
    }

    @Override
    public Double calcularGanancia() {
        return this.galones;
    }
}

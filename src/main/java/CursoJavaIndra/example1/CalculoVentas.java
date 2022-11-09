package CursoJavaIndra.example1;

public interface CalculoVentas {

    public final Double IVA = 0.19;
    public String getNombre();

    public Double calcularPrecioVenta();

    public Double calcularCosto();

    public Double calcularGanancia();

    // métodos por defecto
    // se debe definir con default y debe definirse dentro de una interface
    public default void calcularDiferencia() {
        System.out.println("Nombre: " +  this.getNombre());
        System.out.println("Nombre: " +  this.calcularCosto());
        System.out.println("Nombre: " +  this.calcularGanancia());
        System.out.println("Nombre: " +  this.calcularPrecioVenta());
    }

}

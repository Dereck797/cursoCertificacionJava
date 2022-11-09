package CursoJavaIndra.example1;

public class ReporteProductos {

    public void imprimirItems( CalculoVentas item ) {

        System.out.println("Nombre: " + item.getNombre());
        System.out.println("Nombre: " +  item.calcularCosto());
        System.out.println("Nombre: " +  item.calcularGanancia());
        System.out.println("Nombre: " +  item.calcularPrecioVenta());

    }
}

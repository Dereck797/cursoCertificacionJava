package CursoJavaIndra;

import CursoJavaIndra.example1.CalculoVentas;
import CursoJavaIndra.example1.Pintura;
import CursoJavaIndra.example1.ReporteProductos;
import CursoJavaIndra.example1.RocaTriturada;

public class MainClass {

    public static void main(String[] args) {

        RocaTriturada roca = new RocaTriturada(1000.0,23.0,012.0);
        System.out.println(roca.getPrecioVenta());

        CalculoVentas pintura = new Pintura(122.2,1222.2,122.5);
        System.out.println(pintura.calcularPrecioVenta());

        CalculoVentas[] items = new CalculoVentas[5];
        ReporteProductos reporte = new ReporteProductos();

        items[0] = new RocaTriturada(1000.0,23.0,012.0);
        items[1] = new Pintura(1000.0,23.0,012.0);
        items[2] = new RocaTriturada(1000.0,23.0,012.0);
        items[3] = new Pintura(1000.0,23.0,012.0);
        items[4] = new RocaTriturada(1000.0,23.0,012.0);

        for(CalculoVentas item : items) {
            reporte.imprimirItems(item);
        }
    }
}

package CursoJavaIndra.example1;

public class ServiciosProfesionales extends Servicios implements ServiciosCalculoVentas {
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
        return null;
    }

    @Override
    public Double calcularGanancia() {
        return null;
    }

    @Override
    public void calcularDiferencia() {
        ServiciosCalculoVentas.super.calcularDiferencia();
    }

    @Override
    public String obtenerTipoServicio() {
        return null;
    }
}

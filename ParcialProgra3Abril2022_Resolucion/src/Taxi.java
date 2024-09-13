public class Taxi extends Vehiculo {
    private static final double PRECIO_BAJADA_BANDERA = 650;
    private static final double PRECIO_POR_KM = 500;

    private double contadorKm;

    public Taxi(String marca, String modelo, String tipoCombustible, String patente) {
        super(marca, modelo, tipoCombustible, patente);
        this.contadorKm = 0;
    }

    public double getContadorKm() {
        return contadorKm;
    }

    public void setContadorKm(double contadorKm) {
        this.contadorKm = contadorKm;
    }

    @Override
    public double calcularPrecioFinal() {
        return PRECIO_BAJADA_BANDERA + (PRECIO_POR_KM * contadorKm);
    }
}

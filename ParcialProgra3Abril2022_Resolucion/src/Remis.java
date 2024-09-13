public class Remis extends Vehiculo {
    private double tarifaPorCuadra;
    private int cantidadDeCuadrasRecorridas;

    public Remis(String marca, String modelo, String tipoCombustible, String patente, double tarifaPorCuadra) {
        super(marca, modelo, tipoCombustible, patente);
        this.tarifaPorCuadra = tarifaPorCuadra;
        this.cantidadDeCuadrasRecorridas = 0;
    }

    public double getTarifaPorCuadra() { return tarifaPorCuadra; }
    public void setTarifaPorCuadra(double tarifaPorCuadra) { this.tarifaPorCuadra = tarifaPorCuadra; }

    public int getCantidadDeCuadrasRecorridas() { return cantidadDeCuadrasRecorridas; }
    public void setCantidadDeCuadrasRecorridas(int cantidadDeCuadrasRecorridas) { this.cantidadDeCuadrasRecorridas = cantidadDeCuadrasRecorridas; }

    @Override
    public double calcularPrecioFinal() {
        return tarifaPorCuadra * cantidadDeCuadrasRecorridas;
    }
}

public class Viaje {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private int cantidadDeCuadrasRecorridas; // Para Remis
    private float cantidadDeKmRecorridos; // Para Taxi

    public Viaje(Cliente cliente, Vehiculo vehiculo) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getCantidadDeCuadrasRecorridas() {
        return cantidadDeCuadrasRecorridas;
    }

    public void setCantidadDeCuadrasRecorridas(int cantidadDeCuadrasRecorridas) {
        this.cantidadDeCuadrasRecorridas = cantidadDeCuadrasRecorridas;
    }

    public float getCantidadDeKmRecorridos() {
        return cantidadDeKmRecorridos;
    }

    public void setCantidadDeKmRecorridos(float cantidadDeKmRecorridos) {
        this.cantidadDeKmRecorridos = cantidadDeKmRecorridos;
    }

    public double calcularPrecioFinal() {
        if (vehiculo instanceof Taxi) {
            Taxi taxi = (Taxi) vehiculo;
            taxi.setContadorKm(cantidadDeKmRecorridos);
            return taxi.calcularPrecioFinal();
        } else if (vehiculo instanceof Remis) {
            Remis remis = (Remis) vehiculo;
            remis.setCantidadDeCuadrasRecorridas(cantidadDeCuadrasRecorridas);
            return remis.calcularPrecioFinal();
        } else {
            throw new IllegalArgumentException("Tipo de vehículo no soportado");
        }
    }


    @Override
    public String toString() {
        return "Cliente: " + cliente.toString() + "\nVehículo: " + vehiculo.toString() +
                "\nCosto Total: " + calcularPrecioFinal();
    }
}

import java.util.ArrayList;

public class Agencia {
    private ArrayList<Cliente> clientes;
    private ArrayList<Vehiculo> vehiculos;
    private double totalRecaudado;

    public Agencia() {
        clientes = new ArrayList<>();
        vehiculos = new ArrayList<>();
        totalRecaudado = 0;
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void listarVehiculos() {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }

    public Vehiculo obtenerVehiculoDisponible() {
        // Suponiendo que el primer vehículo disponible es el adecuado.
        // En una aplicación real, deberías agregar lógica para verificar disponibilidad.
        if (vehiculos.isEmpty()) {
            return null;
        }
        return vehiculos.get(0);
    }

    public void registrarViaje(Viaje viaje) {
        double costo = viaje.calcularPrecioFinal();
        totalRecaudado += costo;
        System.out.println("Viaje registrado:\n" + viaje);
    }

    public double getTotalRecaudado() {
        return totalRecaudado;
    }
}

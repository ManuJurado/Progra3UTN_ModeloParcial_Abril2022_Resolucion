public class Main {
    public static void main(String[] args) {
        // Crear instancia de la agencia
        Agencia agencia = new Agencia();

        // Crear clientes
        Cliente cliente1 = new Cliente("Juan", "Pérez", "123456789", "Calle Falsa 123");
        Cliente cliente2 = new Cliente("Ana", "García", "987654321", "Avenida Siempre Viva 456");

        // Agregar clientes a la agencia
        agencia.agregarCliente(cliente1);
        agencia.agregarCliente(cliente2);

        // Crear vehículos
        Taxi taxi = new Taxi("Toyota", "Corolla", "Nafta", "ABC123");
        Remis remis = new Remis("Ford", "Fiesta", "Diesel", "DEF456", 200);

        // Agregar vehículos a la agencia
        agencia.agregarVehiculo(taxi);
        agencia.agregarVehiculo(remis);

        // Crear y registrar viajes
        Viaje viaje1 = new Viaje(cliente1, taxi);
        viaje1.setCantidadDeKmRecorridos(10);  // Para taxi, establecer kilómetros
        agencia.registrarViaje(viaje1);

        Viaje viaje2 = new Viaje(cliente2, remis);
        viaje2.setCantidadDeCuadrasRecorridas(15);  // Para remis, establecer cantidad de cuadras
        agencia.registrarViaje(viaje2);

        // Listar clientes y vehículos
        System.out.println("Clientes:");
        agencia.listarClientes();

        System.out.println("\nVehículos:");
        agencia.listarVehiculos();

        // Mostrar total recaudado
        System.out.println("\nTotal Recaudado: $" + agencia.getTotalRecaudado());
    }
}

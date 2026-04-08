public class Main {
    public static void main(String[] args) {

        // PROTOTYPE
        RegistroVehiculos registro = new RegistroVehiculos();
        registro.registrar("auto", new Auto(400));
        registro.registrar("van", new Van(300));
        registro.registrar("camion", new CamionLigero(250));

        // Crear vehículos
        Vehiculo v1 = registro.crear("auto");
        v1.setPlaca("ABC123");

        Vehiculo v2 = registro.crear("van");
        v2.setPlaca("XYZ789");

        Vehiculo v3 = registro.crear("camion");
        v3.setPlaca("LMN456");

        // INVENTARIO (ARRAY)
        Inventario inventario = new Inventario(10);
        inventario.agregar(v1);
        inventario.agregar(v2);
        inventario.agregar(v3);

        System.out.println("=== Inventario ===");
        inventario.mostrar();

        // Buscar
        System.out.println("\nBuscando ABC123...");
        Vehiculo encontrado = inventario.buscar("ABC123");
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.getClass().getSimpleName());
        }

        // Ordenar
        System.out.println("\nOrdenando por autonomía...");
        inventario.ordenarPorAutonomia();
        inventario.mostrar();

        // BUILDER (CONTRATO)
        System.out.println("\n=== Contrato ===");

        Contrato contrato = new ContratoBuilder()
                .setCliente("Carol")
                .setVehiculo(v1)
                .setPlan("Mensual")
                .agregarGPS()
                .agregarSeguro()
                .build();

        contrato.mostrar();
    }
}

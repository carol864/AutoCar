class Contrato {
    String cliente;
    Vehiculo vehiculo;
    String plan;
    boolean gps;
    boolean seguro;
    boolean cargador;

    public void mostrar() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Vehículo: " + vehiculo.getClass().getSimpleName());
        System.out.println("Plan: " + plan);
        System.out.println("GPS: " + gps);
        System.out.println("Seguro: " + seguro);
        System.out.println("Cargador: " + cargador);
    }
}

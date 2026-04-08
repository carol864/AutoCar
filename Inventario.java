import java.util.Arrays;

class Inventario {
    private Vehiculo[] vehiculos;
    private int contador;

    public Inventario(int tamaño) {
        vehiculos = new Vehiculo[tamaño];
        contador = 0;
    }

    public void agregar(Vehiculo v) {
        if (contador < vehiculos.length) {
            vehiculos[contador++] = v;
        } else {
            System.out.println("Inventario lleno");
        }
    }

    public Vehiculo buscar(String placa) {
        for (int i = 0; i < contador; i++) {
            if (vehiculos[i].getPlaca().equals(placa)) {
                return vehiculos[i];
            }
        }
        return null;
    }

    public void ordenarPorAutonomia() {
        Arrays.sort(vehiculos, 0, contador,
                (a, b) -> a.getAutonomia() - b.getAutonomia());
    }

    public void mostrar() {
        for (int i = 0; i < contador; i++) {
            System.out.println(
                vehiculos[i].getClass().getSimpleName() +
                " - Placa: " + vehiculos[i].getPlaca() +
                " - Autonomía: " + vehiculos[i].getAutonomia()
            );
        }
    }
}
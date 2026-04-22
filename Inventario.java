import java.util.Arrays;

class Inventario {

    //Atributos
    private Vehiculo[] vehiculos;//Array
    private int contador;

    //Constructor
    public Inventario(int tamaño) {
        vehiculos = new Vehiculo[tamaño];//Se inicializa el array con el tamaño especificado
        contador = 0;
    }

    //Metodos

    //Metodo para agregar un vehiculo al inventario
    public void agregar(Vehiculo v) {
        if (contador < vehiculos.length) {//Se verifica que el contador no exceda el tamaño del array
            vehiculos[contador++] = v;//Se agrega el vehiculo al array y se incrementa el contador
        } else {
            System.out.println("Inventario lleno");
        }
    }

    //Metodo para buscar un vehiculo por su placa
    public Vehiculo buscar(String placa) {
        for (int i = 0; i < contador; i++) {
            if (vehiculos[i].getPlaca().equals(placa)) {//Se compara la placa del vehiculo con la placa buscada
                return vehiculos[i];
            }
        }
        return null;
    }

    //Metodo para ordenar los vehiculos por su autonomia
    public void ordenarPorAutonomia() {
        Arrays.sort(vehiculos, 0, contador,//Se ordena el array de vehiculos desde el indice 0 hasta el contador utilizando un comparador que compara la autonomia de los vehiculos
                (a, b) -> a.getAutonomia() - b.getAutonomia());//Se utiliza una expresion lambda para definir el comparador
    }

    //Metodo para mostrar los vehiculos en el inventario
    public void mostrar() {
        for (int i = 0; i < contador; i++) {//Se recorre el array de vehiculos desde el indice 0 hasta el contador para mostrar la informacion de cada vehiculo
            System.out.println(
                vehiculos[i].getClass().getSimpleName() +
                " - Placa: " + vehiculos[i].getPlaca() +
                " - Autonomía: " + vehiculos[i].getAutonomia()
            );
        }
    }
}
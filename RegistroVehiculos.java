import java.util.HashMap;
import java.util.Map;

class RegistroVehiculos {

    // Mapa para almacenar prototipos de vehículos
    private Map<String, Vehiculo> prototipos = new HashMap<>();

    // Método para registrar un prototipo de vehículo
    public void registrar(String tipo, Vehiculo vehiculo) {
        prototipos.put(tipo, vehiculo);//Se registra el prototipo en el mapa con su tipo como clave
    }

    // Método para crear un nuevo vehículo a partir de un prototipo registrado
    public Vehiculo crear(String tipo) {
        if (prototipos.containsKey(tipo)) {
            return prototipos.get(tipo).clone();//Se clona el prototipo para crear un nuevo vehículo
        }
        return null;
    }
}
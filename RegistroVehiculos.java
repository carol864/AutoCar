import java.util.HashMap;
import java.util.Map;

class RegistroVehiculos {
    private Map<String, Vehiculo> prototipos = new HashMap<>();

    public void registrar(String tipo, Vehiculo vehiculo) {
        prototipos.put(tipo, vehiculo);
    }

    public Vehiculo crear(String tipo) {
        if (prototipos.containsKey(tipo)) {
            return prototipos.get(tipo).clone();
        }
        return null;
    }
}
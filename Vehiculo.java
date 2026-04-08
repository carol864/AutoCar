abstract class Vehiculo implements Cloneable {
    String placa;
    int autonomia;

    public abstract Vehiculo clone();

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAutonomia() {
        return autonomia;
    }
}
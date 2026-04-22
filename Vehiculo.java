//Clase abstracta Vehiculo que implementa la interfaz Cloneable para permitir la clonacion de objetos
abstract class Vehiculo implements Cloneable {

    //Atributos
    private String placa;
    protected int autonomia;

    //Constructores
    public Vehiculo(String placa) {
        this.placa = placa;
    }

    public Vehiculo(int autonomia) {
        this.autonomia = autonomia;
    }

    //Metodo abstracto para clonar el objeto
    public abstract Vehiculo clone();

    //Getters y Setters de placa
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    //Getters y Setters de autonomia
    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getAutonomia() {
        return autonomia;
    }
}
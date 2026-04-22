class CamionLigero extends Vehiculo {

    //Constructor
    public CamionLigero(int autonomia) {
        super(autonomia);
    }

    //Implementacion del metodo clone
    @Override
    public Vehiculo clone() {
        return new CamionLigero(this.getAutonomia());
    }
}
class Auto extends Vehiculo {

    //Constructor
    public Auto(int autonomia) {
        super(autonomia);
    }

    //Implementacion del metodo clone
    @Override
    public Vehiculo clone() {
        return new Auto(this.getAutonomia());//Se clona el objeto creando una nueva instancia con la misma autonomia
    }
}
class Van extends Vehiculo {

    //Constructor
    public Van(int autonomia) {
        super(autonomia);
    }

    //Implementacion del metodo clone
    @Override
    public Vehiculo clone() {
        return new Van(this.getAutonomia());
    }
}
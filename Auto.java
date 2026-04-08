class Auto extends Vehiculo {

    public Auto(int autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public Vehiculo clone() {
        return new Auto(this.autonomia);
    }
}
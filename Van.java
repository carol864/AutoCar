class Van extends Vehiculo {

    public Van(int autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public Vehiculo clone() {
        return new Van(this.autonomia);
    }
}
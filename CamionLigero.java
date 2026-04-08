class CamionLigero extends Vehiculo {

    public CamionLigero(int autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public Vehiculo clone() {
        return new CamionLigero(this.autonomia);
    }
}
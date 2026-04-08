class ContratoBuilder {
    private Contrato contrato;

    public ContratoBuilder() {
        contrato = new Contrato();
    }

    public ContratoBuilder setCliente(String cliente) {
        contrato.cliente = cliente;
        return this;
    }

    public ContratoBuilder setVehiculo(Vehiculo vehiculo) {
        contrato.vehiculo = vehiculo;
        return this;
    }

    public ContratoBuilder setPlan(String plan) {
        contrato.plan = plan;
        return this;
    }

    public ContratoBuilder agregarGPS() {
        contrato.gps = true;
        return this;
    }

    public ContratoBuilder agregarSeguro() {
        contrato.seguro = true;
        return this;
    }

    public ContratoBuilder agregarCargador() {
        contrato.cargador = true;
        return this;
    }

    public Contrato build() {
        // Validación
        if (contrato.cliente == null || contrato.vehiculo == null || contrato.plan == null) {
            throw new IllegalStateException("Faltan datos obligatorios");
        }

        // Regla de negocio
        if (contrato.plan.equalsIgnoreCase("Mensual")) {
            System.out.println("Aplicando descuento por plan mensual");
        }

        return contrato;
    }
}

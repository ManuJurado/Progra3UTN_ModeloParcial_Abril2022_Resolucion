public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String tipoCombustible;
    protected String patente;

    public Vehiculo(String marca, String modelo, String tipoCombustible, String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustible = tipoCombustible;
        this.patente = patente;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getTipoCombustible() { return tipoCombustible; }
    public void setTipoCombustible(String tipoCombustible) { this.tipoCombustible = tipoCombustible; }

    public String getPatente() { return patente; }
    public void setPatente(String patente) { this.patente = patente; }

    @Override
    public String toString() {
        return marca + " " + modelo + ", Tipo de Combustible: " + tipoCombustible + ", Patente: " + patente;
    }

    public abstract double calcularPrecioFinal();
}

class Viaturas {
    String tipo;
    String rodas;
    int velMax;

    public Viaturas() {
    }

    public Viaturas(String tipo, String rodas, int velMax) {
        this.tipo = tipo;
        this.rodas = rodas;
        this.velMax = velMax;
    }

    public String getTipo() {
        return tipo;
    }

    public String getRodas() {
        return rodas;
    }

    public int getVelMax() {
        return velMax;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setRodas(String rodas) {
        this.rodas = rodas;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Rodas: " + rodas + ", VelMax: " + velMax;
    }
}


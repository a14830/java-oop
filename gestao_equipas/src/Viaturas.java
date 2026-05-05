public class Viaturas {
    private String viatura;
    private int numRodas;
    private int velMax;

    public Viaturas() {
    }

    public Viaturas(String viatura, int numRodas, int velMax) {
        this.viatura = viatura;
        this.numRodas = numRodas;
        this.velMax = velMax;
    }

    public String getViatura() {
        return viatura;
    }

    public int getNumRodas() {
        return numRodas;
    }

    public int getVelMax() {
        return velMax;
    }

    // Setters
    public void setViatura(String viatura) {
        this.viatura = viatura;
    }

    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    @Override
    public String toString() {
        return "Viaturas [tipo da viatura: " + viatura +  ", numero de rodas: " + numRodas + ", velocidade maxima: " + velMax + "]";
    }

    void mostraInfo (){
        System.out.println("Info do carro: \n Tipo viatura:" + viatura + "\n numero de Rodas: " + numRodas + "\n velMax. " + velMax);
    }
    

    
}
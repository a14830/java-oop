public class Cruzeiro extends Barco {
    int numQuarto;
    int numPisos;
    String nomeBarco;

    public Cruzeiro() {
    }

    public Cruzeiro(int numQuarto, int numPisos, String nomeBarco) {
        this.numQuarto = numQuarto;
        this.numPisos = numPisos;
        this.nomeBarco = nomeBarco;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public String getNomeBarco() {
        return nomeBarco;
    }

    public void setNomeBarco(String nomeBarco) {
        this.nomeBarco = nomeBarco;
    }

    public String toString() {
        return "Cruzeiro [numQuarto=" + numQuarto + ", numPisos=" + numPisos + ", nomeBarco=" + nomeBarco
                + ", getNumQuarto()=" + getNumQuarto() + ", getNumPisos()=" + getNumPisos() + ", getNomeBarco()="
                + getNomeBarco() + "]";
    }

    void mostraInfoCruzeiro() {
        System.out.println("Numero de Quartos: " + numQuarto);
        System.out.println("Numero de Pisos: " + numPisos);
        System.out.println("Nome do Barco: " + nomeBarco);
        
    }
}

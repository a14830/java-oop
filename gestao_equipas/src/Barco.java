public class Barco extends Viaturas {

    private boolean temPiscina;

    public boolean isTemPiscina() {
        return temPiscina;
    }

    public void setTemPiscina(boolean temPiscina) {
        this.temPiscina = temPiscina;
    }

    public Barco () {
        super("Barco", 0, 0);
    }
    
    @Override
    void mostraInfo (){
        System.out.println("Info do carro: \n Tipo viatura:" + getViatura() + "\n numRodas: " + getNumRodas() + "\n velMax. " + getVelMax());
    }

}

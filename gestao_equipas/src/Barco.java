public class Barco extends Viaturas {

    private boolean temPiscina;

    public boolean isTemPiscina() {
        return temPiscina;
    }

    public void setTemPiscina(boolean temPiscina) {
        this.temPiscina = temPiscina;
    }

    public Barco () {
        super("Desportivo", 0, 0);
    }
    
    @Override
    void mostraInfo (){
        System.out.println("Info do Barco: \n Tipo Barco: " + getViatura() + "\n numero de Rodas: " + getNumRodas() + "\n velocidade Maxima: " + getVelMax());
    }

}

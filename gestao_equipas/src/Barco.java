public class Barco extends Viaturas {

private boolean temPiscina;

    public Barco (){
        super("barco", 0, 0, "");
}
    
    public boolean isTemPiscina(){
    return temPiscina;
}
    public void setTemPiscina(boolean temPiscina){
    this.temPiscina = temPiscina;
}

@Override
    public String toString() {
    return ("Viaturas tipo da viatura: " + getViatura() +  ", numero de rodas: " + getNumRodas() + ", velocidade maxima: " + getVelMax() + "");
}
    if (temPiscina){
        System.out.println("tem Piscina");
    }
    else {
        System.out.println("nao tem piscina");
    }
}

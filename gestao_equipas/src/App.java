public class App {
    public static void main(String[] args) throws Exception {

        Viaturas viatura = new Viaturas();

        viatura.setNumRodas(4);
        viatura.setViatura("Desportivo");
        viatura.setVelMax(120);
        viatura.mostraInfo();

        Barco barco = new Barco();
        barco.mostraInfo();

        Cruzeiro carro = new Cruzeiro();
        
        carro.setNumQuarto(67);
        carro.setNumPisos(5);
        carro.setNomeBarco("Cruzeiro da Pqp");
        carro.mostraInfoCruzeiro();

    } 
}
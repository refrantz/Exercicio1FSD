public class VeiculoPasseio extends Veiculo {

    public VeiculoPasseio(String placa, String marca, String modelo, int ano, double valor, double consumoKmLt){
        super(placa, marca, modelo, ano, valor);
        this.consumoKmLt = consumoKmLt;
    }

    private double consumoKmLt;
}
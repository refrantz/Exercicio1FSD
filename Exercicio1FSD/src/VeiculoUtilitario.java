public class VeiculoUtilitario extends Veiculo {

    public VeiculoUtilitario(String placa, String marca, String modelo, int ano, double valor, int capCargaTon, int nroEixos){
        super(placa, marca, modelo, ano, valor);
        this.capCargaTon = capCargaTon;
        this.nroEixos = nroEixos;
    }

    private int capCargaTon;
    private int nroEixos;
}

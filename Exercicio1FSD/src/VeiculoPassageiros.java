
public class VeiculoPassageiros extends Veiculo{
    private int nroPass;

    public VeiculoPassageiros(String placa, String marca, String modelo, int ano, double valor, int nroPass) {
        super(placa, marca, modelo, ano, valor);
        //TODO Auto-generated constructor stub
        this.nroPass = nroPass;
    }
}

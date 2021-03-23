
public class VeiculoPassageiros extends Veiculo{
    private int nroPass;

    public VeiculoPassageiros(String placa, String marca, String modelo, int ano, double valor, int nroPass) {
        super(placa, marca, modelo, ano, valor);
        this.nroPass = nroPass;
    }

    public String toString() {
        return "\nVeiculo [ano=" + getAno() 
                + ", marca=" + getMarca() 
                + ", modelo="+ getModelo() 
                + ", placa=" + getPlaca()
                + ", valor=" + getValor()
                + ", num passageiros=" + nroPass +"]";
    }
}

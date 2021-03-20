public class VeiculoUtilitario extends Veiculo {
    
    private int capCargaTon;
    private int nroEixos;

    public VeiculoUtilitario(String placa, String marca, String modelo, int ano, double valor, int capCargaTon, int nroEixos){
        super(placa, marca, modelo, ano, valor);
    }

    public String toString() {
        return "\nVeiculo [ano=" + getAno() 
                + ", marca=" + getMarca() 
                + ", modelo="+ getModelo() 
                + ", placa=" + getPlaca()
                + ", valor=" + getValor()
                + ", capacidade de carga=" + capCargaTon 
                + ", numero de eixos=" + nroEixos +"]";
    }
}

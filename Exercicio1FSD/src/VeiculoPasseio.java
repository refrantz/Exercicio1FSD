public class VeiculoPasseio extends Veiculo {

    private double consumoKmLt;

    public VeiculoPasseio(String placa, String marca, String modelo, int ano, double valor){
        super(placa, marca, modelo, ano, valor);
    }    

    public String toString() {
        return "\nVeiculo [ano=" + getAno() 
                + ", marca=" + getMarca() 
                + ", modelo="+ getModelo() 
                + ", placa=" + getPlaca()
                + ", valor=" + getValor()
                + ", consumo Km/L=" + consumoKmLt +"]";
    }
}
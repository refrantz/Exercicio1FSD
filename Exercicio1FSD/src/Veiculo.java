public class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private double valor;


    public Veiculo(String placa, String marca, String modelo, int ano, double valor) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    public String getMarca(){
        return marca;
    }

    public int getAno(){
        return ano;
    }

    @Override
    public String toString() {
        return "\nVeiculo [ano=" + ano + ", marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", valor="
                + valor + "]";
    }
}
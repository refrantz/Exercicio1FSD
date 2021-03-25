package com.grupo2;

public class VeiculoPasseio extends Veiculo {

    private double consumoKmLt;

    public VeiculoPasseio(String placa, String marca, String modelo, int ano, double valor, double consumo){
        super(placa, marca, modelo, ano, valor);
        this.consumoKmLt = consumo;
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
package com.grupo2;

import java.util.ArrayList;
import java.util.List;

public class CatalogoVeiculos {

    private List<Veiculo> veiculos;

    public CatalogoVeiculos(List<Veiculo> veiculos){
        this.veiculos = veiculos;
    }

    public Veiculo consultaPorPlaca(String placa){
        placa = placa.toLowerCase();

        for(int i = 0; i < veiculos.size(); i++) {
            if(placa.equals(veiculos.get(i).getPlaca().toLowerCase())){
                return veiculos.get(i);
            }
        }
        return null;
    }

    public List<Veiculo> consultaPorMarca(String marca){
        List<Veiculo> result = new ArrayList<Veiculo>();
        marca = marca.toLowerCase();

        for(int i = 0; i < veiculos.size(); i++){
            if(marca.equals(veiculos.get(i).getMarca().toLowerCase())){
                result.add(veiculos.get(i));
            }
        }

        return result;
    }

    public List<Veiculo> consultaPorAno(int ano){
       List<Veiculo> result = new ArrayList<Veiculo>();

       for(Veiculo v: veiculos){
            if (v.getAno() == ano){
                result.add(v);
            }
       }

       return result;
    }

    // opções de tipo: "passageiros", "passeio", utilitario
    public List<Veiculo> consultaPorTipo(String tipo){
        List<Veiculo> result = new ArrayList<Veiculo>();
        tipo.toLowerCase().trim();

        if(tipo.equals("passeio")){
            for(Veiculo v: veiculos){
                if(v instanceof VeiculoPasseio){
                    result.add(v);
                }
            }   
        }
        
        else if(tipo.equals("utilitario")){
            for(Veiculo v: veiculos){
                if(v instanceof VeiculoUtilitario){
                    result.add(v);
                }
            }   
        }

        else if(tipo.equals("passageiros")){
            for(Veiculo v: veiculos){
                if(v instanceof VeiculoPassageiros){
                    result.add(v);
                }
            }   
        }

        else{
            System.out.println("Tipo não encontrado");
        }
        
        return result;
    }

}

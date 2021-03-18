import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogoVeiculos {

    //Lista de veiculos hard coded
    List<Veiculo> veiculos = Arrays.asList(
        new Veiculo("BRA2E19", "Honda", "Civic", 2017, 107200.00), 
        new Veiculo("BRA3E20", "Honda", "Accord", 2020, 107201.00),
        new Veiculo("BRA4E20", "Honda", "Fit", 2015, 107201.00),
        new Veiculo("BRA5E20", "Audi", "A3", 2006, 107201.00),
        new Veiculo("BRA6E20", "Effa", "K01", 2019, 107201.00),
        new Veiculo("BRA7E20", "Effa", "V25", 2020, 107201.00)
        );



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
        List<Veiculo> result = new ArrayList();
        marca = marca.toLowerCase();

        for(int i = 0; i < veiculos.size(); i++){
            if(marca.equals(veiculos.get(i).getMarca().toLowerCase())){
                result.add(veiculos.get(i));
            }
        }

        // para não gerar erro quando não encontrar
        if(result.size() == 0)
            return null;
        return result;
    }

    public List<Veiculo> consultaPorAno(int ano){
       List<Veiculo> result = new ArrayList();

       for(Veiculo v: veiculos){
            if (v.getAno() == ano){
                result.add(v);
            }
       }

       if(result.size() == 0)
        return null;
       return result;
    }

    public List<Veiculo> consultaPorTipo(String tipo){
        List<Veiculo> result = new ArrayList();
        tipo.toLowerCase();
        
        if(tipo == "passeio"){
            for(Veiculo v: veiculos){
                if(v instanceof VeiculoPasseio){
                    result.add(v);
                }
            }   
        }
        
        else if(tipo == "utilitario"){
            for(Veiculo v: veiculos){
                if(v instanceof VeiculoUtilitario){
                    result.add(v);
                }
            }   
        }

        else{
            for(Veiculo v: veiculos){
                if(v instanceof VeiculoPassageiros){
                    result.add(v);
                }
            }   
        }
        

        return null;
    }

}

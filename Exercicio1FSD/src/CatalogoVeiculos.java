import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogoVeiculos {

    //Lista de veiculos hard coded
    VeiculoUtilitario vu1 = new VeiculoUtilitario("BRA2E19", "Honda", "Civic", 2017, 107200.00, 5, 2); 
    VeiculoUtilitario vu2 = new VeiculoUtilitario("BRA3E20", "Honda", "Accord", 2020, 107201.00, 5, 2); 
    VeiculoUtilitario vu3 = new VeiculoUtilitario("BRA4E20", "Honda", "Fit", 2015, 107201.00, 5, 2); 
        


    List<Veiculo> veiculos = Arrays.asList(
        vu1, vu2, vu3,
        new Veiculo("BRA5E20", "Audi", "A3", 2006, 107201.00),
        new Veiculo("BRA6E20", "Effa", "K01", 2019, 107201.00),
        new Veiculo("BRA7E20", "Effa", "V25", 2020, 107201.00)
        );



    public List<Veiculo> consultaPorPlaca(String placa){
        List<Veiculo> result = new ArrayList();
        placa = placa.toLowerCase();

        for(int i = 0; i < veiculos.size(); i++) {
            if(placa.equals(veiculos.get(i).getPlaca().toLowerCase())){
                result.add(veiculos.get(i));
            }
        }
        return result;
    }

    public List<Veiculo> consultaPorMarca(String marca){
        List<Veiculo> result = new ArrayList();
        marca = marca.toLowerCase();

        for(int i = 0; i < veiculos.size(); i++){
            if(marca.equals(veiculos.get(i).getMarca().toLowerCase())){
                result.add(veiculos.get(i));
            }
        }

        return result;
    }

    public List<Veiculo> consultaPorAno(int ano){
       List<Veiculo> result = new ArrayList();

       for(Veiculo v: veiculos){
            if (v.getAno() == ano){
                result.add(v);
            }
       }

       return result;
    }

    // opções de tipo: "passageiros", "passeio", utilitario
    public List<Veiculo> consultaPorTipo(String tipo){

        return null;
    }

}

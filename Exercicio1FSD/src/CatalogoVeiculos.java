import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogoVeiculos {

    //Lista de veiculos hard coded
    List<Veiculo> veiculos = Arrays.asList(
        new Veiculo("BRA2E19", "Honda", "Civic", 2016, 107200.00), 
        new Veiculo("BRA3E20", "Honda", "Accord", 2016, 107201.00),
        new Veiculo("BRA3E20", "Honda", "Fit", 2016, 107201.00),
        new Veiculo("BRA3E20", "Audi", "A3", 2016, 107201.00),
        new Veiculo("BRA3E20", "Effa", "K01", 2016, 107201.00),
        new Veiculo("BRA3E20", "Effa", "V25", 2016, 107201.00)
        );



    public Veiculo consultaPorPlaca(String placa){
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

        return result;
    }

    public List<Veiculo> consultaPorAno(int ano){
        return null;
    }

    public List<Veiculo> consultaPorTipo(String tipo){
        return null;
    }

}

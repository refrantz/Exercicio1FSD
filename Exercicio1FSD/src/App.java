import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        /*
        // Feito para confirmar se o método funciona
        CatalogoVeiculos catalogo = new CatalogoVeiculos();
        List<Veiculo> testMarca = catalogo.consultaPorMarca("EFFA");
        // Teste do método consultaPorAno tambem
        List<Veiculo> testAno = catalogo.consultaPorAno(2020);

        for(int i=0;i<testMarca.size();i++){
            System.out.println("Marca EFFA: " + testMarca.get(i));
            System.out.println("Ano 2020: " + testAno.get(i));
        } 
        */


        CatalogoVeiculos catalogo = new CatalogoVeiculos();
        // Teste do método consultaPorPlaca
        Veiculo testPlaca = catalogo.consultaPorPlaca("BRA3E20");

        System.out.println("Placa: "+ testPlaca);

        // consultaPorTipo
        List<Veiculo> testTipo = catalogo.consultaPorTipo("utilitario");

        System.out.println("Tipo: ");
        for(int i=0; i < testTipo.size(); i++){
            System.out.println(testTipo.get(i));
        } 


    }
}

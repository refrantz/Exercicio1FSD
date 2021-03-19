import java.util.Scanner;

public class Menu extends CatalogoVeiculos {

    private static String r = "======== Sistema Consulta de Veiculos ========";
    private static String s = "Selecione o tipo de Veiculo para iniciar:";
    private static String t = "1: Veiculo de Passageiros | 2: Veiculo de Passeio | 3: Veiculo Utilitario:";

    public static void menu() {
        System.out.println(r);
        System.out.println(s);
        System.out.println(t);
    }
    
    public static void main() {
        int opcao;
        Scanner entrada = new Scanner(System.in);
        menu();
        do {
            opcao = entrada.nextInt();

            switch(opcao) {
                case 1:
                    //consultaVeiculoPassageiros();
                    System.out.println("opcao 1");
                    break;

                case 2:
                    //consultaVeiculoPasseio();
                    System.out.println("opcao 2");
                    break;

                case 3:
                    //consultaVeiculoUtilitario();
                    System.out.println("opcao 3");                    
                    break;

                case 0:
                    System.out.println("Fim da pesquisa");
                    break;

                default:
                    System.out.println("Opcao Invalida");
            }

        }while(opcao != 0);

    }
    
}

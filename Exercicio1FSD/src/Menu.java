import java.util.Scanner;

public class Menu {

    private static String r = "======== Sistema Consulta de Veiculos ========";
    private static String s = "Selecione o tipo de Veiculo para iniciar:";
    private static String t = "1: Veiculo de Passageiros \n2: Veiculo de Passeio \n3: Veiculo Utilitario:";
    private static String u = "0: Sair do sistema:";
    private static String v = "Selecione o modo de pesquisa: \n";
    private static String x = "1: Placa \n2: Marca \n3: Ano \n4: Tipo \n0: Finalizar pesquisa.";
    private static String z = "============================================================================";
    
    private static CatalogoVeiculos catalogo = new CatalogoVeiculos();

    public static void printInicio() {
        System.out.println();        
        System.out.println(r);
        System.out.println();
        System.out.println(s);
        System.out.println(t);
        System.out.println(u);
        System.out.println();
    }

    public static void printConsulta() {
        System.out.println(z);
        System.out.println(v);
        System.out.println(x);
        System.out.println();
    }
    
    public static void menuInicio() {
        int opcao;
        Scanner entrada = new Scanner(System.in);
        printInicio();
        do {
            opcao = entrada.nextInt();
            switch(opcao) {
                case 1:
                    System.out.println("Veiculo Passageiros");
                    menuConsulta(); // Falta separar por tipo a pesquisa, da pra fazer algo menuConsulta(opcao)
                    break;          

                case 2:
                    System.out.println("Veiculo Passeio");
                    menuConsulta();
                    break;

                case 3:
                    System.out.println("Veiculo Utilitario");
                    menuConsulta();                    
                    break;

                case 0:
                    System.out.println("Encerrando aplicacao");
                    return;

                default:
                    System.out.println("Opcao Invalida");
            }

        }while(opcao != 0);
    }

    public static void menuConsulta() {
        String consulta;
        int opcao;
        Scanner entrada = new Scanner(System.in);
        printConsulta();
        do {
            opcao = entrada.nextInt();
            switch(opcao) {
                case 1:
                    System.out.println("Digite a placa: ");
                    consulta = entrada.next();                    
                    retornaPlaca(consulta);
                    System.out.println(z);
                    break;

                case 2:
                    System.out.println("Digite a marca: ");
                    consulta = entrada.next();                    
                    retornaMarca(consulta);
                    System.out.println(z);
                    break;

                case 3:
                    System.out.println("Digite o ano: ");
                    consulta = entrada.next();                    
                    retornaAno(Integer.parseInt(consulta));
                    System.out.println(z);
                    break;
                
                case 4:
                    System.out.println("Digite o tipo: ");
                    consulta = entrada.next();
                    retornaTipo(consulta);
                    System.out.println(z);
                    break;

                case 0:
                    System.out.println("Fim da pesquisa \nVoltando ao menu anterior");
                    System.out.println(z);
                    menuInicio();
                    break;

                default:
                    System.out.println("Opcao Invalida");
            }
        }while(opcao != 0);
    }

    public static void retornaPlaca(String placa) {
        System.out.println(catalogo.consultaPorPlaca(placa));
    }

    public static void retornaMarca(String marca) {
        System.out.println(catalogo.consultaPorMarca(marca));
    }

    public static void retornaAno(int ano) {
        System.out.println(catalogo.consultaPorAno(ano));
    }

    public static void retornaTipo(String tipo) {
        System.out.println(catalogo.consultaPorTipo(tipo));
    }
    
}

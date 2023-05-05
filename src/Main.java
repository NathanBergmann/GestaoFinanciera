import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static int countGastos = 0;

    public static void main(String[] args) {
        AdicionarGastos adicionarGastos = new AdicionarGastos();
        AdicionaGanho a = new AdicionaGanho();
        int opcao = 0;
        int indexGanho = 0;
        int indexGasto = 0;
        Scanner entrada = new Scanner(System.in);

        while (opcao != 6) {
            System.out.println("----- Gestão Financeira -----");
            System.out.println("");
            System.out.println("1- Adicionar Gastos");
            System.out.println("2- Adicionar Ganho");
            System.out.println("3- Relatório de Gastos");
            System.out.println("4- Relatório de Ganhos");
            System.out.println("5- Relatório Mensal");
            System.out.println("6- Sair");

            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:// Gastos
                    //
                    countGastos = adicionarGastos.MainAdicionarGastos(countGastos);

                    break;
                case 2: //Ganhos

                    indexGanho = a.MainAdicionarGanho(indexGanho);
                    break;
                case 3: // Relatório Gastos
                    System.out.println("O número escolhido foi: 3.");
                    GastosView relatorioGastos = new GastosView(adicionarGastos);
                    relatorioGastos.MainRelatorioGastos();
                    break;
                case 4: // Relatório Ganhos
                    GanhosView relGanhos = new GanhosView();
                    AdicionaGanho b = new AdicionaGanho();
                    relGanhos.RelatorioGanhos(b.g, indexGanho);
                    break;
                case 5: // Saldo Mensal
                    System.out.println("O número escolhido foi: 5.");
                    break;
                case 6:
                    System.out.println("O número escolhido foi: 6.");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }
    }
}

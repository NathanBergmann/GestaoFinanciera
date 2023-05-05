import java.util.Scanner;

public class GastosView {
    private AdicionarGastos dadosGastos;

    private int mes;
    private int ano;
    public GastosView(AdicionarGastos dadosGastos){
        this.dadosGastos = dadosGastos;
    }
    public void MainRelatorioGastos() {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        System.out.println("----- Relatório de Gastos -----\n");
        while (opcao < 1 || opcao > 12) {
            System.out.println("Selecione o Mês: ");
            opcao = entrada.nextInt();
            if (opcao < 1 || opcao > 12) {
                System.out.println("Selecione um mês valido (1-12)");
            } else {
                this.mes = opcao;
            }
        }
        while (opcao < 2020 || opcao > 2099) {
            System.out.println("Selecione o Ano: ");
            opcao = entrada.nextInt();
            if (opcao < 2020 || opcao >= 2099) {
                System.out.println("Selecione um ano valido (2020 - 2099)");
            } else {
                this.ano = opcao;
            }
            relatorio(mes, ano);
        }
    }

    private void relatorio(int ano, int mes) {
         Gastos[] relatorioGastos = dadosGastos.getGasto();
        System.out.println("dadosGastos: " + relatorioGastos.length);
        System.out.println("Nome       Tipo      Data      Valor      Forma Pagamento");
        loop:
        for (int i = 0; i < 100 ; i++) {
            if (relatorioGastos[i] == null) {
            }else {
                System.out.println(relatorioGastos[i].toString());
            }
        }

    }
}

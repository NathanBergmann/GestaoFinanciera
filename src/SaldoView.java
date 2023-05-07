import java.util.Scanner;

public class SaldoView {
    int indexGanho;
    int indexGasto;
    double somaGanho;
    double somaGasto;
    double saldo;
    Scanner entrada = new Scanner(System.in);
    int mes;
    int ano;
    public void RelatorioSaldoMensal(Ganhos[] ganho, int indexGanho, Gastos[] gasto, int indexGasto){
        this.indexGasto = indexGasto;
        this.indexGanho = indexGanho;
        while (mes < 1 || mes > 12){
            System.out.println("Informe o mes do relatório:");
            mes = entrada.nextInt();
            if (mes < 1 || mes > 12) {
                System.out.println("O mês deve ser entre 1 e 12");
            }
        }
        System.out.println("Informe o ano do relatório:");
        ano = entrada.nextInt();
        getSomaGastos(gasto);
        getSomaGanho(ganho);
        getSaldo();

    }
    private void getSomaGanho(Ganhos[] ganho){
        for (int i = 0; i < indexGanho; i++){
            somaGanho += ganho[i].getValorGanho(mes,ano);
        }
    }
    private void getSomaGastos(Gastos[] gasto){
        for (int i = 0; i < indexGanho; i++){
            somaGasto += gasto[i].getValorGasto(mes,ano);
        }
    }
    private void getSaldo(){
        saldo = somaGanho + somaGanho;
        System.out.println("O saldo do mês é : R$" + saldo);
    }
}

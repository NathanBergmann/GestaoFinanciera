import java.util.Scanner;
public class GanhosView {
    Scanner entrada = new Scanner(System.in);
    int mes = 0;
    int ano = 0;
    int index = 0;
    public void RelatorioGanhos(Ganhos[] ganho, int index){
        this.index = index;
        System.out.println("------Relatório de Ganhos------");
        System.out.println("Informe o mês que deseja ver os ganhos:");
        while (mes < 1 || mes > 12){
            mes = entrada.nextInt();
            if (mes < 1 || mes > 12) {
                System.out.println("O mês deve ser entre 1 e 12");
            }
        }
        System.out.println("Informe o mês que deseja ver os ganhos:");
        ano = entrada.nextInt();
        showRelMes(ganho);
    }
    private void showRelMes(Ganhos[] ganho){
        System.out.println("Título: | Tipo Ganho: | Data Ganho: | Valor Ganho:");
        for (int i = 0; i < index; i++){
            String retorno = ganho[i].getGanho(mes, ano);
            System.out.print(retorno);
        }
    }
}

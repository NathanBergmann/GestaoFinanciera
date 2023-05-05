import java.util.Scanner;
import java.util.Date;
import java.text.*;
public class    AdicionaGanho {
    int opcaoGanho = 0;
    Scanner entrada = new Scanner(System.in);
    public Ganhos[] g = new Ganhos[100];
    String Nome;
    Date Data;
    double Valor;
    String TipoGanho;
    int indexGanhos;

    public int MainAdicionarGanho(int indexGanhos){
        this.indexGanhos = indexGanhos;
        while (opcaoGanho != 99) {
            System.out.println("----- Menu de Ganhos -----");
            System.out.println("1- Salário");
            System.out.println("2- Freelancer");
            System.out.println("3- Dividendos");
            System.out.println("99- Sair");

            opcaoGanho = entrada.nextInt();
            switch (opcaoGanho) {

                case 1:
                    TipoGanho = "Salário";
                    setParametros();
                    break;
                case 2:
                    TipoGanho = "Freelancer";
                    setParametros();
                    break;
                case 3:
                    TipoGanho = "Dividendos";
                    setParametros();
                    break;
                case 99:
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }
        return indexGanhos;
    }
    private void setParametros(){
        System.out.println("Informe o título do ganho");
        Nome = entrada.next();
        System.out.println("Informe o valor do ganho");
        Valor = entrada.nextDouble();
        System.out.println("Informe a data do ganho");
        String dataTemp = entrada.next();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Data = formato.parse(dataTemp);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        sendParametros();
    }
    private void sendParametros(){
        g[indexGanhos] = new Ganhos();
        g[indexGanhos].setGanho(Nome,TipoGanho, Data, Valor);
        System.out.println(g[indexGanhos].getGanho(4,2023));
        indexGanhos ++;
    }
}

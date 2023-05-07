import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class AdicionarGastos {
    private int opcaoGasto = 0;
    private String nome;
    private String descricao;
    private LocalDate data;
    private String formaPagamento;
    private String dataTemp;
    private Double valor;
    private int countGastos;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private int opcaoPagamento = 0;

    //Gastos gastos = new Gastos();
    public Gastos[] gasto = new Gastos[100];

    public int MainAdicionarGastos(int posVetor) {

        Scanner entrada = new Scanner(System.in);
        this.countGastos = posVetor;
        while (opcaoGasto != 99) {
            System.out.println("----- Adicionar Gasto -----");
            System.out.println("");
            System.out.println("1- Habitação");
            System.out.println("2- Entreterimento");
            System.out.println("3- Alimentação");
            System.out.println("4- Transporte");
            System.out.println("5- Lazer");
            System.out.println("99- Sair");


            opcaoGasto = entrada.nextInt();
            switch (opcaoGasto) {

                case 1:
                    descricao = "Habitação";
                    setParametosGastos();
                    break;
                case 2:
                    descricao = "Entreterimento";
                    setParametosGastos();
                    break;
                case 3:
                    descricao = "Alimentação";
                    setParametosGastos();
                    break;
                case 4:
                    descricao = "Transporte";
                    setParametosGastos();
                    break;
                case 5:
                    descricao = "Lazer";
                    setParametosGastos();
                    break;
                case 99:
                    break;
                default:
                    System.out.println("Opção Inválida");
            }

        }
        return countGastos;
    }

    private void setParametosGastos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o Nome do seu Gasto: ");
        nome = entrada.next();
        System.out.println("Informe a data de Saída: ");
        dataTemp = entrada.next();
        System.out.println("Informe o valor: ");
        valor = entrada.nextDouble();
        data = LocalDate.parse(dataTemp, formatter);

        while (opcaoPagamento != 1 && opcaoPagamento != 2 && opcaoPagamento != 3) {
            System.out.println("Informe a opção de Pagamento:");
            System.out.println("1 - Cheque");
            System.out.println("2 - Pix");
            System.out.println("3 - Débito");
            opcaoPagamento = entrada.nextInt();
            if (opcaoPagamento == 1) {
                formaPagamento = "Cheque";
            } else if (opcaoPagamento == 2) {
                formaPagamento = "Pix";
            } else if (opcaoPagamento == 3) {
                formaPagamento = "Débito";
            } else {
                System.out.println("Opção Inválida.");
            }
        }

        sendParametrosGastos();
        return;
    }

    private void sendParametrosGastos() {
        gasto[countGastos] = new Gastos();
        gasto[countGastos].setGasto(nome, descricao, data, formaPagamento, valor);
        countGastos++;
    }

    public Gastos[] getGasto() {
        return gasto;
    }
}

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Gastos {

    private String Nome;
    private String Descricao;
    private LocalDate Data;
    private String FormaPagamento;
    private Double Valor;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void setGasto(String nome, String descricao, LocalDate data, String formaPagamento, Double valor) {

        this.Nome = nome;
        this.Descricao = descricao;
        this.Data = data;
        this.FormaPagamento = formaPagamento;
        this.Valor = valor;
        System.out.println("Cadastrado: " + Nome + " " + Descricao + " " + formatter.format(Data) + " " + FormaPagamento + " " + valor);
        return;
    }

    public String getGastosMes(int mes, int ano) {
        String retorno = "";
        for (int i = 0; i <= 100; i++) {
            if (Data.getMonthValue() == mes && Data.getYear() == ano) {
                retorno = Nome + " " + " " + Descricao + " " + " " + Data + " " + FormaPagamento + "\n";
            }
        }
        return retorno;
    }
    public double getValorGasto(int mes, int ano){
        double valorGastoMes = 0;
        if (Data.getMonthValue() == mes && Data.getYear() == ano){
            valorGastoMes = Valor;
        }
        return valorGastoMes;
    }

    public String toString(){
        String retorno = "";
        retorno = Nome + " " + " " + Descricao + " " + " " + formatter.format(Data) + " " + Valor + " " + FormaPagamento + "\n";
        return retorno;
    }
}



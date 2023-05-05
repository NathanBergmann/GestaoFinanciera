import java.text.SimpleDateFormat;
import java.util.Date;


public class Gastos {

    private String Nome;
    private String Descricao;
    private Date Data;
    private String FormaPagamento;
    private Double Valor;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    public void setGasto(String nome, String descricao, Date data, String formaPagamento, Double valor) {

        this.Nome = nome;
        this.Descricao = descricao;
        this.Data = data;
        this.FormaPagamento = formaPagamento;
        this.Valor = valor;
        System.out.println("Cadastrado: " + Nome + " " + Descricao + " " + formato.format(Data) + " " + FormaPagamento + " " + valor);
        return;
    }

    public String getGastosMes(int mes, int ano) {
        String retorno = "";
        for (int i = 0; i <= 100; i++) {
            if (Data.getMonth() == mes && Data.getYear() == ano) {
                retorno = Nome + " " + " " + Descricao + " " + " " + Data + " " + FormaPagamento + "\n";
            }
        }
        return retorno;
    }

    public String toString(){
        String retorno = "";
        retorno = Nome + " " + " " + Descricao + " " + " " + formato.format(Data) + " " + Valor + " " + FormaPagamento + "\n";
        return retorno;
    }
}



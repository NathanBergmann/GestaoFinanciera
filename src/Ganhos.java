import java.text.*;
import java.util.Date;
public class Ganhos {
    private String NomeGanho;
    private String DescricaoGanho;
    Date DataGanho;
    private double ValorGanho;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    public void setGanho(String nomeGanho, String descricaoGanho, Date dataGanho, double valorGanho){
        this.NomeGanho = nomeGanho;
        this.DescricaoGanho = descricaoGanho;
        this.DataGanho = dataGanho;
        this.ValorGanho = valorGanho;
    }
    public String getGanho(int mes, int ano){
        String retorno = "";
        if (DataGanho.getMonth()+1 == mes && DataGanho.getYear() == ano) {
            System.out.println("Entrou no if");
            retorno = NomeGanho + " | " + DescricaoGanho + " | " + formato.format(DataGanho) + " | " + ValorGanho + "\n";
        }
        return retorno;
    }
    public String getNome(){
        return NomeGanho;
    }

}

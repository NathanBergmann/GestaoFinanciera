import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Ganhos {
    private String NomeGanho;
    private String DescricaoGanho;
    private LocalDate DataGanho;
    private double ValorGanho;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void setGanho(String nomeGanho, String descricaoGanho, LocalDate dataGanho, double valorGanho){
        this.NomeGanho = nomeGanho;
        this.DescricaoGanho = descricaoGanho;
        this.DataGanho = dataGanho;
        this.ValorGanho = valorGanho;
    }
    public String getGanho(int mes, int ano){
        String retorno = "";
        if (DataGanho.getMonthValue() == mes && DataGanho.getYear() == ano) {
            retorno = NomeGanho + " | " + DescricaoGanho + " | " + formatter.format(DataGanho) + " | " + ValorGanho + "\n";
        }
        return retorno;
    }
    public double getValorGanho(int mes, int ano){
        double valorGanho = 0;
        if (DataGanho.getMonthValue() == mes && DataGanho.getYear() == ano){
            valorGanho = this.ValorGanho;
        }
        return valorGanho;
    }

}

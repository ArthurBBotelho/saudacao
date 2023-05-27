
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
public class saudacao {
    public static void main(String[] args){
        //Olá, {nome}! Hoje é {diaDaSemana}, BOM DIA!

        String nome = "Arthur";

        //ISO 8601
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt","BR");
        //Locale brasil = new Locale("pt","BR");

        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

        String saudacao;

        LocalDateTime agora = LocalDateTime.now();

        //Condição para saudação ser BOM DIA ou BOA TARDE ou BOA NOITE
        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "boa noite";
        }   else {
            saudacao = "bem-vindo";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());

    }
}

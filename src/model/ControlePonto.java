package model;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ControlePonto {

    public String registraEntrada(Funcionario f) {
        LocalDateTime agora = LocalDateTime.now();
        String horarioEntrada = agora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        return "Horário de entrada do funcionário " + f.getNome() + ": " + horarioEntrada;
    }
    public String registraSaida(Funcionario f) {
        LocalDateTime agora = LocalDateTime.now();
        String horarioSaida = agora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        return "Horário de saída do funcionário " + f.getNome() + ": " + horarioSaida;
    }
}

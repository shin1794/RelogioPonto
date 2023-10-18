import model.ControlePonto;
import model.Gerente;
import model.Operador;
import model.Secretaria;


import java.util.Scanner;

public class GerenciarControlePonto {

    public static void main(String[] args) throws InterruptedException {
        Gerente gerente = new Gerente();
        gerente.setNome("João");
        gerente.setIdFunc(12345);

        Secretaria secretaria = new Secretaria();
        secretaria.setNome("Maria");
        secretaria.setRamal("67890");

        Operador operador = new Operador();
        operador.setNome("Ana");
        operador.setIdFunc(98765);

        ControlePonto controlePonto = new ControlePonto();

        // Registrando a entrada do Gerente
        System.out.println(controlePonto.registraEntrada(gerente));
        Thread.sleep(1000); // Aguardando 1 segundo

        // Registrando a entrada da Telefonista
        System.out.println(controlePonto.registraEntrada(secretaria));
        Thread.sleep(1000); // Aguardando 1 segundo

        // Registrando a entrada da Secretaria
        System.out.println(controlePonto.registraEntrada(operador));
        Thread.sleep(1000); // Aguardando 1 segundo

        // Registrando a saída do Gerente
        System.out.println(controlePonto.registraSaida(gerente));
        Thread.sleep(1000); // Aguardando 1 segundo

        // Registrando a saída da Telefonista
        System.out.println(controlePonto.registraSaida(secretaria));
        Thread.sleep(1000); // Aguardando 1 segundo

        // Registrando a saída da Secretaria
        System.out.println(controlePonto.registraSaida(operador));
        Thread.sleep(1000); // Aguardando 1 segundo
    }
}
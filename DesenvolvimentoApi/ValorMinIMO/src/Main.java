// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Implemente o código para  ler as 3 transações:
        // Esses valores representam as transações realizadas.
        // Armazene cada valor no array `transacoes` para processá-los depois.
        List<Double> transacoes = new ArrayList<>();
        for(int i=0; i < 3; i++){
            System.out.println("Digite o valor para a " + (i+1) + " transacao");
            double transacao = scanner.nextDouble();
            transacoes.add(transacao);
        }

        // TODO: Realize a leitura do valor mínimo (4ª entrada):
        // Este valor será usado como o critério para contar as transações maiores que ele.
        System.out.println("Digite o valor mínimo");
        double valorMinimo = scanner.nextDouble();
        int contador = 0;

        // TODO: Conte as transações maiores que o valor mínimo e verifique se cada valor no array `transacoes`:
        // Caso o valor seja maior que o `valorMinimo`, incrementem o contador.
        contador = (int) transacoes.stream().filter(t -> t > valorMinimo).count();

        System.out.println(contador);
    }
}
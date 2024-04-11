import java.util.Scanner;

public class ConsumoEnergia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] consumo = new double[12];
        String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro" };

        double total = 0;
        int maior = 0, menor = 0;

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        for (int i = 0; i < 12; i++) {
            System.out.println("Digite o consumo de energia para o mês de " + meses[i] + ":");
            consumo[i] = scanner.nextDouble();
            total += consumo[i];

            if (consumo[i] > consumo[maior]) {
                maior = i;
            }

            if (consumo[i] < consumo[menor]) {
                menor = i;
            }
        }

        System.out.println("Nome do aluno: " + nome);
        System.out.println("Valor total gasto no ano: " + total);
        System.out.println("Mês com maior consumo: " + meses[maior]);
        System.out.println("Mês com menor consumo: " + meses[menor]);
    }
}

import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        double peso;
        double agua = 0.035;
        Scanner input = new Scanner(System.in);
        System.out.print("Qual o seu peso: ");
        peso = input.nextDouble();
        double aguaPerPeso = agua*peso;
        System.out.print("Para o seu peso o ideal é consumir: " + df.format(aguaPerPeso) + "L de água por dia");

        System.out.print("Digite a coordenada x1 do ponto P1: ");
        double x1 = input.nextDouble();
        System.out.print("Digite a coordenada y1 do ponto P1: ");
        double y1 = input.nextDouble();
        System.out.print("Digite a coordenada x2 do ponto P2: ");
        double x2 = input.nextDouble();
        System.out.print("Digite a coordenada y2 do ponto P2: ");
        double y2 = input.nextDouble();
        double dx = x1 - x2;
        double dy = y1 - y2;
        double dx2 = dx * dx;
        double dy2 = dy * dy;
        double somaQuadrados = dx2 + dy2;
        double distancia = Math.sqrt(somaQuadrados);
        System.out.printf("A distância entre os pontos P1 e P2 é: %.2f%n", distancia);

        System.out.println("Vamos tirar a média.");
        System.out.print("Digite a nota da primeira avaliação: ");
        double nota1 = input.nextDouble();
        System.out.print("Digite a nota da segunda avaliação: ");
        double nota2 = input.nextDouble();
        System.out.print("Digite a nota da terceira avaliação: ");
        double nota3 = input.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.printf("Aprovado. Média: %.2f%n", media);
        } else {
            System.out.printf("Reprovado. Média: %.2f%n", media);
        }

        System.out.print("Digite o número de votos brancos: ");
        int votosBrancos = input.nextInt();
        System.out.print("Digite o número de votos nulos: ");
        int votosNulos = input.nextInt();
        System.out.print("Digite o número de votos válidos: ");
        int votosValidos = input.nextInt();

        int totalEleitores = votosBrancos + votosNulos + votosValidos;

        double percentualBrancos = (double) votosBrancos / totalEleitores * 100;
        double percentualNulos = (double) votosNulos / totalEleitores * 100;
        double percentualValidos = (double) votosValidos / totalEleitores * 100;

        System.out.printf("Percentual de votos brancos: %.2f%%%n", percentualBrancos);
        System.out.printf("Percentual de votos nulos: %.2f%%%n", percentualNulos);
        System.out.printf("Percentual de votos válidos: %.2f%%%n", percentualValidos);

        System.out.println("\nQual sua idade?");
        int idade = input.nextInt();
        if (idade >= 16 && idade < 17) {
            System.out.println("Eleitor facultativo.");
        } else if (idade >= 18 && idade < 65) {
            System.out.println("Eleitor obrigatório.");
        } else if (idade > 65) {
            System.out.println("Eleitor facultativo.");
        } else {
            System.out.println("Não eleitor");
        }
    }
    }

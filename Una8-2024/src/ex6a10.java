import java.util.Scanner;

public class ex6a10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroA;
        int numeroB;
        System.out.print("Digite um valor: ");
        numeroA = input.nextInt();
        System.out.print("Digite outro valor: ");
        numeroB = input.nextInt();
        int temp = numeroA;
        numeroA = numeroB;
        numeroB = temp;
        System.out.println("Os números invertidos são: " + numeroA + " e " + numeroB);

        System.out.print("Vamos converter as temperaturas de Fahrenheit para Celsius.\nQual a temperatura em Fahrenheit: ");
        double F;
        F = input.nextDouble();
        double C =  (F-32)/1.8;
        System.out.printf("A temperatura é de: %.2f°C", C);

        System.out.print("\nQuantas canetas você comprou? ");
        int canetas;
        canetas = input.nextInt();
        System.out.print("Qual foi a nota que você usou? ");
        int nota;
        nota = input.nextInt();
        System.out.print("E qual foi o troco? ");
        double troco;
        troco = input.nextDouble();
        double valorCaneta = (nota-troco)/canetas;
        System.out.printf("Cada caneta custou R$%.2f", valorCaneta);
        double gasolina;
        double etanol;
        System.out.print("\nQual o valor da Gasolina? ");
        gasolina = input.nextDouble();
        System.out.print("Qual o valor do Etanol? ");
        etanol = input.nextDouble();
        double diferenca = (etanol/gasolina);
        if (diferenca <= 0.70){
            System.out.println("Abasteça com alcool!");
        } else {
            System.out.println("Abasteça com gasolina");
        }
        double comprimento;
        double largura;
        System.out.print("\nInforme o comprimento da área: ");
        comprimento = input.nextDouble();
        System.out.print("informe a largura da área: ");
        largura = input.nextDouble();
        double area = comprimento*largura;
        System.out.printf("A área informada é de: %.2fM.", area);
        double areaCeramica = area+(area*0.10);
        double ceramica = 5.25;
        double valorCeramica = ceramica*areaCeramica;
        System.out.printf("\nPara essa área indicamos um total de: %.2fM. Saindo a: %.2fR$ e com um total de: %.2fR$.\n",
                areaCeramica, ceramica, valorCeramica);




    }
    }

import java.util.Scanner;

public class ex01a05 {
    public static void main(String[] args) {
      int numerox;
      int numeroy;
      Scanner input = new Scanner(System.in);
        System.out.print("Diga um número: ");
        numerox = input.nextInt();
        System.out.print("Diga outro número: ");
        numeroy = input.nextInt();
        int resto = numerox%numeroy;
        System.out.println("O valor para o resto da divisão é: " + resto);
        System.out.println("Agora vamos trabalhar com valores monetários.");
        System.out.print("Digite um valor em R$:");
        double real;
        real = input.nextDouble();
        double dolar = real*4.95;
        System.out.println("O valor digitado em R$ é: R$" + real + " Que equivale a US$" + dolar +".");
        System.out.print("Para nosso próximo teste vamos trabalhar com a área de um círculo.\n Esqueva o raio do círculo:");
        double raio;
        raio = input.nextFloat();
        double pi = Math.PI;
        double area = pi*(raio*raio);
      System.out.println("A área do círculo informada é de: " + area);
      double nota1;
      double nota2;
      double nota3;
      System.out.println("Agora vamos calcular a média de três notas desse semestre do aluno X.\nEntre com três notas de provas:");
      nota1 = input.nextDouble();
      nota2 = input.nextDouble();
      nota3 = input.nextDouble();
      double media = (nota1+nota2+nota3)/3;
      System.out.println("A média para essas notas é: " + media);
      System.out.println("Para terminar... Vamos calcular o salário líquido de Joãozin.");
      double vlrhora;
      System.out.println("Entre com o valor do salario hora do Joãozinho: ");
      vlrhora = input.nextDouble();
      int horaT;
      System.out.println("Entre com quantas horas o joãozinho trabalhou nesse mês: ");
      horaT = input.nextInt();
      double inss;
      System.out.println("Por último o valor do desconto do inss: ");
      inss = input.nextDouble();
      double salarioBruto = vlrhora*horaT;
      double inssReal = salarioBruto*(inss/100);
      double salarioLiquido = salarioBruto-inssReal;
      System.out.println("O total bruto do seu salário é de:R$ " + salarioBruto + "\nE seu desconto do inss tem o valor de: R$" + inssReal + "\nJoãozinho recebeu um valor líquido de:R$ " + salarioLiquido + ".");

      input.close();
    }
}

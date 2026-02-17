//treino de Lógica de Porgramação

public class main {
  public static void main(String[] args) {
    int salario = 2743;
    int horas = 192;
    int valorHora = salario / horas;
    System.out.println("Ele ganha por hora: R$" + valorHora);

    //Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

    double n1 = 300.0;
    double porcentagem1 = 0.05;
    double resultado1 = n1 * porcentagem1;
    System.out.println("O valor da: " + resultado1);
    
    int n2 = 300;
    double porcentagem2 = 5.0 / 100; 
    int resultado2  = (int) (n2 * porcentagem2); // (int) = conversão explícita
    System.out.println("O valor da: " + resultado2);

    //Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição de acordo com a tabela abaixo:

    double altura = 1.75;
    double peso = 87.5;
    double imc = peso / (altura * altura);
    imc = Math.round(imc * 100.0) / 100.0;
    System.out.println("O imc da pessoa é: " + imc);

    // Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

    double nota1 = 7.5; 
    double nota2 = 8.7;
    double nota3 = 6.1;
    double resultado3 = (nota1 + nota2 + nota3) / 3;
    resultado3 = Math.round(resultado3 * 100.0) / 100.0;
    System.out.println ("sua média foi: " + resultado3);

    //Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.

    double m1 = 7.8;
    double m2 = 7.3;
    double m3 = 5.1;
    double m4 = 7.5;
    double resultado4 = (m1 + m2 + m3 + m4) / 4;
    resultado4 = Math.round (resultado4* 100.0) / 100.0;
    if (resultado4 < 7.0) {
      System.out.println("Você foi reprovado com a média " + resultado4);
      
    } else {
      System.out.println("Você foi aprovado com a média " + resultado4);
    }

    
/* Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
Tabela de Código de Condições de Pagamento

 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto

 2 - À Vista no cartão de crédito, recebe 10% de desconto

 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros

 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%

*/

    int valorP = 349;
    int op = 4;

    if (op == 1) {
      double desconto1 = valorP * (15.0 / 100);
      int total1 = (int) (valorP - desconto1);
      System.out.println("O valor será de R$ " + total1);
    } 
    if (op == 2) {
      double desconto2 = valorP * (10.0 / 100);
      int total2 = (int) (valorP - desconto2);
      System.out.println("O valor será de R$ " + total2);
    } 
    if (op == 3) {
       double parcela1 = valorP / 2;
       System.out.println("2x de R$: " + parcela1);
    }
    if (op == 4) {
    double valorBaseParcela = valorP / 3;
    double parcelaComJuros = valorBaseParcela + (valorBaseParcela * (10.0/100));
    System.out.println ("2x de R$ " + (int) valorBaseParcela + " + " + (int)parcelaComJuros);
    } else { 
      System.out.println("Opcão Inválida");
    }
  }
}

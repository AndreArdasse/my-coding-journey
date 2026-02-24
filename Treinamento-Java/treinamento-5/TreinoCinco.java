//Operadores

public class TreinoCinco {
  public static void main(String[] args) { //psvm
    //Operadores
    // + - / *
    int numero01 = 10;
    int numero02 = 20;
    double resultado = numero01 / numero02;
    resultado = (double) numero01 / numero02;
    System.out.println(resultado);

    //Resto - %

    int resto = 21 % 7;
    System.out.println(resto);

    //Lógicos < >, <= >= (< / > =), ==, != (! =)

    boolean isDezMaiorQueVinte = 10 > 20;
    boolean isDezMenorQueVinte = 10 < 20;
    boolean isDezIgualVinte= 10 == 20;
    boolean isDezDiferneteVinte = 10 != 20;
    System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
    System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
    System.out.println("isDezIgualVinte " + isDezIgualVinte);
    System.out.println("isDezDiferenteVinte " + isDezDiferneteVinte);

    //&& (and) || (or) !
    int idade = 29;
    float salario1 = 3500F;
    boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario1 > 4612;
    boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario1 < 3881;
    System.out.println("isDentroDaLei " + isDentroDaLeiMaiorQueTrinta);
    System.out.println("IsDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

    double valorTotalContaCorrente = 4700;
    double valorTotalContaPoupanca = 3700;
    float valorPlayStation = 5000F;
    boolean isPsFiveCompravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPoupanca > valorPlayStation;

    System.out.println(isPsFiveCompravel);

      // = += -= *= /= %=

    double bonus = 1800;
    bonus += 1000;
    bonus -= 500;
    bonus *= 2;
    bonus /= 3;
    bonus = Math.round(bonus * 10.0) / 10.0;
    System.out.println(bonus);

    //

    int contador = 0;
    contador += 1; // contador = contador 
    contador++;
    int contador2 = 0;
    System.out.println(contador);
    System.out.println(contador2++);
  }
}

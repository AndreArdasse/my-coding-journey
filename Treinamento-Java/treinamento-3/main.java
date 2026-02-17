public class main {
    public static void main(String[ ] args) {
      System.out.println("Esse é meu segundo treinamento");

      //tipos de dados primitivos
      int idade = 25; // int representa um número inteiro
      double altura = 1.75; //representa um número real 
      double peso = 80.7;
      double imc = peso / (altura*altura);
      char genero = 'M'; // char representa um caractere
      boolean ativo = true; //boolean representa um valor logico
      long salario = 2709; // long representa um numero que maior que o int (mais processamento)

      System.out.println("Idade: " + idade);
      System.out.println("Altura: " + altura);
      System.out.println("Gênero: " + genero);
      System.out.println("Ativo " + ativo);
      System.out.println("Salário: " + salario);

       // Converter IMC para 2 casas decimais
      
       imc = Math.round(imc * 100.0) / 100.0;
       System.out.println("IMC: " + imc);

       //Converter Inteiro para decimal

       int n = 10;
       double numeroDecimal = n;
       System.out.println("Número decimal: " + numeroDecimal);

       int a = 50;
       double b = 2.0;

       double resultado = b / a;
       System.out.println("Resultado: " + resultado);

       char c = '9';
       int d = 10; 
       int e = d + Integer.parseInt(String.valueOf(c)); //converter para inteiro
       System.out.println("E: " + e);

       //Diferença entre String e Char -
      //char não suporta mais de um caractere
       String ola = "Olá";
       char o = 'o';
       String oi = ola + " " + o;

       System.out.println(oi);
    }  
}

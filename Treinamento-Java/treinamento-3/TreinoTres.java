public class TreinoTres {
    public static void main(String[ ] args) {
      System.out.println("Esse é meu segundo treinamento");

      //tipos de dados primitivos: int, double, char, byte, short, long, boolean 


      int idade = (int) 10000000000L; // int representa um número inteiro
      double altura = 1.75; //representa um número real 
      double peso = 80.7; //valores decimais 8 bytes
      double imc = peso / (altura*altura); 
      char genero = 'M'; // char representa um caractere / ! Tabela ASCII / ! Unicode 
      boolean ativo = true; //boolean representa um valor logico
      long salario = 2575; // long representa um numero que maior que o int (mais processamento)
      float salarioFloat = 2500.5F; //Valores decimais 4 bytes / Uso de F ao fim
      byte idadeByte= 10;
      short idadeKid = 100;
      


      System.out.println("Idade: " + idade);
      System.out.println("Altura: " + altura);
      System.out.println("Gênero: " + genero);
      System.out.println("Ativo: " + ativo);
      System.out.println("Salário: " + salario);
      System.out.println("Salário Float: " + salarioFloat);
      System.out.println("Idade Byte: " + idadeByte);
      System.out.println("Idade Kid: " + idadeKid);

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
       String mundo = "mundo";
       String oi = ola + " " + mundo;

       System.out.println(oi);

    }  
        
}

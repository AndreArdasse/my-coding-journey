#include <stdio.h>

int main() {
    float distancia, preco, gasto_total;
    
    printf("Digite a distância da viagem em quilômetros: ");
    scanf("%f", &distancia);
    
    printf("Digite o preço do litro do combustível: ");  
    scanf("%f", &preco);
    
    gasto_total = (distancia / 10) * preco;
    
    printf("Valor total a ser gasto com combustível: %.2f\n", gasto_total);
    
    return 0;
}
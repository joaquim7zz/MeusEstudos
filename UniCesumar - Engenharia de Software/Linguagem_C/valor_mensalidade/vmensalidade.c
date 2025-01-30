#include <stdio.h>

int main () 
{
    char nome[30];
    int idade;

    printf("Informe o nome: \n ");
    scanf("%s", &nome); /// %s é usado para ler uma string
    printf("Informe a indade: \n");
    scanf("%d", &idade);

    printf("-------------------------------------------- \n");
    printf("Nome: %s \n", nome);
    printf("Idade: %d \n", idade);

    if (idade <= 18)
    {
        printf("O valor do plano e: R$ 50,00 \n");
    } 
    else if ((idade >= 19 ) && (idade <= 29)) {
        printf("O valor do plano e: R$ 70,00");
    } 
    else if ((idade >= 30) && (idade <= 40)) {
        printf("O valor do plano e: R$ 90,00");
    }
    else if ((idade >= 46) && (idade <= 65)) {
        printf("O valor do plano e: R$ 130,00");
    }
    else
    {
        printf("O valor do plano e: R$ 170,00");
    }

    
    
    return 0;
    
}
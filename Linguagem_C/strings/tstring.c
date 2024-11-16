#include <stdio.h>
#include <string.h> // Biblioteca para manipular strings

int main ()
{
    char nome[80]; // Buffer para armazenar a string
    int tamanho;
    printf("Digite seu nome completo: ");
    //get(nome) não é mais utilizada por questão de segurança
    fgets(nome, sizeof(nome), stdin);   // Lê até 79 caracteres + '\0'

    nome[strcspn(nome, "\n")] = '\0'; // Remove o '\n' que fgets inclui, se presente

    tamanho = strlen(nome);

    printf("O comprimento do nome e: %d \n", tamanho);

    return 0;
}
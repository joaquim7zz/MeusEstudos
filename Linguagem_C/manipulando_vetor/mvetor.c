#include <stdio.h>

int main () 
{
    int vetorA[5];
    int i;

    for (i = 0; i < 5; i++)
    {
        printf("Digite o %d elemento do vetor: \n", i);
        scanf("%d", &vetorA[i]);
    }

    printf("Vetor preenchido \n");
    for ( i = 0; i < 5; i++)
    {
        printf("O elemento da posicao %d e: %d \n", i, vetorA[i]);
    }
    
    return 0;
}
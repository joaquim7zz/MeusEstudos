#include <stdio.h>
#include <math.h>

int main () 
{
    int num;
    float raiz;

    printf("\n Digite um numero inteiro: ");
    scanf("%d", &num);
    if (num % 2 == 0)
    {
        raiz = sqrt(num);
        printf("\n Raiz quadrada e: %.3f ", raiz);

    }

    return 0;
}
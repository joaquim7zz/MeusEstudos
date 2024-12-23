#include <stdio.h>

int main ()
{
    int vetorA[10];
    int i, acha, busca;

    for (i = 0; i < 10; i++)
    {
        printf("Digite o %d elemento: \n", i);
        scanf("%d", &vetorA[i]);
    }

    printf("Informe o elemento que deseja buscar: \n");
    scanf("%d", &busca);
    i = 0;
    acha = 0;

    while ((acha == 0) && (i < 10))
    {
        if (vetorA[i] == busca)
        {
            acha = 1;
        }
        else 
        {
            i++;
        }
    }

    if (acha == 1)
    {
        printf("O elemento %d foi encontrado na posicao %d. \n", busca, i);
    }
    else
    {
        printf("O elemento não foi encontrado.");
    }

    return 0;

}

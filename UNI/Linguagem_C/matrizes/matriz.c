#include <stdio.h>

int main ()
{
    int matrizA[2] [10]; 
    int i, j;
    
    for ( i = 0; i < 2; i++)
    {
        for ( j = 0; j < 10; j++)
        {
            printf("Insira o elemento da linha %d, coluna %d: \n", i, j);
            scanf("%d", &matrizA[i] [j]);
        }
        
    }
    for ( i = 0 ; i < 2 ; i++)
    {
        for ( j = 0; j < 10; j++)
        {
            printf("O elementoda linha %d, coluna %d e: %d \n", i, j, matrizA[i] [j]);
        }
        
    }

    return 0;
    
}
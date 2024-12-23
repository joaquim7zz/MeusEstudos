#include <stdio.h>

int main () 
{
    float nota, soma, media;
    int i, cod, naprovados, nreprovados, nnotas;

    naprovados = 0;
    nreprovados = 0;

    printf("Iforme a quantidade de provas: \n");
    scanf("%d", &nnotas);

    do
    {
        printf("Informe o codigo do aluno: \n");
        scanf("%d", &cod);

        soma = 0;
        
        if (cod > 0 )
        {
            for (i = 1; i <= nnotas; i++) 
            {
                printf("Informe a %d nota: \n", i);
                scanf("%f", &nota);
                soma= soma + nota;
            }

            media = soma / nnotas;
            if (media >= 6) 
            {
                printf("Aluno %d APROVADO \n", cod);
                naprovados ++;
            } else 
            {
                printf("Aluno %d REPROVADO \n", cod);
                nreprovados ++;
            }

        }        

    } while (cod != 0); 
    printf("A quantidade de alunos aprovados: %d \n", naprovados);
    printf("A quantidade de alunos reprovados: %d \n", nreprovados);

    return 0;
}
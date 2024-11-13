#include <stdio.h>
#include <stdlib.h>

void limpaTela()
{
#ifdef _WIN32
    system("cls");
#else
    system("clear");
#endif
}


int main()
{
    float num1, num2, resp;
    int operador, funcao, fatorial, numf;
    char continuar;

    do
    {

        printf("------------------------------ \n");
        printf("          CALCULADORA          \n");
        printf("------------------------------ \n");

        printf("O funcao deseja utilizar? \n");
        printf("[ 1 TABUADA ] [2 CALCULADORA ] [ 3 FATORIAL ] \n");
        scanf("%d", &funcao);
        printf("------------------------------ \n");

        limpaTela();

        while (funcao < 1 || funcao > 3)
        {
            printf("Digite um numero referente a uma funcao valida: \n");
            scanf("%d", &funcao);
        }

        if (funcao == 1)
        {
            printf("Digite o numero para ver sua tabuada: \n");
            scanf("%f", &num1);

            printf("Tabuada do %.2f: \n", num1);

            for (int i = 1; i <= 10; i++)
            {
                printf("%.1f x %d = %.1f\n", num1, i, num1 * i);
            }
        }
        else if (funcao == 2)
        {
            printf("Digite o operador [ 1 soma ], [ 2 subtracao ] , [ 3 multiplicacao ], [ 4 divisao ]: \n");
            scanf("%d", &operador);

            while (operador < 1 || operador > 4)
            {
                printf("Digite um numero referente a um operador valido. \n");
                scanf("%d", &operador);
            }

            printf("Digite o primeiro numero: \n");
            scanf("%f", &num1);
            printf("Digite o segundo numero: \n");
            scanf("%f", &num2);

            switch (operador)
            {
            case 1:
                resp = num1 + num2;
                printf("A soma entre %.1f e %.1f e %.1f \n", num1, num2, resp);
                break;
            case 2:
                resp = num1 - num2;
                printf("A subtracao entre %.1f e %.1f e %.1f. \n", num1, num2, resp);
                break;
            case 3:
                resp = num1 * num2;
                printf("A multiplicacao entre %.1f e %.1f e %.1f \n", num1, num2, resp);
                break;
            case 4:
                if (num2 != 0)
                {
                    resp = num1 / num2;
                    printf("A divisao entre %.1f e %.1f e %.1f \n", num1, num2, resp);
                }
                else
                {
                    printf("Erro: Divisao por zero nao e permitida.\n");
                }
                break;
            }
        }
        else if (funcao == 3)
        {

            printf("Digite um numero inteiro para calcular o fatorial: \n");
            scanf("%d", &numf);

            while (numf < 0)
            {
                printf("Digite num numero valido (POSITIVO) para saber o fatorial dele: ");
                scanf("%d", &numf);
            }

            fatorial = 1;
            for (int i = 1; i <= numf; i++)
            {
                fatorial *= i;
            }
            printf("O fatorial de %d e %d\n", numf, fatorial);
        }

        printf("Deseja realizar outra operacao? (s/n): ");
        scanf(" %c", &continuar);

        limpaTela();

    } while (continuar == 's' || continuar == 'S');

    printf("Programa encerrado.\n");

    return 0;
}
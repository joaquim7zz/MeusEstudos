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

struct produto
{
    int codigo;
    char descricao[50];
    float preco;
    int saldo;
};

int main()
{
    struct produto ficha;

    for (int i = 0; i < 5; i++)
    {
        printf("--------------------------------------- \n");
        printf("PRODUTO %d \n", i + 1);
        printf("Digite o codigo do produto: \n");
        scanf("%d", &ficha.codigo);

        // while (getchar() != '\n'); // Limpa o buffer do teclado

        printf("Digite a decricao do produto: \n");
        // fgets(ficha.descricao, sizeof(ficha.descricao), stdin);
        scanf("%s", ficha.descricao);
        printf("Digite o preco do produto: \n");
        scanf("%f", &ficha.preco);
        printf("Digite o saldo do produto: \n");
        scanf("%d", &ficha.saldo);
        printf("PRODUTO CADASTRADO \n");
        printf("--------------------------------------- \n");

        limpaTela();
    }

    for (int i = 0; i < 5; i++)
    {

        printf("\nProduto %d:\n", i + 1);
        printf("Codigo: %d\n", ficha.codigo);
        printf("Descricao: %s\n", ficha.descricao);
        printf("Preco: %.2f\n", ficha.preco);
        printf("Saldo: %d\n", ficha.saldo);

        printf("--------------------------------------- \n");
    }

    return 0;
}
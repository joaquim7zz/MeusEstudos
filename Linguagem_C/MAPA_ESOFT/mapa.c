#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>
#include <ctype.h>
#include <windows.h> // Padrao Windows

#define maxReservas 30

struct reserva
{
    char nome[50];
    char cpf[15];
    int dia;
    int qtdPessoas;
};

void fazerReserva(struct reserva reservas[], int *totalReservas);
void listarReservas(struct reserva reservas[], int totalReservas);
void totalPessoasPorDia(struct reserva reservas[], int totalReservas);
void exibirMenu();

int main()
{
    // Configuração para aceitar acentuação no console
    setlocale(LC_ALL, "pt_BR.UTF8");
    // Configuração para o console windows aceitar acentuação
    SetConsoleOutputCP(CP_UTF8);
    SetConsoleCP(CP_UTF8);

    struct reserva reservas[maxReservas];
    int totalReservas = 0;
    int opcao;

    do
    {
        system("cls");
        printf("MAPA Linguagen e técnicas de Programação \n");
        printf("=============================================== \n");
        printf("==============SISTEMA DE RESERVAS==============\n");
        exibirMenu(); // Mostra o menu de opções
        scanf("%d", &opcao);

        while (opcao < 1 || opcao > 4)
        {
            system("cls");
            printf("Digite uma opção válida: [1] [2] [3] [4] \n");
            exibirMenu();
            scanf("%d", &opcao);
        }

        switch (opcao)
        {
        case 1:
            fazerReserva(reservas, &totalReservas);
            break;
        case 2:
            listarReservas(reservas, totalReservas);
            break;
        case 3:
            totalPessoasPorDia(reservas, totalReservas);
            break;
        case 4:
            printf("Saindo do programa... \n");
            break;
        }

    } while (opcao != 4);

    return 0;
}

void exibirMenu()
{
    printf("1 - Fazer Reserva \n");
    printf("2 - Listar Reservas \n");
    printf("3 - Total de Pessoas Por dia \n");
    printf("4 - Sair \n");
    printf(" \n");
    printf("Escolha uma opção: \n");
}

void fazerReserva(struct reserva reservas[], int *totalReservas)
{
    if (*totalReservas >= maxReservas)
    {
        printf("Capacidade máxima de reservas atingida! \n");
        system("pause");
        return;
    }

    struct reserva novaReserva;

    printf("Digite o nome do responsável: \n");
    getchar(); // Consome o '\n' residual
    fgets(novaReserva.nome, sizeof(novaReserva.nome), stdin);
    novaReserva.nome[strcspn(novaReserva.nome, "\n")] = '\0';
    printf("Digite o CPF: \n");
    fgets(novaReserva.cpf, sizeof(novaReserva.cpf), stdin);
    novaReserva.cpf[strcspn(novaReserva.cpf, "\n")] = '\0';

    do
    {
        printf("Digite o dia da reserva (1 - Quinta, 2 - Sexta, 3 - Sábado, 4 - Domingo): ");
        scanf("%d", &novaReserva.dia);
        if (novaReserva.dia < 1 || novaReserva.dia > 4)
        {
            printf("Dia inválido. Tente novamente.\n");
        }

    } while (novaReserva.dia < 1 || novaReserva.dia > 4);

    do
    {
        printf("Digite a quantidade de pessoas: \n");
        scanf("%d", &novaReserva.qtdPessoas);

        if (novaReserva.qtdPessoas <= 0 || novaReserva.qtdPessoas > 10)
        {
            printf("Você pode reservar de 1 a 10 cadeiras. Tente novamente.\n");
        }

    } while (novaReserva.qtdPessoas <= 0 || novaReserva.qtdPessoas > 10);

    reservas[*totalReservas] = novaReserva;
    (*totalReservas)++;

    printf("Reserva cadastrada com sucesso! \n");
    system("pause");
}

void listarReservas(struct reserva reservas[], int totalReservas)
{
    char *dias[] = {"", "Quinta", "Sexta", "Sábado", "Domingo"};

    if (totalReservas == 0)
    {
        printf("Não há reservas cadastradas. \n");
    }
    else
    {
        for (int i = 0; i < totalReservas; i++)
        {
            printf("\nNome: %s\n", reservas[i].nome);
            printf("CPF: %s \n", reservas[i].cpf);
            printf("Dia: %s \n", dias[reservas[i].dia]);
            printf("Número de pessoas: %d \n", reservas[i].qtdPessoas);
            printf("===============================\n");
        }
    }
    system("pause");
}

void totalPessoasPorDia(struct reserva reservas[], int totalReservas)
{
    int dia, totalPessoas = 0;

    char *dias[] = {"", "Quinta", "Sexta", "Sábado", "Domingo"};

    printf("Digite o dia para calcular o total de pessoas (1 - Quinta, 2 - Sexta, 3 - Sábado, 4 - Domingo): ");
    scanf("%d", &dia);

    while (dia < 1 || dia > 4)
    {
        system("cls");
        printf("Digite uma opção válida: [1] [2] [3] [4] \n");
        exibirMenu();
        scanf("%d", &dia);
    }

    for (int i = 0; i < totalReservas; i++)
    {
        if (reservas[i].dia == dia)
        {
            totalPessoas += reservas[i].qtdPessoas;
        }
    }

    if (totalPessoas > 0)
    {
        printf("Total de pessoas para o dia %s: %d \n", dias[dia], totalPessoas);
    }
    else
    {
        printf("Não há reservas para este dia.\n");
    }

    system("pause");
}

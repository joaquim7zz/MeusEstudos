#include <stdio.h>

//Par ou impar

int main() {
    int num, rest;
    printf("Digite um numero: \n");
    scanf("%d", &num);
    rest = num % 2;
    if(rest == 0) {
        printf("O numero e par! \n");
    } else {
        printf("O numero e impar \n");
    }
    
}
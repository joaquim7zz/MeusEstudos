#include <stdio.h>

//Maior de dois numeros

int main() {
    int num1, num2;
    printf("Digite o primeiro numero \n");
    scanf("%d", &num1);
    printf("Digite o segundo numero \n");
    scanf("%d", &num2);
    
    if(num1 > num2) {
        printf("o %d e o maior numero", num1);
    } else {
        printf("o %d e o maior numero", num2);
    }
    
    
}
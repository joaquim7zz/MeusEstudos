#include <stdio.h>

//Positivo, negativo ou zero

int main() {
    float num;
    
    printf("Digite um numero \n");
    scanf("%f.2", &num);
    if(num > 0) {
        printf("O numero e positivo! \n");
    } if(num < 0) {
        printf("O numero e negativo! \n");
    } if (num == 0){
        printf("O numero e zero! \n"); 
    } 
    
}
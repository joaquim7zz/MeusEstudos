#include <stdio.h>

int main() {
	int n, i, tempo, menorTempo;

	printf("Digite o numero de corredores: ");
	scanf("%d", &n);

	menorTempo = 100000000;

	while (n <= 0) {
		printf("Digite uma quantidade valida de corredores: \n");
		scanf("%d", &n);
	}

	for ( i = 1; i <= n; i++) {
		printf("Digite o tempo do corredor %d:\n", i);
		scanf("%d", &tempo);

		while(tempo < 0) {
			printf("Digite um tempo valido para o corredor %d: \n", i);
			scanf("%d", &tempo);

		}

		if (tempo < menorTempo) {
			menorTempo = tempo;
			printf("Recorde atualizado: %d segundos. \n", menorTempo);
		}
	}

	printf("O recorde da prova foi de %d segundos", menorTempo);

	return 0;
	
}
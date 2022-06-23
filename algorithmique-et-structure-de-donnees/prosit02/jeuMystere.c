#include <stdio.h>
#include <stdlib.h>
#include <time.h> 

int main() {
	
	int i, mystere, niveau, coup, mystereProposer;
	time_t t1;
	srand((unsigned) time(&t1));
	
	printf("------------Bienvenue au jeu du mystere------------\n");
	printf("------------Veuillez choisir le niveau------------\n");
	printf("------------1: Niveau Facile------------\n");
	printf("------------2: Niveau Moyen------------\n");
	printf("------------0: Quitter------------\n");
	do { scanf("%d", &niveau); } while (niveau < 0 || niveau > 2);
	
	// quitter le programme
	if( niveau == 0 ) {
		printf("Quitter");
		return 0;	
	}
	// niveau 1 ==> le mystére et entre 1 et 100
	else if( niveau == 1 ) {
		printf("Niveau Facile : Le mystere est un nombre entre 0 et 100\n");
		mystere = rand() % 100;
		coup = 15;
	}
	// niveau 2 ==> le mystére et entre 1 et 10000
	else {
		printf("Niveau Moyen : Le mystere est un nombre entre 0 et 10000\n");
		mystere = rand() % 10000;
		coup = 10;
	}
	
	while(coup > 0 && mystereProposer != mystere) {
		printf("Donner le mystere entre ");
		if(niveau == 1) printf("0 et 100\n");
		else printf("0 et 10000\n");
		scanf("%d", &mystereProposer);
		coup--;
		if(mystereProposer == mystere)
			printf("Bravo ! Vous avez gagne au bout de %d tentatives", niveau == 1 ? 15 - coup : 10 - coup);
		else if (mystereProposer > mystere)
			printf("C'est plus, Il vous reste %d tentatives\n", coup);
		else
			printf("C'est moins, Il vous reste %d tentatives\n", coup);
	}
	
	return 0;
}

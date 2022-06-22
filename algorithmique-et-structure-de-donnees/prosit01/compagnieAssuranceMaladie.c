#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void main() {
	
	// déclaration des constants et des variables.
	const float TARIF_COT_BASE_N1 = 1500, TARIF_COT_BASE_N2 = 1800, TARIF_COT_BASE_N3 = 2100;
	const char NIVEAU1_DETAILS[] = "Niveau 1 : details des plafonds de remboursement :\n\tConsultations : 20 DT / acte\n\tMedicaments :   400 DT\n\tAnalyses :      150 DT\n\tRadiologie :    180 DT\n\tChirurgie :     1500 DT\nMaximum de prestations remboursees = 3000 DT par prestataire et par an\n"; 
	const char NIVEAU2_DETAILS[] = "Niveau 2 : details des plafonds de remboursement :\n\tConsultations : 30 DT / acte\n\tMedicaments :   600 DT\n\tAnalyses :      200 DT\n\tRadiologie :    250 DT\n\tChirurgie :     1800 DT\nMaximum de prestations remboursees = 3500 DT par prestataire et par an\n";
	const char NIVEAU3_DETAILS[] = "Niveau 3 : details des plafonds de remboursement :\n\tConsultations : 40 DT / acte\n\tMedicaments :   600 DT\n\tAnalyses :      300 DT\n\tRadiologie :    300 DT\n\tChirurgie :     2000 DT\nMaximum de prestations remboursees = 5000 DT par prestataire et par an\n";
  	int anneeDeNaissance, interventionChirurgicale, arretTravail, depistagePositif, niveauPrestationsChoisissez;
	float poids, taille, budget, imc;
	// affectation la valeur de l'année actuelle à la constante décimale ANNE_ACTUELLE
	time_t t = time(NULL);
	struct tm tm = *localtime(&t);
	const int ANNE_ACTUELLE = tm.tm_year+1900;
	//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	// collection des informations du client
	printf("Veuillez entrer vos donnees \n");
	printf("\tAnnee de naissance : "); scanf("%d", &anneeDeNaissance);
	printf("\tTaille : "); scanf("%f", &taille);
	printf("\tPoids : "); scanf("%f", &poids);
	printf("\tantecedents medicaux :\n");
	printf("\t\tintervention chirurgicale lors des 10 dernieres annees (1 si oui, 0 si non): "); scanf("%d", &interventionChirurgicale);
	printf("\t\tun arret de travail de plus d'un mois lors des 5 dernieres annees (1 si oui, 0 si non) : "); scanf("%d", &arretTravail);
	printf("\t\tdepistage de serologies virales (0 si aucun, 1 si VHA[hepatite A], 2 si VHB[hepatite B],\n\t\t3 si VHC[hepatite C] et 4 si VIH[SIDA]) : ");
	scanf("%d", &depistagePositif);
	printf("\t Budget maximal : "); scanf("%f", &budget);
	printf("...\n");
	//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	// calcul d'indice de masse corporelle (IMC)
	taille /= 100; // le taille en centimètres en doit le transféré en métres pour un calcule imc correct.
	imc = poids / (taille*taille);
	//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	// classment du risque ( faible, moyen ou haut )
	if(depistagePositif > 1 || interventionChirurgicale == 1 || arretTravail == 1) {
		// bloc de code pour la cas d'un client d'haut risque
		printf("Demande d'adhesion rejetee");
	} else if ( (ANNE_ACTUELLE - anneeDeNaissance) > 50 || depistagePositif == 1 || imc < 16.5 || imc > 30 ) {
		// bloc de code pour la cas d'un client à risque moyenne
		printf("Liste des niveaux de prestations possibles : \n");
		if( budget >= (TARIF_COT_BASE_N1 * 1.15) ) 
			printf("\tniveau 1 : maximum de prestations remboursees = 3000 DT par an et par prestataire\n\t\tTarif de cotisation total = %.2f DT.\n", (TARIF_COT_BASE_N1 * 1.15));
		if( budget >= (TARIF_COT_BASE_N2 * 1.15) ) 
			printf("\tniveau 2 : maximum de prestations remboursees = 3500 DT par an et par prestataire\n\t\tTarif de cotisation total = %.2f DT.\n", (TARIF_COT_BASE_N2 * 1.15));
		if( budget >= (TARIF_COT_BASE_N3 * 1.15) ) 
			printf("\tniveau 3 : maximum de prestations remboursées = 5000 DT par an et par prestataire\n\t\tTarif de cotisation total = %.2f DT.\n", (TARIF_COT_BASE_N3 * 1.15));
		printf("\nVeuillez choisir le niveau de prestations souhaite : "); scanf("%d", &niveauPrestationsChoisissez);
		if( (niveauPrestationsChoisissez == 1) && (budget >= (TARIF_COT_BASE_N1 * 1.15)) ) printf(NIVEAU1_DETAILS);
		if( (niveauPrestationsChoisissez == 2) && (budget >= (TARIF_COT_BASE_N2 * 1.15)) ) printf(NIVEAU2_DETAILS);
		if( (niveauPrestationsChoisissez == 3) && (budget >= (TARIF_COT_BASE_N3 * 1.15)) ) printf(NIVEAU3_DETAILS);
	} else {
		// bloc de code pour la cas d'un client à risque faible
		printf("Liste des niveaux de prestations possibles : \n");
		if( budget >= TARIF_COT_BASE_N1 )
			printf("\tniveau 1 : maximum de prestations remboursees = 3000 DT par an et par prestataire\n\t\tTarif de cotisation total = %.2f DT.\n", TARIF_COT_BASE_N1);
		if( budget >= TARIF_COT_BASE_N2 ) 
			printf("\tniveau 2 : maximum de prestations remboursees = 3500 DT par an et par prestataire\n\t\tTarif de cotisation total = %.2f DT.\n", TARIF_COT_BASE_N2);
		if( budget >= TARIF_COT_BASE_N3 ) 
			printf("\tniveau 3 : maximum de prestations remboursees = 5000 DT par an et par prestataire\n\t\tTarif de cotisation total = %.2f DT.\n", TARIF_COT_BASE_N3);
		printf("\nVeuillez choisir le niveau de prestations souhaite : "); scanf("%d", &niveauPrestationsChoisissez);
		if( (niveauPrestationsChoisissez == 1) && ( budget >= TARIF_COT_BASE_N1 ) ) printf(NIVEAU1_DETAILS);
		if( (niveauPrestationsChoisissez == 2) && ( budget >= TARIF_COT_BASE_N2 ) ) printf(NIVEAU2_DETAILS);
		if( (niveauPrestationsChoisissez == 3) && ( budget >= TARIF_COT_BASE_N3 ) ) printf(NIVEAU3_DETAILS);
	}
}
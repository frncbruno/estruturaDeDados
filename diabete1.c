// Exercícios de revisão

// 1 Um diabético tem fator de correção boulus de carboidrato. O sistema precisa solicitar o boulus de correção (dg/ml por carboidrato)
// e a quantidade de carboidrato ingerido. 

// Por exemplo,
// #Entrada
// nome = Alexandre
// boulusAlimentar = 15
// quantidadeInsulinaMaxima dia = 13
// carboidrato = 30g

//Processamento e saída
// quantidadeInsulina = carboidrato / boulus 
// quantidadeMaximaCarboidrato = boulus * quantidadeInsulinaMaxima
// restanteInsulinaDia = quantidadeInsulinaMaxima - quantidadeInsulina 
// restante carboidratoDia = quantidadeMaximaCarboidrato - carboidrato

#include <stdio.h> 
#include <stdlib.h>

int main () {
    
    char nome[100];
    int boulusAlimentar;
    int quantidadeInsulinaMaxima;
    int carboidrato;

    int quantidadeInsulina;
    int quantidadeMaximaCarboidrato;
    int restanteInsulinaDia;
    int restanteCarboidratoDia;



    printf("Ola, informe seus dados\n");
    prinf("Nome: ");
    gets(nome); 

    printf("Boulus alimentar: ");
    scanf("%d", &boulusAlimentar);

    printf("Quantidade de insulina maxima: ");
    scanf("%d", &quantidadeInsulinaMaxima);

    printf("Quantidade de arboidrato ingerido: ");
    scanf("%d", &carboidrato);

    quantidadeInsulina = (int)carboidrato / boulusAlimentar;
    quantidadeMaximaCarboidrato = boulusAlimentar * quantidadeInsulinaMaxima;
    restanteInsulinaDia = quantidadeInsulinaMaxima - quantidadeInsulina;
    restanteCarboidratoDia = quantidadeMaximaCarboidrato - carboidrato;

    printf("Quantidade de insulina para essa refeicao: %d\n", quantidadeInsulina);
    printf("Quatidade maxima de carboidrato dia: %d\n", quantidadeMaximaCarboidrato);
    printf("Ainda restam %d unidades de insulina no dia\n", restanteInsulinaDia);
    printf("Ainda restam %dg de carboidrato no dia\n", restanteCarboidratoDia); 
    
    return 1;
}


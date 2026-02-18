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

#include <iostream> 
#include <cstdlib>
#include <string> 

using name space std;

int main () {
    
    string nome;
    int boulusAlimentar;
    int quantidadeInsulinaMaxima;
    int carboidrato;

    int quantidadeInsulina;
    int quantidadeMaximaCarboidrato;
    int restanteInsulinaDia;
    int restanteCarboidratoDia;



    cout << "Ola, informe seus dados\n";
    
    cout << "Nome: ";
    getline(cin, nome); 

    cout << "Boulus alimentar: ";
    cin >>"%", &boulusAlimentar;

    cout << "Quantidade de insulina maxima: ";
    cin >> "%d", &quantidadeInsulinaMaxima;

    cout << "Quantidade de arboidrato ingerido: ";
    cin >> "%d", &carboidrato;

    quantidadeInsulina = (int)carboidrato / boulusAlimentar;
    quantidadeMaximaCarboidrato = boulusAlimentar * quantidadeInsulinaMaxima;
    restanteInsulinaDia = quantidadeInsulinaMaxima - quantidadeInsulina;
    restanteCarboidratoDia = quantidadeMaximaCarboidrato - carboidrato;

    cout << "Quantidade de insulina para essa refeicao: " << quantidadeInsulina << "\n";
    cout << "Quatidade maxima de carboidrato dia: " << quantidadeMaximaCarboidrato << "\n";
    cout << "Ainda restam " << restanteInsulinaDia << " unidades de insulina no dia: " << "\n";
    cout << "Ainda restam " << restanteCarboidratoDia << " de carboidrato no dia " << "\n"; 
    
    return 1;
}


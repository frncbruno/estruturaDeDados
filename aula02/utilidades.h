#include <cstdlib>
#include <iostream>
#include <string>

using namespace std;

void inicializar(string vetor[]){
    for (int i = 0; i < TAMANHO; i++){
        vetor[i] = "#";
    }
}

int inserir(string nome, string vetor[], int total){
    if (total == TAMANHO){ 
        cout << "Vetor lotado\n";
    } else {
        for (int i = 0; i < TAMANHO; i++){
            if(vetor[i] == "#"){
                vetor[i] = nome;
                total++;
                break;
            }
        }
    }
    return total;
}

void exibir(string vetor[]){
    for (int i = 0; i < TAMANHO; i++){
        if (vetor[i] != "#"){
            cout << vetor[i] << "\n";
        }
    }
    
}

int ondeEsta(string nome, string vetor[]){
    for (int i = 0; i < TAMANHO; i++){
        if (vetor[i] == nome){
            return = i;
            break;
        }else{
            return = -1;
         }
    }
}

    int remover(int posicao, string vetor[], int total){ 
        vetor[posicao] == "#";
        total--;
        return total;


    }

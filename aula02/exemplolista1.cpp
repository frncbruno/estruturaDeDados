#include <cstdlib>
#include <iostream>
#include <string>
#define TAMANHO 10

using namespace std;

#include "utilidades.h"

    int main(){
        string vetorNomes[TAMANHO];
        inicializar(vetorNomes);
        int totalNomesInseridos = 0;

        totalNomesInseridos = inserir("Davi", vetorNomes, totalNomesInseridos);
        totalNomesInseridos = inserir("Eduardo", vetorNomes, totalNomesInseridos);
        totalNomesInseridos = inserir("Gabriel", vetorNomes, totalNomesInseridos);

        if (totalNomesInseridos > 0){
            exibir(vetorNomes);
        } else { 
            cout << "Vetor de nomes vazio\n";
        } 
        

        string nome;
        cout << "Digite um nome: ";
        getline(cin, nome); 

        int posicao;
         posicao = ondeEsta(nome, vetorNomes);

        if (posicao == -1){
            cout << "Nome não encontrado\n";
        } else { 
            totalNomesInseridos = remover(posicao, vetorNomes, totalNomesInseridos);
        }
            exibir(vetorNomes);
        return 1;
    }

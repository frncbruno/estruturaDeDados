#include <iostream>
#include <cstdlib>
#include <vector> //para a lista

using namespace std;

#include "biblioteca.h"

int main() {
        //Declarando uma lista
        vector<int> listaNumeros;

        int quantidadeNumeros;
        int faixaInicial = 10, faixaFinal = 50;
        vector<int> listaResultados;

        cout << "Digite quantos números quer gerar";
        cin >> quantidadeNumeros;

        popularListaAleatoria(listaNumeros, quantidadeNumeros, faixaInicial, faixaFinal);
        exibirLista(listaNumeros);
        copiarListaSemReplicados(listaNumeros, listaResultados);
        exibirLista(listaResultados);
    
        return 1;
}

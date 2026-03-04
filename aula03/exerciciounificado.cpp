#include <iostream>
#include <vector>
#include <ctime>
#include <cstdlib>

using namespace std;

// --- Implementação das Funções ---

void popularListaAleatoria(vector<int> &lista, int quantidadeNumeros, int faixaInicial, int faixaFinal){
    srand(time(NULL));
    for(int i = 0; i < quantidadeNumeros; i++){
        int numeroSorteado = faixaInicial + rand() % (faixaFinal - faixaInicial + 1);
        lista.push_back(numeroSorteado);
    }
}

void exibirLista(vector<int> lista) {
    for (int i = 0; i < lista.size(); i++){
        cout << lista[i] << " ";
    }
    cout << "\nTotal de elementos: " << lista.size() << "\n";
    cout << "---------------------------\n";
}

void copiarListaSemReplicados(vector<int> listaOrigem, vector<int> &listaDestino){
    cout << "\nProcessando lista para remover duplicados...\n";
    for(int item : listaOrigem){
        bool existe = false;
        for(int num : listaDestino){
            if(num == item){
                existe = true;
                break;
            }
        }
        if(!existe){
            listaDestino.push_back(item);
        }
    }
    cout << "Copia concluida!\n";
}

// --- Programa Principal ---

int main() {
    vector<int> listaNumeros;
    vector<int> listaResultados;
    int quantidadeNumeros;
    
    cout << "Digite quantos numeros quer gerar: ";
    cin >> quantidadeNumeros;

    popularListaAleatoria(listaNumeros, quantidadeNumeros, 10, 50);
    
    cout << "\nLista Original:\n";
    exibirLista(listaNumeros);

    copiarListaSemReplicados(listaNumeros, listaResultados);

    cout << "\nLista Sem Repetidos:\n";
    exibirLista(listaResultados);

    return 0;
}

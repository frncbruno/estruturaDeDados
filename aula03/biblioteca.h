#include <iostream>
#include <cstdlib>
#include <vector> //para a lista
#include <ctime>

using namespace std;

/**
 * @brief método que popula uma lista com números inteiros aleatórios dentro de uma faixa
 * 
 * @param lista lista contém os números aleatórios gerados
 * @param quantidadeNumeros contem quantos númeos se deseja inserir na lista
 * @param faixaInicial contém o número inicial da faixa
 * @param faixaFinal contém o número final da faixa
 */
void popularListaAleatoria(vector<int> &lista, int quantidadeNumeros, int faixaInicial, int faixaFinal){
    //observe o simbolo & na frente da variavel lista, isso acontece pq em C++
    // se houver alteracao na lista, é preciso utilizar o simbolo de endereçamento &
        srand(time(NULL));

        int numeroSorteado;

        for(int i = 0; i < quantidadeNumeros; i++){
            numeroSorteado = faixaInicial + rand() % (faixaFinal - faixaInicial + 1);;
            lista.push_back(numeroSorteado);

        }

}

/**
 * @brief método que exibe o conteúdo de uma lista de inteiros, elemento abaixo de elemento
 * 
 * @param lista contém os números inteiros 
 */
void exibirLista(vector<int> lista) {
    for (int i = 0; i < lista.size(); i++){
        cout << lista[i] << "\n";
    }

    cout << "-------------";
    cout << "Total de elementos: " << lista.size() << "\n";
}


/**
 * @brief método que copia os números da lista origem para lista destino, exceto os repetidos
 * 
 * @param listaOrigem contém os números originais da lista
 * @param listaDestino contém os números copiados da lista original sem ser repetidos
 */
void copiarListaSemReplicados(vector <int> listaOrigem, vector<int> &listaDestino){
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
}

// Recursão é um recurso computacional de programação que substitui as instruções de repetição (for-while)
// Toda repetição obedece 3 pontos:
    // 1. Inicialização da variável de controle
    // 2. Teste de parada com a variável de controle
    // 3. Transformação da variável de controle

import java.util.ArrayList;
import java.util.Random;

class Recursao {
    public static void popular(ArrayList<Integer> lista, int quantidade){
        Random gerador = new Random();
        int numero;
        for (int i = 0; i < quantidade; i++){
            numero = gerador.nextInt(100);
            lista.add(numero);
        }
    }

    public static void exibir(ArrayList<Integer> lista){
        // for (Integer i : lista){
        //     System.out.println(i);
        // }

        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }

    public static void exibirR(ArrayList<integer> lista, int n){
        if (n > 0){
            //código antes do empilhamento
            exibirR(lista, n-1);
            //código depois do empilhamento
            System.out.println(lista.get(n-1));
        }
    }

    public static void main (String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(100);
        int quantidade = 3;
        popular(lista, quantidade);
        //exibir(lista);
        exibirR(lista, lista.size());
    }
}

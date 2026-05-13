//Exercicios de fixação sobre o código base gerado:
// 1. receba uma lista, seu tamanho, valor de pesquisa. caso o valor de pesquisa ocorra na lista, retornar quantas vezes ele aparece
// 2. receba uma lista, seu tamanho, valor de pesquisa, valor de substituição. caso o valor ocorra na lista, substituir o valor de pesquisa pelo valor de substiuição
// 3. receba uma lista, seu tamanho e retorne TRUE se a lista ordenada, FALSE se a lista desordenada
// 4. receba uma lista e seu tamanho. o método deve exibir todos os números múltiplos de 4.

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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

    public static void exibirR(ArrayList<Integer> lista, int n){
        if (n > 0){
            //código antes do empilhamento
            exibirR(lista, n-1);
            //código depois do empilhamento
            System.out.println(lista.get(n-1));
        }
    }

    public static void ocorrencias(ArrayList<Integer> lista, int n, int valor){
        if (n > 0){
            ocorrencias(lista, n-1, valor);
            if (lista.get(n-1) == valor){
                System.out.println("Valor encontrado na posição: " + (n-1));
            }
        }
    }

    public static void main (String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        int quantidade = 3;
        popular(lista, quantidade);
        //exibir(lista);
        exibirR(lista, lista.size());

        System.out.print("Digite o valor a ser pesquisado: ");
        int valor = teclado.nextInt();
        ocorrencias(lista, lista.size(), valor);
    }
}

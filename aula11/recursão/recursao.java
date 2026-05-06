//inicializacao da parada de controle - no parametro
// teste de parada - no if
// transformacao - no ponto de recursao

import java.util.ArrayList;

public class Recursao {
    static void mostrarSequenciaCrescente(int numero){
        //variavel de controle: i
        for (int i = 0; i <= numero; i++){
            System.out.println(i);
        }
    }


static void mostrarSequencialDecrescente(int numero){
    //variavel de controle: n
    for(; numero >= 0; numero--){
        System.out.println(numero);
    }
}

static void mostrarSequenciaDecrescenteR(int numero){
    if (numero >= 0){
        System.out.println(numero);
        mostrarSequenciaDecrescenteR(numero - 1); //ponto de recursão
    }
}

static void mostrarSequenciaCrescenteR(int numero){
    if (numero >= 0){
        mostrarSequenciaCrescenteR(numero);
        System.out.println(numero - 1);
    }
}

static void mostrarIntervalo (int ini, int fim){
    for (; ini <= fim; ini++){ //ini está sendo transformado
        System.out.println(ini);
    }
}

static void mostrarIntervaloR (int ini, int fim){
    if (ini <= fim) {
        System.out.println(ini);
        mostrarIntervalo(ini + 1, fim);
    }
}

static void mostrarLista(ArrayList<Integer> lista){
    for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }

static void mostrarListaR(ArrayList<Integer> lista, int n){
    if (n > 0){
        System.out.println(lista.get(n - 1));
        mostrarListaR(lista, n - 1);
    }
}

static void mostrarListaParesR(ArrayList<Integer> lista, int n){
    if (n > 0 ){
        mostrarListaParesR(lista, n - 1);
        if (lista.get(n - 1) % 2 == 0){
            System.out.println(lista.get(n - 1));
        }
    }
}

static void substituirR(ArrayList<Integer> lista, int n,int substuido,int substituto){
    if (n > 0 ){
        substituirR(lista, n - 1, substuido, substituto);
        if (lista.get(n - 1) == substuido ){
            lista.set(n - 1,substituto);
            System.out.println(lista.get(n - 1));
        }
    }
}

public static void main(String[] args){
    int numero = 3;

    // mostrarSequenciaCrescente(numero); 
    // mostrarSequencialDecrescente(numero);
    // mostrarSequenciaDecrescenteR(numero);

    ArrayList<Integer> lista = new ArrayList<>();
    //lista = [20, 30, 40]
    lista.add(21);
    lista.add(30);
    lista.add(43);

    // mostrarLista(lista);
    // mostrarListaR(lista, lista.size());
    // mostrarListaParesR(lista, lista.size());
    substituirR(lista,lista.size(),30,100);
    }
}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Estruturas { 
    public static void gerarProcessos(ArrayList<Processo> lista) {
        int id;
        String descricao;

        Scanner teclado = new Scanner(System.in);
        Random gerador = new Random();
        Processo tmp;
    
    while (true) {
        id = gerador.nextInt(500); //Gera um id aleatório entre 0 e 499
        System.out.print("Digite a descrição do processo: ");
        descricao = teclado.nextLine().toUpperCase(); //Lê a descrição do processo e converte para maiuscula

        if (descricao.equals("SAIR")) {
            break; //Encerra o loop se o usuário digitar "SAIR"
        }

        tmp = new Processo(id, descricao); //Cria um novo processo com o id gerado e a descrição fornecida pelo usuário
        if (!lista.contains(tmp)){ //Verifica se o processo já existe na lista, usando o método equals() da classe Processo
            lista.add(tmp); //Adiciona o processo à lista se ele não existir
        }
    }
    }

    public static void exibirProcessos(ArrayList<Processo> lista){
        System.out.println("Quantidade de processos: "+lista.size());
    
        //Indice de ordenação = descrição
        lista.sort((p1, p2) -> p1.descricao.compareTo(p2.descricao));
        for (Processo p : lista) {
            System.out.println(p);
        }

    }

    public static void localizarProcesso(ArrayList<Processo> lista){
        //Rotina para pesquisar parte da descrição na lista de processos
        String descricao;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite palavra ou expressão que deseja localizar: ");
        descricao = teclado.nextLine().toUpperCase();

        for (Processo p : lista) {
            if (p.descricao.contains(descricao)) { //Verifica se a descrição do processo contém a palavra ou expressão fornecida pelo usuário
                System.out.println(p); //Imprime o processo que contém a palavra ou expressão
            }
        }
    }

    public static void localizarRemover(ArrayList<Processo> lista){
        //Rotina para pesquisar parte da descrição na lista de processos e remover o processo encontrado
        String descricao;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite palavra ou expressão que deseja localizar e remover: ");
        descricao = teclado.nextLine().toUpperCase();

        for (int i = 0; i < lista.size(); i++) {
            Processo p = lista.get(i);
            if (p.descricao.contains(descricao)) { 
                System.out.println("Removendo processo: " + p);
                lista.remove(i); 
                i--; 
            }
        }
    }

    public static void main(String[] args) {
        // List, ArrayList, LinkedList, Vector
        ArrayList<Processo> lista = new ArrayList<>();

        Estruturas.gerarProcessos(lista);
        Estruturas.exibirProcessos(lista);
        Estruturas.localizarProcesso(lista);
        Estruturas.localizarRemover(lista);
        Estruturas.exibirProcessos(lista);
}
} 

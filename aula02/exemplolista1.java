import java.rmi.MarshalException;
import java.util.ArrayList;
import java.util.Scanner;

public class ExemploLista1 {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        String nome;

        listaNomes.add("Maria");
        listaNomes.add("Pedro");
        listaNomes.add("Guilherme");

        System.out.println(listaNomes);

        if(listaNomes.size() != 0) {
            System.out.println("Digite um nome: ");
            nome = teclado.nextLine();
                if(listaNomes.contains(nome)) {
                    listaNomes.remove(nome);
                } else { 
                    System.out.println("Nome não localizado");
                }
            listaNomes.remove(nome);

            System.out.println("Total de elementos..." +listaNomes.size());
            System.out.println(listaNomes);
            
        }
    }
}

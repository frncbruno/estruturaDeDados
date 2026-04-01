import java.util.ArrayList;
import java.util.Stack;
import java.util.LinkedList;

public class Colecoes {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(15);
        lista.add(5);
        lista.add(45);
        lista.sort(null);
        System.out.println(lista);
        lista.remove((Integer)100);
        System.out.println(lista.contains(123));

        Stack<Integer> pilha = new Stack<>();
        pilha.push(15);
        pilha.push(5);
        pilha.push(100);
        pilha.push(45);
        pilha.sort(null);
        System.out.println(pilha.contains(45));

        Queue<Integer> fila = new LinkedList<>();
        fila.add(15);
        fila.add(5);
        fila.add(100);
        fila.add(45);
        System.out.println(fila);

       fila.remove() //remove o 15, porque é o primeiro a entrar
    }

}

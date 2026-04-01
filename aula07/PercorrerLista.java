import java.util.ArrayList;
import java.util.Iterator;
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

        //alternativa 1
        for (int i = 0; i < lista.size(); i++){ 
            System.out.println(lista.get(i));
        }

        //alternativa 2
        for (Integer 1 : lista){
            System.out.println((i));
        }

        //usar para alterar a lista
        Iterator i = lista.iterator();
        while (i = hasNext()){
            System.out.println(i.next());
        }
  }

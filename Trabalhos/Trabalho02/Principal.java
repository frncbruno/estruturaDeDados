import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {

        ArrayList<String> vertices = new ArrayList<>();
        ArrayList<String[]> arestas = new ArrayList<>();

        try (BufferedReader leitor = new BufferedReader(
                new FileReader("mapa.csv", StandardCharsets.UTF_8))) {

            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] partes = linha.split(",");
                String origem  = partes[0].trim();
                String destino = partes[1].trim();

                if (!vertices.contains(origem))  vertices.add(origem);
                if (!vertices.contains(destino)) vertices.add(destino);

                arestas.add(new String[]{origem, destino});
            }

        } catch (Exception e) {
            System.err.println("Ocorreu algum erro... " + e.getMessage());
        }

        Collections.sort(vertices);

        Grafo gAssimetrico = new Grafo(vertices);

        for (String[] aresta : arestas) {
            gAssimetrico.inserirAresta(
                gAssimetrico.pegarIndice(aresta[0]),
                gAssimetrico.pegarIndice(aresta[1])
            );
        }

        gAssimetrico.mostrarMatriz();
        System.out.println();
        gAssimetrico.mostrarGrafo();
    }
}

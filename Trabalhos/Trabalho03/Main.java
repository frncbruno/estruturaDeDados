import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> vertices = new ArrayList<>();

        try {

            BufferedReader br = new BufferedReader(new FileReader("mapa.csv"));

            String linha;

            // Descobrir os vértices
            while ((linha = br.readLine()) != null) {

                String dados[] = linha.split(",");

                String origem = dados[0];
                String destino = dados[1];

                if (!vertices.contains(origem)) {
                    vertices.add(origem);
                }

                if (!vertices.contains(destino)) {
                    vertices.add(destino);
                }
            }

            br.close();

            Grafo g = new Grafo(vertices);

            // Ler novamente para inserir as arestas
            br = new BufferedReader(new FileReader("mapa.csv"));

            while ((linha = br.readLine()) != null) {

                String dados[] = linha.split(",");

                String origem = dados[0];
                String destino = dados[1];
                int custo = Integer.parseInt(dados[2]);

                int i = g.pegarIndice(origem);
                int j = g.pegarIndice(destino);

                g.inserirAresta(i, j, custo);
                g.inserirAresta(j, i, custo); 
            }

            br.close();

            System.out.println("=== GRAFO ===");
            g.mostrarGrafo();

            System.out.println("\n=== MATRIZ ===");
            g.mostrarMatriz();

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

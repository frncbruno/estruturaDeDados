import java.util.ArrayList;

public class Grafo {

    int matrizADJ[][];
    int qtdVertices;
    ArrayList<String> vertices;

    public Grafo(ArrayList<String> vertices) {

        this.vertices = new ArrayList<>();
        this.vertices.addAll(vertices);

        this.qtdVertices = vertices.size();
        this.matrizADJ = new int[qtdVertices][qtdVertices];

        for (int i = 0; i < qtdVertices; i++) {
            for (int j = 0; j < qtdVertices; j++) {
                matrizADJ[i][j] = 0;
            }
        }
    }

    void inserirAresta(int origem, int destino, int custo) {
        matrizADJ[origem][destino] = custo;
    }

    int pegarIndice(String vertice) {
        return vertices.indexOf(vertice);
    }

    void mostrarMatriz() {

        System.out.print("\t");

        for (String v : vertices) {
            System.out.print(v + "\t");
        }

        System.out.println();

        for (int i = 0; i < qtdVertices; i++) {

            System.out.print(vertices.get(i) + "\t");

            for (int j = 0; j < qtdVertices; j++) {
                System.out.print(matrizADJ[i][j] + "\t");
            }

            System.out.println();
        }
    }

    void mostrarGrafo() {

        for (int i = 0; i < qtdVertices; i++) {

            System.out.print(vertices.get(i) + " -> ");

            for (int j = 0; j < qtdVertices; j++) {

                if (matrizADJ[i][j] != 0) {
                    System.out.print(vertices.get(j)
                            + "(" + matrizADJ[i][j] + ") ");
                }
            }

            System.out.println();
        }
    }
}

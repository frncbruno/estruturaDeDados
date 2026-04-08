import java.util.List;

public class Matrizes {
    /**
     * Método de classe que inicializa com zeros a matriz
     * @param m - matriz de inteiro que será inicializada com zeros
     * @param qtdLinhas - quantidade de linhas 
     * @param qtdColunas - quantidade de colunas
     */
    public static void inicializarMatrizInteiro(int m[][], int qtdLinhas, int qtdColunas) {
        for (int lin = 0; lin < qtdLinhas; lin++){
            for (int col = 0; col < qtdColunas; col++){
                m[lin][col] = 0;
            }
        }
    }

    /**
     * método de classe que exibe uma matriz de qualquer tipo
     * @param m - matriz que será exibida
     * @param qtdLinhas - quantidade de linhas
     * @param qtdColunas - quantidade de colunas
     */

    public static void exibirMatriz(int m[][], int qtdLinhas, int qtdColunas){
        for (int lin = 0; lin < qtdLinhas; lin++){
            for (int col = 0; col < qtdColunas; col++){
                System.out.print(m[lin][col] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * método de classe que recebe uma matriz com muitos valores nulos e a converte para uma lista de matrizes especiais
     * @param m - matriz com valores nulos ou sua maioria
     * @param qtdLinhas - quantidade de linhas
     * @param qtdColunas - quantidade de colunas
     * @param lista - lista que armazenará os valores não nulos da matriz
     */

    public static void converter(int m[][], int qtdLinhas, int qtdColunas, List<Dado> lista) {
        for (int lin = 0; lin < qtdLinhas; lin++){
            for (int col = 0; col < qtdColunas; col++){
                if(matriz[lin][col] != 0) {
                    lista.add(new Dado(matriz[lin][col], lin, col));
                }
            }
        }
    }

    /**
     * método de classe que exibe o conteúdo de uma lista de tipo Dado
     * @param lista - contém os dados
     */

    public static void exibirLista(List<Dado> lista){
        for (Dado item : lista) {
            System.err.println(item);
        }
        System.out.println("Total de elementos não nulos: "+lista.size());
    }
}

package figurinhas;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    static final String ARQ_REPETIDAS = "figuras_repetidas_pessoais.csv";
    static final String ARQ_DESEJADAS = "figuras_desejadas_pessoais.csv";

    // ARVORES PRINCIPAIS
    static TreeSet<Figura> repetidas = new TreeSet<>();
    static TreeSet<Figura> desejadas = new TreeSet<>();

    public static void main(String[] args) {

        // CARREGA OS DADOS DOS ARQUIVOS
        GerenciadorCsv.carregar(ARQ_REPETIDAS, repetidas);
        GerenciadorCsv.carregar(ARQ_DESEJADAS, desejadas);

        Scanner sc = new Scanner(System.in);

        int opcao;

        // MENU PRINCIPAL
        do {

            System.out.println("\n===== ALBUM DA COPA =====");
            System.out.println("1 - Adicionar repetidas");
            System.out.println("2 - Ver repetidas");
            System.out.println("3 - Adicionar desejadas");
            System.out.println("4 - Ver desejadas");
            System.out.println("5 - Ler repetidas de outra pessoa");
            System.out.println("6 - Ler desejadas de outra pessoa");
            System.out.println("7 - Sair");
            System.out.print("Escolha: ");

            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {

                case 1:
                    cadastrar(sc, repetidas, ARQ_REPETIDAS);
                    break;

                case 2:
                    mostrar(repetidas);
                    break;

                case 3:
                    cadastrar(sc, desejadas, ARQ_DESEJADAS);
                    break;

                case 4:
                    mostrar(desejadas);
                    break;

                case 5:
                    procurarTrocas(sc, desejadas);
                    break;

                case 6:
                    procurarTrocas(sc, repetidas);
                    break;

                case 7:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 7);

        sc.close();
    }

    // ADICIONA UMA NOVA FIGURINHA
    public static void cadastrar(Scanner sc, TreeSet<Figura> arvore, String arquivo) {

        System.out.print("Selecao: ");
        String selecao = sc.nextLine();

        System.out.print("Numero da figurinha: ");
        int numero = Integer.parseInt(sc.nextLine());

        System.out.print("Nome do jogador ou descricao: ");
        String descricao = sc.nextLine();

        System.out.print("Quantidade: ");
        int quantidade = Integer.parseInt(sc.nextLine());

        System.out.print("E rara? (s/n): ");
        boolean rara = sc.nextLine().equalsIgnoreCase("s");

        // CRIA A FIGURINHA
        Figura figura = new Figura(selecao, numero, descricao, quantidade, rara);

        // ADICIONA NA ARVORE
        if (arvore.add(figura)) {

            // SALVA NO CSV
            GerenciadorCsv.salvar(arquivo, figura);

            System.out.println("Figurinha salva.");

        } else {

            System.out.println("Essa figurinha ja foi cadastrada.");
        }
    }

    // MOSTRA TODAS AS FIGURINHAS
    public static void mostrar(TreeSet<Figura> arvore) {

        if (arvore.isEmpty()) {

            System.out.println("Lista vazia.");
            return;
        }

        // PERCORRE A ARVORE
        for (Figura f : arvore) {

            System.out.println(f);
        }

        System.out.println("Total: " + arvore.size());
    }

    // PROCURA FIGURINHAS PARA TROCA
    public static void procurarTrocas(Scanner sc, TreeSet<Figura> minhasFiguras) {

        System.out.print("Digite o caminho do arquivo CSV: ");
        String caminho = sc.nextLine();

        TreeSet<Figura> outraPessoa = GerenciadorCsv.carregarOutro(caminho);

        if (outraPessoa.isEmpty()) {

            System.out.println("Arquivo vazio ou nao encontrado.");
            return;
        }

        System.out.println("\nPossiveis trocas:");

        boolean encontrou = false;

        // VERIFICA SE EXISTE NAS MINHAS FIGURINHAS
        for (Figura f : outraPessoa) {

            if (minhasFiguras.contains(f)) {

                System.out.println(f);
                encontrou = true;
            }
        }

        if (!encontrou) {

            System.out.println("Nenhuma figurinha em comum encontrada.");
        }
    }
}

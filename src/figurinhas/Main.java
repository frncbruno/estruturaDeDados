package figurinhas;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    static final String ARQ_REPETIDAS  = "figuras_repetidas_pessoais.csv";
    static final String ARQ_DESEJADAS  = "figuras_desejadas_pessoais.csv";

    // Árvores binárias de busca (TreeSet) — conforme Aula 14
    static TreeSet<Figura> arvore_repetidas_pessoais = new TreeSet<>();
    static TreeSet<Figura> arvore_desejadas_pessoais = new TreeSet<>();

    public static void main(String[] args) {

        // Ao iniciar: popula as árvores a partir dos CSVs pessoais
        GerenciadorCsv.carregar(ARQ_REPETIDAS, arvore_repetidas_pessoais);
        GerenciadorCsv.carregar(ARQ_DESEJADAS, arvore_desejadas_pessoais);

        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\n===== FIGURINHAS COPA 2026 =====");
            System.out.println("1 - Cadastrar figuras repetidas pessoais");
            System.out.println("2 - Listar figuras repetidas pessoais");
            System.out.println("3 - Cadastrar figuras desejadas pessoais");
            System.out.println("4 - Listar figuras desejadas pessoais");
            System.out.println("5 - Carregar figuras repetidas OUTRO (match com minhas desejadas)");
            System.out.println("6 - Carregar figuras desejadas OUTRO (match com minhas repetidas)");
            System.out.println("7 - Sair");
            System.out.print("Opção: ");

            opcao = Integer.parseInt(sc.nextLine().trim());

            switch (opcao) {
                case 1 -> cadastrarFigura(sc, arvore_repetidas_pessoais, ARQ_REPETIDAS, "repetidas");
                case 2 -> listarArvore(arvore_repetidas_pessoais, "REPETIDAS PESSOAIS");
                case 3 -> cadastrarFigura(sc, arvore_desejadas_pessoais, ARQ_DESEJADAS, "desejadas");
                case 4 -> listarArvore(arvore_desejadas_pessoais, "DESEJADAS PESSOAIS");
                case 5 -> carregarOutroEMatch(sc, "repetidas", arvore_desejadas_pessoais);
                case 6 -> carregarOutroEMatch(sc, "desejadas", arvore_repetidas_pessoais);
                case 7 -> System.out.println("Até logo!");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 7);

        sc.close();
    }

    // ------------------------------------------------------------------ //
    // Opções 1 e 3 — Cadastro
    // ------------------------------------------------------------------ //
    static void cadastrarFigura(Scanner sc, TreeSet<Figura> arvore, String arquivo, String tipo) {
        System.out.println("\n--- Cadastrar figura " + tipo + " ---");
        System.out.print("Seleção: ");
        String selecao = sc.nextLine().trim();

        System.out.print("Número da figurinha: ");
        int numero = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Descrição (jogador / brasão / bandeira): ");
        String descricao = sc.nextLine().trim();

        System.out.print("Quantidade: ");
        int quantidade = Integer.parseInt(sc.nextLine().trim());

        System.out.print("É rara? (s/n): ");
        boolean rara = sc.nextLine().trim().equalsIgnoreCase("s");

        Figura figura = new Figura(selecao, numero, descricao, quantidade, rara);

        // add na TreeSet (árvore binária de busca — conforme Aula 14)
        if (arvore.add(figura)) {
            GerenciadorCsv.salvar(arquivo, figura);
            System.out.println("Figurinha cadastrada com sucesso!");
        } else {
            System.out.println("Figurinha já existe na árvore (mesma seleção e número).");
        }
    }

    // ------------------------------------------------------------------ //
    // Opções 2 e 4 — Listagem (percurso LERD = infixado = for-each no TreeSet)
    // ------------------------------------------------------------------ //
    static void listarArvore(TreeSet<Figura> arvore, String titulo) {
        System.out.println("\n--- " + titulo + " ---");
        if (arvore.isEmpty()) {
            System.out.println("Nenhuma figurinha cadastrada.");
            return;
        }
        // Percurso infixado (LERD) — exibição em ordem crescente, conforme Aula 14
        for (Figura f : arvore) {
            System.out.println(f);
        }
        System.out.println("Total: " + arvore.size() + " figurinha(s).");
    }

    // ------------------------------------------------------------------ //
    // Opções 5 e 6 — Carregar arquivo do outro e mostrar matches
    // ------------------------------------------------------------------ //
    static void carregarOutroEMatch(Scanner sc, String tipo, TreeSet<Figura> arvoreReferencia) {
        System.out.print("\nCaminho do arquivo CSV do outro (ex: C:\\Users\\...\\figuras_" + tipo + "_outro.csv): ");
        String caminho = sc.nextLine().trim();

        TreeSet<Figura> arvoreOutro = GerenciadorCsv.carregarOutro(caminho);

        if (arvoreOutro.isEmpty()) {
            System.out.println("Arquivo vazio ou não encontrado.");
            return;
        }

        System.out.println("\n--- Figurinhas " + tipo.toUpperCase() + " do OUTRO ---");
        // Percurso infixado — exibição em ordem (Aula 14)
        for (Figura f : arvoreOutro) {
            System.out.println(f);
        }

        // Match: verifica quais figuras do outro estão na minha árvore de referência
        // arvore.contains() = percurso pré-fixado (LRED) — conforme Aula 14
        System.out.println("\n--- MATCHES (figuras que combinam para troca) ---");
        boolean achou = false;
        for (Figura f : arvoreOutro) {
            if (arvoreReferencia.contains(f)) { // contains = pré-fixado na árvore
                System.out.println("  MATCH >> " + f);
                achou = true;
            }
        }
        if (!achou) {
            System.out.println("  Nenhum match encontrado.");
        }
    }
}

package figurinhas;

import java.io.*;
import java.util.TreeSet;

public class GerenciadorCsv {

    // Carrega um CSV e popula um TreeSet
    public static void carregar(String arquivo, TreeSet<Figura> arvore) {
        File f = new File(arquivo);
        if (!f.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                linha = linha.trim();
                if (!linha.isEmpty()) {
                    arvore.add(Figura.fromCsv(linha)); // add na TreeSet = árvore binária de busca
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar " + arquivo + ": " + e.getMessage());
        }
    }

    // Persiste (append) uma figura no CSV
    public static void salvar(String arquivo, Figura figura) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true))) {
            bw.write(figura.toCsv());
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao salvar em " + arquivo + ": " + e.getMessage());
        }
    }

    // Carrega CSV de outra pessoa e retorna uma TreeSet temporária
    public static TreeSet<Figura> carregarOutro(String arquivo) {
        TreeSet<Figura> arvore = new TreeSet<>();
        carregar(arquivo, arvore);
        return arvore;
    }
}

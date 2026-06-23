package figurinhas;

// GUARDA OS DADOS DE UMA FIGURINHA
public class Figura implements Comparable<Figura> {

    private String selecao;
    private int numero;
    private String descricao;
    private int quantidade;
    private boolean rara;

    public Figura(String selecao, int numero, String descricao, int quantidade, boolean rara) {
        this.selecao = selecao;
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.rara = rara;
    }

    // DEFINE A ORDEM DAS FIGURINHAS
    @Override
    public int compareTo(Figura outra) {

        if (!selecao.equalsIgnoreCase(outra.selecao)) {
            return selecao.compareToIgnoreCase(outra.selecao);
        }

        return numero - outra.numero;
    }

    // TRANSFORMA A FIGURINHA EM TEXTO PARA SALVAR NO CSV
    public String toCsv() {
        return selecao + ";" + numero + ";" + descricao + ";" + quantidade + ";" + rara;
    }

    // CRIA UMA FIGURINHA A PARTIR DE UMA LINHA DO CSV
    public static Figura fromCsv(String linha) {

        String[] dados = linha.split(";");

        return new Figura(
                dados[0],
                Integer.parseInt(dados[1]),
                dados[2],
                Integer.parseInt(dados[3]),
                Boolean.parseBoolean(dados[4]));
    }

    // MOSTRA A FIGURINHA NA TELA
    @Override
    public String toString() {

        String texto = selecao + " - " + numero + " - " + descricao + " (qtd: " + quantidade + ")";

        if (rara) {
            texto += " [RARA]";
        }

        return texto;
    }
}

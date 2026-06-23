package figurinhas;

public class Figura implements Comparable<Figura> {

    private String nomeSelecao;
    private int numeroFigura;
    private String descricao;
    private int quantidade;
    private boolean rara;

    public Figura(String nomeSelecao, int numeroFigura, String descricao, int quantidade, boolean rara) {
        this.nomeSelecao = nomeSelecao;
        this.numeroFigura = numeroFigura;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.rara = rara;
    }

    // TreeSet usa compareTo para ordenar e para equals interno
    @Override
    public int compareTo(Figura outra) {
        int cmp = this.nomeSelecao.compareToIgnoreCase(outra.nomeSelecao);
        if (cmp != 0) return cmp;
        return Integer.compare(this.numeroFigura, outra.numeroFigura);
    }

    // CSV: nomeSelecao;numeroFigura;descricao;quantidade;rara
    public String toCsv() {
        return nomeSelecao + ";" + numeroFigura + ";" + descricao + ";" + quantidade + ";" + rara;
    }

    public static Figura fromCsv(String linha) {
        String[] p = linha.split(";");
        return new Figura(p[0], Integer.parseInt(p[1]), p[2], Integer.parseInt(p[3]), Boolean.parseBoolean(p[4]));
    }

    @Override
    public String toString() {
        return String.format("[%s #%d] %s  qtd:%d%s",
                nomeSelecao, numeroFigura, descricao, quantidade, rara ? " *RARA*" : "");
    }

    public String getNomeSelecao() { return nomeSelecao; }
    public int getNumeroFigura()   { return numeroFigura; }
    public String getDescricao()   { return descricao; }
    public int getQuantidade()     { return quantidade; }
    public boolean isRara()        { return rara; }
}

public class Splitar {
    public static void main(String[] args) {
        String linha = "120,11/03/2025,9:00";
        String vetorLinha[] = linha.split(",");

        Glicemia obj = new Glicemia(Integer.parseInt(vetorLinha[0]), vetorLinha[1], vetorLinha[2]);

        System.out.println(obj.valor + " - " + obj.data + " - " + obj.hora);
    }
}

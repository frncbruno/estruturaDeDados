public class Processo {
    public int id; //atributo 
    public String descricao; //atributo 
    
    public Processo(int id, String descricao) {
        this.id = id; //construtor
        this.descricao = descricao; //construtor
    }

    //Identificar a chave primária
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Processo other = (Processo) obj;
        if (id != other.id) //Identifica ID
            return false;
        return true;
    }

    //Para dizer como definir um objeto 
    @Override
    public String toString() {
        return "Processo [id=" + id + ", descricao=" + descricao + "]";
    }
}

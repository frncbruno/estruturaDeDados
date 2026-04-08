// Estruturas de Dados
//   - Físicas: as próprias variáveis - fortemente dependentes da linguagem de programação
//   - Abstratas: os algoritmos de gestão de memória (COLEÇÕES)
//     - Lista: conjunto de dados ordenados (não obrigatoriamente)
//       - todas as operações: inserir, remover, buscar, atualizar (Create, Retrive, Update, Delete - CRUD)
//       - foco no armazenamento, busca e relatórios

//     - Pilha: dados organizados pelo topo - LIFO (Last In, First Out)
//       - há duas operações: inserir no topo e o remover do topo
//       - foco no dado que está no topo

//     - Fila: dados organizados pela chegada - FIFO (First In, First Out)
//       - há dois ponteiros: início/cabeça para o remover e o fim/cauda para o inserir
//       - foco na prioridade de chegada, ou seja, o dado mais importante é o que está no início ou cabeça

//   COLEÇÕES de objetos
//     Na classe, há os métodos:
//       - toString()
//       - equals() - chave primária

import java.util.List;
import java.util.ArrayList;

public class Util {
  /**
     * método que recebe CPF por string e retorna true se é válido, ou false caso contrário
     * @paran cpf - número identificador da pessoa física
     * @return true se cpf válido
     */
  
  public static boolean cpfValido(String cpf) {
    return true;
    } 
}

class Aluno {
  public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
  
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        java other = (java) obj;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return "java [nome=" + nome + ", cpf=" + cpf + "]";
    }
}

publi class Exemplo { 
  public static void main(String[] args) {
    List<Aluno> alunos = new ArrayList;
    Scanner teclado = new Scanner (System.in);

    String cpf, nome;
    Aluno alunoTMP;

  do {
    do {
      System.out.print("Digite o CPF: ");
      cpf = teclado.nextLine().toUpperCase();
      if (cpf.equals("FIM")) {
        alunos.sort((a1, a2) -> a1.getNome().compareTo(a2.getNome()));
        
        System.out.println("Alunos cadastrados: ");
          for (Aluno a : alunos) {
            System.out.println(a);
          } 
        System.exit(1);
      } 

      if (Util.cpfValido(cpf)){
        break;
      } else { 
      System.out.println("CPF inválido!")
        } 
      } while(true);

      System.out.print("Nome: );
      nome = teclado.nextLine().toLowerCase();

      alunoTMP = new Aluno(cpf, nome);
      if (!alunos.contains(alunoTMP)) {
      alunos.add(alunoTMP);
      } else {
        System.ou.prinln("Aluno com este CPF já cadastrado");
      } 
    } while(true);
  } 
} 
    
  





No proecsso de herança:
LISTA -> PILHA -> FILA


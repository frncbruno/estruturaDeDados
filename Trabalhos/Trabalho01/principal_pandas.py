# Este código pode desconsiderar para avaliação, mas é um jeito que eu faria em condições normais podendo usar libs (como o Pandas, nesse caso). 

import pandas as pd

try:
    df = pd.read_csv("alunos.csv", header=None)
  
    df.columns = ["Nome", "Curso", "Sexo", "AnoIngresso"]

    df_ordenado = df.sort_values(by="AnoIngresso") #se quisesse, poderia ordenar pelo nome usando df.sort_values(by="Nome")

    print("Lista ordenada por ano:")
    print(df_ordenado)

    #busca o nome
    nome_busca = input("\nDigite o nome: ")

    resultado = df[df["Nome"] == nome_busca]
  
    if not resultado.empty:
        print("Aluno encontrado:")
        print(resultado)
    else:
        print("Aluno não encontrado")

    #contagem dos alunos
    contagem = df["AnoIngresso"].value_counts()

    print("\nAlunos por ano:")
    print(contagem)

except Exception as e:
    print("Erro:", e)

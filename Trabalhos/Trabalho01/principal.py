from aluno import Aluno

lista = []
nome_arquivo = "alunos.csv"

try:
    leitor = open(nome_arquivo, "r", encoding="utf-8")

    for linha in leitor:
        dados = linha.strip().split(",")

        aluno = Aluno(dados[0], dados[1], dados[2], dados[3])
        lista.append(aluno)

    leitor.close()

    lista.sort(key=lambda x: x.ano_ingresso)

    print("Lista ordenada por ano:")
    for a in lista:
        print(a)

    nome_busca = input("\nDigite o nome exato: ")
    encontrado = False

    for a in lista:
        if a.nome == nome_busca:
            print("Aluno encontrado:")
            print(a)
            encontrado = True

    if not encontrado:
        print("Aluno não encontrado")

    contagem = {}

    for a in lista:
        if a.ano_ingresso not in contagem:
            contagem[a.ano_ingresso] = 0
        contagem[a.ano_ingresso] += 1

    print("\nAlunos por ano:")
    for ano, qtd in contagem.items():
        print(f"{ano}: {qtd}")

except Exception as e:
    print("Erro:", e)

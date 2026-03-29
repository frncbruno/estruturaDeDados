from clima import Clima

lista = []
nome_base = "base.csv"

try:
    leitor = open(nome_base, "r", encoding="utf-8")

    for linha in leitor:
        dados_linha = linha.split(",")
        obj_clima = Clima(dados_linha[0], dados_linha[1], dados_linha[2], dados_linha[3])

        if obj_clima not in lista:
            lista.append(obj_clima)

    leitor.close()

    contagem = {}

    for item in lista:
        if item.temperatura == "Quente":
            if item.mes not in contagem:
                contagem[item.mes] = 0
            contagem[item.mes] += 1
            
    mes_mais_quente = ""
    maior_contagem = 0

    for mes, qtd in contagem.items():
        if qtd > maior_contagem:
            maior_contagem = qtd
            mes_mais_quente = mes

    print(f"Mês mais quente: {mes_mais_quente} ({maior_contagem} vezes)")

except Exception as e:
    print("Ocorreu algum erro...", e)

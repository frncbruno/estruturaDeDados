from clima import Clima  # importa a classe Clima que está no arquivo clima.py

lista = []  # cria uma lista vazia que vai guardar os objetos Clima
nome_base = "base.csv"  # guarda o nome do arquivo que vamos ler

try:  # tenta executar o código abaixo, se der erro vai pro "except"
    leitor = open(nome_base, "r", encoding="utf-8")  # abre o arquivo CSV em modo leitura ("r")

    for linha in leitor:  # passa por cada linha do arquivo, uma por vez
        dados_linha = linha.split(",")  # separa a linha nas vírgulas, virando uma lista (ex: ["2020", "Janeiro", "Quente", "muita"])
        obj_clima = Clima(dados_linha[0], dados_linha[1], dados_linha[2], dados_linha[3])  # cria um objeto Clima com os 4 dados da linha.

        if obj_clima not in lista:  # verifica se esse objeto já está na lista (usa o __eq__ da classe)
            lista.append(obj_clima)  # se não estiver, adiciona o objeto na lista

    leitor.close()  # fecha o arquivo depois de terminar a leitura

    contagem = {}  # cria um dicionário vazio — vai guardar cada mês e quantas vezes foi "Quente"

    for item in lista:  # passa por cada objeto Clima da lista
        if item.temperatura == "Quente":  # verifica se a temperatura daquele registro é "Quente"
            if item.mes not in contagem:  # verifica se o mês ainda não foi adicionado ao dicionário
                contagem[item.mes] = 0  # se não foi, cria a entrada do mês com valor 0
            contagem[item.mes] += 1  # soma 1 na contagem daquele mês

    mes_mais_quente = ""  # variável que vai guardar o nome do mês vencedor (começa vazia)
    maior_contagem = 0  # variável que vai guardar a maior contagem encontrada (começa em 0)

    for mes, qtd in contagem.items():  # passa por cada par (mês, quantidade) do dicionário
        if qtd > maior_contagem:  # verifica se a quantidade desse mês é maior que a maior encontrada até agora
            maior_contagem = qtd  # se sim, atualiza a maior contagem
            mes_mais_quente = mes  # e salva o nome desse mês como o mais quente

    print(f"Mês mais quente: {mes_mais_quente} ({maior_contagem} vezes)")  # exibe o resultado final

except Exception as e:  # se qualquer erro acontecer no bloco "try"...
    print("Ocorreu algum erro...", e)  # ...exibe uma mensagem com o erro

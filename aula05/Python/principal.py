from clima import Clima
lista = []

nome_base = "base.csv"

try: 
    #abrindo o arquivo no modo leitura
    leitor = open(nome_base, "r", encoding = "utf-8")

    #passando pelo arquivo linha a linha e tratando os objetos da linha
    for linha in leitor:
        dados_linha = linha.split(",")
        obj_clima = Clima(dados_linha[0], dados_linha[1], dados_linha[2], dados_linha[3])
        
        if obj_clima not in lista:
          lista.append(obj_clima)

    #exibindo a lista
    for item in lista:
        print(item)

    #fechando o arquivo
    leitor.close()

except Exception as e:
    print("Ocorreu algum erro...", e)

#lista = []

# primeira linha
# linha = "2020,Janeiro,Quente,muita"
# dados_linha = linha.split(",")

# obj_clima = Clima(dados_linha[0], dados_linha[1], dados_linha[2], dados_linha[3])

# if obj_clima not in lista:
#     lista.append(obj_clima)

# #segunda linha
# linha = "2020,Janeiro,Frio,pouca"
# dados_linha = linha.split(",")

# obj_clima = Clima(dados_linha[0], dados_linha[1], dados_linha[2], dados_linha[3])

# if obj_clima not in lista:
#     lista.append(obj_clima)

# for c in lista:
#     print(c)

lista_nomes = []

#adicionar nomes na lista
lista_nomes.append("Guilherme")
lista_nomes.append("Bruno")
lista_nomes.append("Leonardo")

#exibir a lista inteira
print(lista_nomes)

#remover um nome da lista
nome = input("Digite um nome: ")

if len(lista_nomes) != 0:
    if lista_nomes.__contains__(nome):
        lista_nomes.remove(nome)
    else:
        print(nome, "não está na lista")
        
print(lista_nomes)

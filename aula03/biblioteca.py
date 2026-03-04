import random

def popular_lista_aleatoria(lista, quantidade, faixa_inicial, faixa_final):
    """método que popula uma lista com números inteiros e aleatórios detro de uma faixa

    Args:
        lista (int): armazena numeros inteirs e aleatorios
        quantidade (int): total de números inteiros a serem inseridos
        faixa_inicial (int): número inicial da faixa
        faixa_final (int): número final da faixa
    """

    for i in range(quantidade):
        lista.append( random.randint(faixa_inicial, faixa_final) )

def exibir_lista(lista):
    """método que recebe uma lista e a exibe, elementos um abaixo do outro

    Args: 
        lista (int): lista contendo numeros inteiros
    """
    for item in lista:
        print(item)
    
    print("-----------")
    print("Total de elementos: ", len(lista))

def copiar_lista_sem_replicados(lista_origem, lista_destino):
    """método que copia o conteúdo da lista origem para dentro da lista destino, retirando os replicados

    Args:
        lista_origem (int): lista original contendo todos os numeros
        lista_destino (int): lista final contendo somente os numeros nao replicados
    """

    for item in lista_origem:
        if item not in lista_destino:
            lista_destino.append(item)
    

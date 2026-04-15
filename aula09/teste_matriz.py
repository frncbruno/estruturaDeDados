import Matriz from Matriz

dimensao = 10
matriz = [[0 for _ in range(dimensao)] for _ in range(dimensao)] #preenchendo a matriz com 0

#gerando uma matriz especial

matriz[2][4] = 1
matriz[4][6] = 1
matriz[7][1] = 1
matriz[8][3] = 1

Matriz.exibir_matriz(matriz, dimensao, dimensao)

lista_especial = []

Matriz.converter_matriz(matriz, dimensao, dimensao, lista_especial)
Matriz.exibir_lista(lista_especial)

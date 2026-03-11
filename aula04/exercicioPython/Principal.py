from Glicemia import Glicemia
from minhas_funcoes import popular_lista_arquivo, exibir_lista, calcular_media

lista = []
nome_base = "dados.csv"

popular_lista_arquivo(lista, nome_base)
exibir_lista(lista)

media = calcular_media(lista)
print("Média glicêmica: ", media)

mediana = calcular_mediana(lista)
print("Mediana glicêmica: ", mediana)

# obj = Glicemia (191, "11/03/2026", "9:00")
# lista.append( obj )

# lista.append( Glicemia(98, "11/03/2026", "11:00"))

# for i in range(3):
#         valor = int(input("Valor glicemia: "))
#         data = input("Data [dd/mm/aaaa]: ")
#         hora = input("Hora [hh:mm]: ")

#         lista.append(Glicemia(valor, data, hora))

# for item in lista:
#     print(f"{item.valor} - {item.data} - {item.hora}")



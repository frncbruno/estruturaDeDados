class Clima:  # define a classe Clima — é o "molde" para criar objetos climáticos
    def __init__(self, ano, mes, temperatura, precipitacao):  # método construtor — é chamado automaticamente ao criar um objeto Clima
        self.ano = ano  # salva o ano dentro do objeto
        self.mes = mes  # salva o mês dentro do objeto
        self.temperatura = temperatura  # salva a temperatura dentro do objeto
        self.precipitacao = precipitacao  # salva a precipitação dentro do objeto

    def __str__(self):  # define o que aparece quando você dá print() no objeto
        return f"Dados climaticos: Ano:{self.ano}. Mes:{self.mes}. Temperatura:{self.temperatura}. Precipitacao:{self.precipitacao}"  # retorna os dados formatados como texto

    def __eq__(self, object):  # define quando dois objetos Clima são considerados iguais
        return self.ano == object.ano and self.mes == object.mes  # dois objetos são iguais se tiverem o mesmo ano E o mesmo mês

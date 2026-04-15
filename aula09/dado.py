class Dado:
            
    def __init__(self, valor, linha, coluna):
        self.valor = valor
        self.linha = linha
        self.coluna = coluna 

    def __eq__(self, other):
        if isinstance(other, Dado):
            return self.linha == other.linha and self.coluna == other.coluna
        return False
    
    def __str__(self):
        return f"Valor={self.valor} na posicao={self.linha},{self.coluna}"

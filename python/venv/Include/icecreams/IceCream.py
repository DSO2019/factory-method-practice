#Clase IceCream para que puedan heredar
class IceCream():

    #Sabor del helado
    def setFlavor(self, flavor):
        self.flavor = flavor

    #Obtenerlo al llamarlo
    def getFlavor(self):
        return self.flavor
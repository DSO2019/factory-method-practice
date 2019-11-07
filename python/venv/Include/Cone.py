#Clase cono que implementa todo
class Cone():

    def prepare(self):
        print("Preparing ice cream for the customer")

    def addIceCream(self, selectedIceCream):
        self.iceCream = selectedIceCream
        print("Adding " + self.iceCream.getFlavor())

    def serve(self):
        print("Serving icecream to the customer")

    def getFlavor(self):
        return self.iceCream
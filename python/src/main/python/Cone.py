

class Cone():

    def prepare(self):
        print("Preparing ice cream")

    def addIceCream(self, selectedIceCream):
        self.iceCream = selectedIceCream
        print("Preparing " + self.iceCream.getFlavor() + " ice cream.")

    def serve(self):
        print("Serving cone")

    def getIceCream(self):
        return self.iceCream

class Cone:

    def prepare(self):
        print('Prepare cone...')

    def addIceCream(self, newIceCream):
        self.iceCream = newIceCream
        print('Adding  ' + self.iceCream.getFlavor() + ' to cone.')

    def serve(self):
        print('Serving...')

    def getIceCream(self):
        return self.iceCream

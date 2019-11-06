from Cone import *
from icecreams.IceCream import *

class IceCreamStore():

    def createIceCream(self, flavor):
        pass

    def prepareCone(self, flavor):
        iceCream = self.createIceCream(flavor)
        cone = Cone()
        cone.prepare()
        cone.addIceCream(iceCream)
        cone.serve()
        return cone

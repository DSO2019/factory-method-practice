from Cone import *
from IceCream import *
import abc


class IceCreamStore:

    def createIceCream(self, flavor):
        pass

    def prepareCone(self, base, flavor):
        iceCream = IceCream()
        cone = Cone()
        cone.prepare()
        iceCream = self.createIceCream(flavor)
        cone.addIceCream(iceCream)
        cone.serve()
        return cone

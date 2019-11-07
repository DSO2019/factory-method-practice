from abc import ABC
from Cone import *
from icecream.IceCream import *


class IceCreamStore(ABC):

    def createIceCream(self, flavor):
        pass

    def prepareCone(self, flavor):
        iceCream = IceCream()
        cone = Cone()
        cone.prepare()
        iceCream = self.createIceCream(flavor)
        cone.addIceCream(iceCream)
        cone.serve()
        return cone

from abc import ABC
from .Cone import *
from .icecreams.IceCream import *

class IceCreamStore(ABC):

    def iceCreamFlavor(self, flavor):
        pass

    def prepareCone(self, flavor):
        iceCream = IceCream()
        cone = Cone()
        cone.prepare()
        iceCream = self.iceCreamFlavor(flavor)
        cone.addIceCream(iceCream)
        cone.serve()

        return cone


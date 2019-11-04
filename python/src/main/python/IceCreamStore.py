from abc import ABC, abstractmethod
from Cone import *

class IceCreamStore(ABC):

    @abstractmethod
    def createIceCream(flavor):
        pass

    def prepareCone(flavor):
        cone = Cone()

        cone.prepare() 
        iceCream = self.createIceCream(flavor)
        cone.addIceCream(iceCream)
        cone.serve()
        return cone

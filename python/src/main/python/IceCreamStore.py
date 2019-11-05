from abc import ABC, abstractmethod
from Cone import *

class IceCreamStore(ABC):

    def __init__(self):
        pass

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

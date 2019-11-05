from IceCreamStore import *
from icecreams.yougurt import *


class MilkIceCreamStore(IceCreamStore):

    def createIceCream(flavor):
        if flavor == "Strawberry":
            return StrawberryYougurtIceCream()
        else if flavor == "Pineapple":
            return PineappleYougurtIceCream()
        else if flavor == "Mango":
            return MangoYougurtIceCream()
        else if flavor == "Guava":
            return GuavaYougurtIceCream()

        return None

    def prepareCone(flavor):
        super().prepareCone(flavor)

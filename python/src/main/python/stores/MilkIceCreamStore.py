from icecream.milk.GuavaMilkIceCream import *
from icecream.milk.MangoMilkIceCream import *
from icecream.milk.PineappleMilkIceCream import *
from icecream.milk.StrawberryMilkIceCream import *
from IceCreamStore import *


class MilkIceCreamStore(IceCreamStore):
    def createIceCream(self, flavor):
        if (flavor == "Strawberry"):
            return StrawberryMilkIceCream()
        elif (flavor == "Pineapple"):
            return PineappleMilkIceCream()
        elif (flavor == "Mango"):
            return MangoMilkIceCream()
        elif (flavor == "Guava"):
            return GuavaMilkIceCream()
        return None

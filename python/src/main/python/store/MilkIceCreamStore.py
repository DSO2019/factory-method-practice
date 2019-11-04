from icecream.milk.GuavaMilkIceCream import *
from icecream.milk.MangoMilkIceCream import *
from icecream.milk.PineappleMilkIceCream import *
from icecream.milk.StrawberryMilkIceCream import *
from IceCreamStore import *


class MilkIceCreamStore(IceCreamStore):
    def createIceCream(self, selectedFlavor):
        if (selectedFlavor == "Strawberry"):
            return StrawberryMilkIceCream()
        elif (selectedFlavor == "Pineapple"):
            return PineappleMilkIceCream()
        elif (selectedFlavor == "Mango"):
            return MangoMilkIceCream()
        elif (selectedFlavor == "Guava"):
            return GuavaMilkIceCream()
        return None
